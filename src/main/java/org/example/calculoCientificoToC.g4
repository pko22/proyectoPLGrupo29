grammar calculoCientificoToC;

/*
Un programa está compuesto por cuatro partes:
la zona de declaraciones de constantes y variables(dcllist)
la zona de declaración de funciones y procedimientos (cabecera)
la zona de sentencias del programa principal (sentlist)
la zona de implementación de funciones y procedimientos(subproglist).
*/
@header {
import org.example.variablesUtils;
import org.example.subprogramasUtils;
}
@members {
    // Clase de apoyo para gestionar la lógica de traducción de las variables y constantes
    variablesUtils utils = new variablesUtils();

    // Clase de apoyo para gestionar la lógica de traducción de las funciones y procedimientos
    subprogramasUtils subprogramasUtils = new subprogramasUtils();
}

// --- REGLA INICIAL ---
prg returns [String res] :
    'PROGRAM' id1=IDENT ';' dcllist cabecera sentlist 'END' 'PROGRAM' id2=IDENT subproglist
    {
        if(!$id1.text.equals($id2.text)) {
            System.err.println("Error [Línea " + $id2.getLine() + ", Columna " + $id2.getCharPositionInLine() +
                               "]: Posible causa: El nombre del programa en el cierre ('" + $id2.text +
                               "') no coincide con el de apertura ('" + $id1.text + "').");
            System.exit(1); // Aborta la ejecución para NO generar el fichero .c
        }
        $res = utils.getDefines() + $cabecera.res + $subproglist.res +
               "\nvoid main (void) {\n" +
               $dcllist.res +
               $sentlist.res +
               "}\n";
    }
    ;

// --- ZONA DE DECLARACIONES ---

dcllist returns [String res] :
    dcl dcllist { $res = $dcl.res + $dcllist.res; }
    | { $res = ""; }
    ;

dcl returns [String res]:
    tipo dcl_AUX
    {
         // Si dcl_AUX no devolvió nada, significa que era una constante (defcte)
        // En ese caso, dcl no debe devolver el tipo al main.
        if ($dcl_AUX.res.equals("")) {
             $res = "";
        } else {
            $res = "\t" + $tipo.res + " " + $dcl_AUX.res;
        }
    }
    ;

dcl_AUX returns [String res] :
    defcte { $res = ""; } // Las constantes no devuelven texto al main
    | defvar { $res = $defvar.res; } // Las variables sí
    ;

defcte returns [String res]:
    ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';'
    {
        utils.addDefine($IDENT.text, $simpvalue.res);
        $res = $ctelist.res;
    }
    ;

ctelist returns [String res]
    : ',' IDENT '=' simpvalue ctelist
      {
        utils.addDefine($IDENT.text, $simpvalue.res);
        $res = $ctelist.res;
      }
    | { $res = ""; }
    ;

defvar returns [String res] :
    '::' varlist ';' { $res = $varlist.res + ";\n"; }
    ;

varlist returns [String res] :
    IDENT init varlist_AUX
    {
        $res = $IDENT.text + utils.getDimActual() + $init.res + $varlist_AUX.res;
    }
    ;

varlist_AUX returns [String res] :
    ',' IDENT init varlist_AUX
    {
        $res = ", " + $IDENT.text + utils.getDimActual() + $init.res + $varlist_AUX.res;
    }
    | { $res = ""; }
    ;

init returns [String res] :
    '=' simpvalue { $res = " = " + $simpvalue.res; }
    | { $res = ""; }
    ;

tipo returns [String res]
    : 'INTEGER'   { $res = "int"; utils.setDimActual(""); subprogramasUtils.setTipoActual("int"); }
    | 'REAL'      { $res = "float"; utils.setDimActual(""); subprogramasUtils.setTipoActual("float"); }
    | 'CHARACTER' charlength { $res = "char"; utils.setDimActual($charlength.res); subprogramasUtils.setTipoActual("char"); }
    ;

charlength returns [String res]
    : '(' NUM_INT_CONST ')' { $res = "[" + $NUM_INT_CONST.text + "]"; }
    | { $res = ""; }
    ;

simpvalue returns [String res]
     : NUM_INT_CONST  { $res = $NUM_INT_CONST.text; }
     | NUM_REAL_CONST { $res = $NUM_REAL_CONST.text; }
     | STRING_CONST   { $res = utils.normalizarString($STRING_CONST.text); }
     | NUM_INT_CONST_B { $res = "0b" + $NUM_INT_CONST_B.text.substring(2, $NUM_INT_CONST_B.text.length()-1); }
     | NUM_INT_CONST_O { $res = "0o" + $NUM_INT_CONST_O.text.substring(2, $NUM_INT_CONST_O.text.length()-1); }
     | NUM_INT_CONST_H { $res = "0x" + $NUM_INT_CONST_H.text.substring(2, $NUM_INT_CONST_H.text.length()-1); }
     ;

// --- ZONA DE CABECERA (INTERFACE) ---
cabecera returns [String res] :
    'INTERFACE' cablist 'END' 'INTERFACE' { $res = $cablist.res; }
    | { $res = ""; }
    ;

cablist returns [String res] :
    decproc decsubprog { $res = $decproc.res + $decsubprog.res; }
    | decfun decsubprog  { $res = $decfun.res + $decsubprog.res; }
    ;

decsubprog returns [String res] :
    decproc decsubprog { $res = $decproc.res + $decsubprog.res; }
    | decfun decsubprog  { $res = $decfun.res + $decsubprog.res; }
    | { $res = ""; }
    ;

decproc returns [String res] :
    'SUBROUTINE' id1=IDENT { subprogramasUtils.iniciar($id1.text); } formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' id2=IDENT
    {
        if(!$id1.text.equals($id2.text)) {
            System.err.println("Error [Línea " + $id2.getLine() + ", Columna " + $id2.getCharPositionInLine() +
                               "]: Posible causa: El nombre de la subrutina en el cierre de la cabecera ('" + $id2.text +
                               "') no coincide con su declaración ('" + $id1.text + "').");
            System.exit(1);
        }
        subprogramasUtils.validarParametros();
        $res = "void " + $id1.text + "(" + subprogramasUtils.generarFirmaC() + ");\n";
    }
    ;

decfun returns [String res] :
    'FUNCTION' id1=IDENT { subprogramasUtils.iniciar($id1.text); } '(' nomparamlist ')' tipo '::' id2=IDENT ';' dec_f_paramlist 'END' 'FUNCTION' id3=IDENT
    {
        if(!$id1.text.equals($id3.text)) {
            System.err.println("Error [Línea " + $id3.getLine() + ", Columna " + $id3.getCharPositionInLine() +
                               "]: Posible causa: El nombre de la funcion en el cierre de la cabecera ('" + $id3.text +
                               "') no coincide con su declaración ('" + $id1.text + "').");
            System.exit(1);
        }
        if(!$id1.text.equals($id2.text)) {
            System.err.println("Error [Línea " + $id2.getLine() + ", Columna " + $id2.getCharPositionInLine() +
                               "]: Posible causa: El identificador de la variable de retorno ('" + $id2.text +
                               "') no coincide con el nombre de la funcion ('" + $id1.text + "').");
            System.exit(1);
        }
        subprogramasUtils.validarParametros();
        $res = $tipo.res + " " + $id1.text + "(" + subprogramasUtils.generarFirmaC() + ");\n";
    }
    ;

formal_paramlist returns [String res] :
    '(' nomparamlist ')' { $res = "(" + $nomparamlist.res + ")"; }
    | { $res = "(void)"; }
    ;

nomparamlist returns [String res] :
    IDENT { subprogramasUtils.registrarParametro($IDENT.text); } nomparamlist_AUX
    { $res = $IDENT.text + $nomparamlist_AUX.res; }
    | { $res = ""; }
    ;

nomparamlist_AUX returns [String res] :
    ',' IDENT { subprogramasUtils.registrarParametro($IDENT.text); } nomparamlist_AUX
    { $res = ", " + $IDENT.text + $nomparamlist_AUX.res; }
    | { $res = ""; }
    ;

dec_s_paramlist : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';' { subprogramasUtils.asignarTipoYModo($IDENT.text, $tipoparam.res); } dec_s_paramlist | ;
dec_f_paramlist : tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';' { subprogramasUtils.asignarTipoYModo($IDENT.text, "IN"); } dec_f_paramlist | ;


tipoparam returns [String res]
    : 'IN'    { $res = "IN"; }
    | 'OUT'   { $res = "OUT"; }
    | 'INOUT' { $res = "INOUT"; }
    ;
// --- ZONA DE SENTENCIAS ---
sentlist returns [String res] :
    sent sentlist_AUX { $res = $sent.res + $sentlist_AUX.res; }
    | { $res = ""; }
    ;

sentlist_AUX returns [String res] :
    sent sentlist_AUX { $res = $sent.res + $sentlist_AUX.res; }
    | { $res = ""; }
    ;

sent returns [String res] :
    IDENT sent_AUX
    {
        if (subprogramasUtils.esReturn($IDENT.text)) {
            // Si es la función actual, armamos el return
            $res = "\treturn " + $sent_AUX.res + ";\n";
        } else {
           // Comprobamos si es un parámetro por referencia para inyectar '*'
           String prefijo = subprogramasUtils.esParametroReferencia($IDENT.text) ? "*" : "";
           $res = "\t" + prefijo + $IDENT.text + " = " + $sent_AUX.res + ";\n";
        }
    }
    | proc_call ';' { $res = "\t" + $proc_call.res + ";\n"; }

    // --- NUEVAS SENTENCIAS DE CONTROL DE FLUJO ---
    | 'IF' '(' expcond ')' if_tail
    {
        $res = "\tif (" + $expcond.res + ") " + $if_tail.res;
    }
    | 'DO' do_tail
    {
        $res = "\t" + $do_tail.res;
    }
    | 'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT'
    {
        $res = "\tswitch (" + $exp.res + ") {\n" + $casos.res + "\t}\n";
    }
    ;


// Reglas auxiliares para el IF (Factorización)
if_tail returns [String res] :
    sent { $res = "\n\t" + $sent.res; } // IF de una sola línea
    | 'THEN' sentlist if_else_tail
    {
        $res = "{\n" + $sentlist.res.replace("\t","\t\t") + $if_else_tail.res;
    }
    ;

if_else_tail returns [String res] :
    'ENDIF' { $res = "\t}\n"; }
    | 'ELSE' sentlist 'ENDIF' { $res = "\t} else {\n" + $sentlist.res.replace("\t","\t\t") + "\t}\n"; }
    ;

// Reglas auxiliares para el DO (Factorización)
do_tail returns [String res] :
    'WHILE' '(' expcond ')' sentlist 'ENDDO'
    {
        $res = "while (" + $expcond.res + ") {\n" + $sentlist.res.replace("\t","\t\t") + "\t}\n";
    }
    | IDENT '=' ini=doval ',' limite=doval ',' inc=doval sentlist 'ENDDO'
    {
        $res = "for(" + $IDENT.text + " = " + $ini.res + "; " + $IDENT.text + " != " + $limite.res + "; " + $IDENT.text + " = " + $IDENT.text + " + " + $inc.res + ") {\n" + $sentlist.res.replace("\t","\t\t") + "\t}\n";
    }
    ;

doval returns [String res] :
    NUM_INT_CONST { $res = $NUM_INT_CONST.text; }
    | IDENT { $res = $IDENT.text; }
    ;


// --- REGLAS AUXILIARES PARA SELECT CASE ---
casos returns [String res] :
    'CASE' '(' etiquetas ')' sentlist casos
    {
        // Añadimos el break; a todos los casos normales
        $res = $etiquetas.res + $sentlist.res.replace("\t", "\t\t\t") + "\t\t\tbreak;\n" + $casos.res;
    }
    | 'CASE' 'DEFAULT' sentlist
    {
        // El caso por defecto no lleva break;
        $res = "\t\tdefault:\n" + $sentlist.res.replace("\t", "\t\t\t");
    }
    | { $res = ""; }
    ;

etiquetas returns [String res] :
    ':' simpvalue
    {
        $res = "\t\tcase < " + $simpvalue.res + ":\n";
    }
    | simpvalue eti_tail[$simpvalue.res]
    {
        $res = $eti_tail.res;
    }
    ;

// Recibe el primer valor para evitar ambiguedad y ser LL(1)
eti_tail [String val] returns [String res] :
    listaetiquetas
    {
        $res = "\t\tcase " + $val + ":\n" + $listaetiquetas.res;
    }
    | ':' simpvalue
    {
        $res = "\t\tcase " + $val + " to " + $simpvalue.res + ":\n";
    }
    | ':'
    {
        $res = "\t\tcase > " + $val + ":\n";
    }
    ;

listaetiquetas returns [String res] :
    ',' simpvalue listaetiquetas
    {
        $res = "\t\tcase " + $simpvalue.res + ":\n" + $listaetiquetas.res;
    }
    | { $res = ""; }
    ;


sent_AUX returns [String res] :
    '=' exp ';' { $res = $exp.res; } // Devolvemos solo la expresión limpia hacia arriba
    ;

proc_call returns [String res]
    : 'CALL' IDENT { subprogramasUtils.iniciarLlamada($IDENT.text); } subpparamlist
    {
        $res = $IDENT.text + $subpparamlist.res;
        subprogramasUtils.finalizarLlamada();
    }
    ;

subpparamlist returns [String res]
    : '(' { String pref = subprogramasUtils.procesarArgumento(); } exp explist ')'
      { $res = "(" + pref + $exp.res + $explist.res + ")"; }
    | { $res = "()"; }
    ;

// --- EXPRESIONES ---
exp returns [String res] :
    termino exp_AUX { $res = $termino.res + $exp_AUX.res; }
    ;

exp_AUX returns [String res] :
    operador_sumas termino exp_AUX
    { $res = " " + $operador_sumas.res + " " + $termino.res + $exp_AUX.res; }
    | { $res = ""; }
    ;

operador_sumas returns [String res]: '+' { $res="+"; } | '-' { $res="-"; } ;

termino returns [String res] :
    factor termino_AUX { $res = $factor.res + $termino_AUX.res; }
    ;

termino_AUX returns [String res] :
    operador_multiplicaciones factor termino_AUX
    { $res = " " + $operador_multiplicaciones.res + " " + $factor.res + $termino_AUX.res; }
    | { $res = ""; }
    ;

operador_multiplicaciones returns [String res]: '*' { $res="*"; } | '/' { $res="/"; } ;

factor returns [String res] :
    simpvalue { $res = $simpvalue.res; }
    | '(' exp ')' { $res = "(" + $exp.res + ")"; }
    | IDENT { subprogramasUtils.iniciarLlamada($IDENT.text); } factor_AUX
    {
        subprogramasUtils.finalizarLlamada();
        if ($factor_AUX.res.isEmpty()) {
            // Es una variable simple, inyectamos '*' si es necesario
            String prefijo = subprogramasUtils.esParametroReferencia($IDENT.text) ? "*" : "";
            $res = prefijo + $IDENT.text;
        } else {
            // Es una llamada a función
            $res = $IDENT.text + $factor_AUX.res;
        }
    }
    ;

factor_AUX returns [String res] :
    '(' { String pref = subprogramasUtils.procesarArgumento(); } exp explist ')'
    { $res = "(" + pref + $exp.res + $explist.res + ")"; }
    | { $res = ""; }
    ;

explist returns [String res]
    : ',' { String pref = subprogramasUtils.procesarArgumento(); } exp explist
      { $res = ", " + pref + $exp.res + $explist.res; }
    | { $res = ""; }
    ;

// --- EXPRESIONES CONDICIONALES ---
expcond returns [String res] :
    factorcond expcond_AUX { $res = $factorcond.res + $expcond_AUX.res; }
    ;

expcond_AUX returns [String res] :
    oplog factorcond expcond_AUX { $res = " " + $oplog.res + " " + $factorcond.res + $expcond_AUX.res; }
    | { $res = ""; }
    ;

oplog returns [String res] :
    OP_OR   { $res = "||"; }
    | OP_AND  { $res = "&&"; }
    | OP_EQV  { $res = "=="; }
    | OP_NEQV { $res = "!="; }
    ;

factorcond returns [String res] :
    e1=exp opcomp e2=exp { $res = $e1.res + " " + $opcomp.res + " " + $e2.res; }
    | '(' expcond ')' { $res = "(" + $expcond.res + ")"; }
    | OP_NOT factorcond { $res = "!" + $factorcond.res; }
    | TRUE_CONST { $res = "1"; }
    | FALSE_CONST { $res = "0"; }
    ;

opcomp returns [String res] :
    '<'  { $res = "<"; }
    | '>'  { $res = ">"; }
    | '<=' { $res = "<="; }
    | '>=' { $res = ">="; }
    | '==' { $res = "=="; }
    | '/=' { $res = "!="; }
    ;





// --- IMPLEMENTACIÓN DE SUBPROGRAMAS ---
subproglist returns [String res] :
    codproc subproglist { $res = $codproc.res + "\n" + $subproglist.res; }
    | codfun subproglist { $res = $codfun.res + "\n" + $subproglist.res; }
    | { $res = ""; }
    ;

codfun returns [String res] :
    'FUNCTION' id1=IDENT { subprogramasUtils.iniciar($id1.text); } '(' nomparamlist ')' tipo '::' id2=IDENT ';' declaracion_mixta_f_list sentlist 'END' 'FUNCTION' id3=IDENT
    {
        if(!$id1.text.equals($id3.text)) {
            System.err.println("Error [Línea " + $id3.getLine() + ", Columna " + $id3.getCharPositionInLine() +
                               "]: Posible causa: El nombre de la funcion en el cierre de la implementacion ('" + $id3.text +
                               "') no coincide con su declaración ('" + $id1.text + "').");
            System.exit(1);
        }
        if(!$id1.text.equals($id2.text)) {
            System.err.println("Error [Línea " + $id2.getLine() + ", Columna " + $id2.getCharPositionInLine() +
                               "]: Posible causa: El identificador de la variable de retorno en la implementacion ('" + $id2.text +
                               "') no coincide con el nombre de la funcion ('" + $id1.text + "').");
            System.exit(1);
        }
        subprogramasUtils.validarParametros();
        $res = $tipo.res + " " + $id1.text + "(" + subprogramasUtils.generarFirmaC() + ") {\n" + $declaracion_mixta_f_list.res + $sentlist.res + "}\n";
    }
    ;
codproc returns [String res] :
    'SUBROUTINE' id1=IDENT { subprogramasUtils.iniciar($id1.text); } formal_paramlist declaracion_mixta_list sentlist 'END' 'SUBROUTINE' id2=IDENT
    {
        if(!$id1.text.equals($id2.text)){
            System.err.println("Error [Línea " + $id2.getLine() + ", Columna " + $id2.getCharPositionInLine() +
                               "]: Posible causa: El nombre de la subrutina en el cierre de la implementacion ('" + $id2.text +
                               "') no coincide con su declaración ('" + $id1.text + "').");
            System.exit(1);
        }
        subprogramasUtils.validarParametros();
        $res = "void " + $id1.text + "(" + subprogramasUtils.generarFirmaC() + ") {\n" + $declaracion_mixta_list.res + $sentlist.res + "}\n";
    }
    ;

declaracion_mixta_f_list returns [String res] :
    tipo mixta_f_AUX declaracion_mixta_f_list
    {
        // Si mixta_f_AUX es un parámetro, devuelve vacío. Si es una variable, unimos tipo + variable.
        if ($mixta_f_AUX.res.equals("")) {
            $res = $declaracion_mixta_f_list.res;
        } else {
            $res = "\t" + $tipo.res + " " + $mixta_f_AUX.res + $declaracion_mixta_f_list.res;
        }
    }
    | { $res = ""; }
    ;
mixta_f_AUX returns [String res] :
    ',' mixta_f_comma_factor { $res = ""; } // Es un parámetro, no genera texto aquí
    | defvar { $res = $defvar.res; }        // Es variable local, pasamos su texto
    ;
mixta_f_comma_factor : 'INTENT' '(' 'IN' ')' IDENT ';' { subprogramasUtils.asignarTipoYModo($IDENT.text, "IN"); } | 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' ;

declaracion_mixta_list returns [String res] :
    tipo mixta_AUX declaracion_mixta_list
    {
        if ($mixta_AUX.res.equals("")) {
            $res = $declaracion_mixta_list.res;
        } else {
            $res = "\t" + $tipo.res + " " + $mixta_AUX.res + $declaracion_mixta_list.res;
        }
    }
    | { $res = ""; }
    ;
mixta_AUX returns [String res] :
    ',' mixta_comma_factor { $res = ""; }   // Es un parámetro, no genera texto aquí
    | defvar { $res = $defvar.res; }        // Es variable local, pasamos su texto
    ;
mixta_comma_factor : 'INTENT' '(' tipoparam ')' IDENT ';' { subprogramasUtils.asignarTipoYModo($IDENT.text, $tipoparam.res); } | 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' ;


/*
Tanto en la declaración de subprogramas (decproc y decfun) como en su implementación
(codproc y codfun) la declaración de parámetros formales (dec_s_paramlist y
dec_f_paramlist) se debe realizar en el mismo orden que se mencionan en la cabecera
(nomparamlist)
*/

// --- COMPONENTES LÉXICOS ---
IDENT : [a-zA-Z] [a-zA-Z0-9_]* ;
NUM_INT_CONST: '-'? [0-9]+;

// --- NUEVAS BASES DE NUMEROS DE PARTE OPCIONAL---
NUM_INT_CONST_B : 'b\'' [01]+ '\'';
NUM_INT_CONST_O : 'o\'' [0-7]+ '\'';
NUM_INT_CONST_H : 'z\'' [0-9a-fA-F]+ '\'';

// --- OPERADORES Y CONSTANTES LÓGICAS ---
TRUE_CONST  : '.TRUE.' ;
FALSE_CONST : '.FALSE.' ;
OP_OR       : '.OR.' ;
OP_AND      : '.AND.' ;
OP_EQV      : '.EQV.' ;
OP_NEQV     : '.NEQV.' ;
OP_NOT      : '.NOT.' ;

NUM_REAL_CONST: PUNTO_FIJO | EXPONENECIAL | MIXTO;
STRING_CONST: '\'' ('\'\'' | ~['] )* '\'' | '"' ('""' | ~["] )* '"';
WS : [ \t\r\n]+ -> skip ;
COMMENT : '!' ~[\n\r]* -> skip ;

fragment PUNTO_FIJO: NUM_INT_CONST '.' [0-9]+;
fragment EXPONENECIAL: NUM_INT_CONST [eE] NUM_INT_CONST;
fragment MIXTO: PUNTO_FIJO [eE] NUM_INT_CONST;