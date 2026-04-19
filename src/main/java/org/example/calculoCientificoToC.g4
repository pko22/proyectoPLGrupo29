grammar calculoCientificoToC;

/*
Un programa está compuesto por cuatro partes:
la zona de declaraciones de constantes y variables(dcllist)
la zona de declaración de funciones y procedimientos (cabecera)
la zona de sentencias del programa principal (sentlist)
la zona de implementación de funciones y procedimientos(subproglist).
*/

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
            System.err.println("Error sintactico: El nombre del programa no coincide (" + $id1.text + " vs " + $id2.text + ")");
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
            System.err.println("Error sintactico: El nombre en la cabecera de la subrutina no coincide (" + $id1.text + " vs " + $id2.text + ")");
            System.exit(1); // Aborta
        }
        $res = "void " + $id1.text + "(" + subprogramasUtils.generarFirmaC() + ");\n";
    }
    ;

decfun returns [String res] :
    'FUNCTION' id1=IDENT { subprogramasUtils.iniciar($id1.text); } '(' nomparamlist ')' tipo '::' id2=IDENT ';' dec_f_paramlist 'END' 'FUNCTION' id3=IDENT
    {
        if(!$id1.text.equals($id3.text)) {
            System.err.println("Error sintactico: El nombre en la cabecera de la funcion no coincide (" + $id1.text + " vs " + $id3.text + ")");
            System.exit(1); // Aborta
        }
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

dec_s_paramlist : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';' { subprogramasUtils.asignarTipo($IDENT.text); } dec_s_paramlist | ;
dec_f_paramlist : tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';' { subprogramasUtils.asignarTipo($IDENT.text); } dec_f_paramlist | ;

tipoparam : 'IN' | 'OUT' | 'INOUT';

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
            // Si es una variable normal, armamos la asignación
            $res = "\t" + $IDENT.text + " = " + $sent_AUX.res + ";\n";
        }
    }
    | proc_call ';' { $res = "\t" + $proc_call.res + ";\n"; }
    ;

sent_AUX returns [String res] :
    '=' exp ';' { $res = $exp.res; } // Devolvemos solo la expresión limpia hacia arriba
    ;

proc_call returns [String res]
    : 'CALL' IDENT subpparamlist { $res = $IDENT.text + $subpparamlist.res; }
    ;

subpparamlist returns [String res]
    : '(' exp explist ')' { $res = "(" + $exp.res + $explist.res + ")"; }
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
    | IDENT factor_AUX { $res = $IDENT.text + $factor_AUX.res; }
    ;

factor_AUX returns [String res] :
    '(' exp explist ')' { $res = "(" + $exp.res + $explist.res + ")"; }
    | { $res = ""; }
    ;

explist returns [String res]
    : ',' exp explist { $res = ", " + $exp.res + $explist.res; }
    | { $res = ""; }
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
        if(!$id1.text.equals($id3.text)) System.err.println("Error sintactico: El nombre de la funcion no coincide en el cierre (" + $id1.text + " vs " + $id3.text + ")");
        $res = $tipo.res + " " + $id1.text + "(" + subprogramasUtils.generarFirmaC() + ") {\n" + $declaracion_mixta_f_list.res + $sentlist.res + "}\n";
    }
    ;
codproc returns [String res] :
    'SUBROUTINE' id1=IDENT { subprogramasUtils.iniciar($id1.text); } formal_paramlist declaracion_mixta_list sentlist 'END' 'SUBROUTINE' id2=IDENT
    {
        if(!$id1.text.equals($id2.text)) System.err.println("Error sintactico: El nombre de la subrutina no coincide en el cierre (" + $id1.text + " vs " + $id2.text + ")");
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
mixta_f_comma_factor : 'INTENT' '(' 'IN' ')' IDENT ';' { subprogramasUtils.asignarTipo($IDENT.text); } | 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' ;

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
mixta_comma_factor : 'INTENT' '(' tipoparam ')' IDENT ';' { subprogramasUtils.asignarTipo($IDENT.text); } | 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' ;


/*
Tanto en la declaración de subprogramas (decproc y decfun) como en su implementación
(codproc y codfun) la declaración de parámetros formales (dec_s_paramlist y
dec_f_paramlist) se debe realizar en el mismo orden que se mencionan en la cabecera
(nomparamlist)
*/

// --- COMPONENTES LÉXICOS ---
IDENT : [a-zA-Z] [a-zA-Z0-9_]* ;
NUM_INT_CONST: '-'? [0-9]+;
NUM_REAL_CONST: PUNTO_FIJO | EXPONENECIAL | MIXTO;
STRING_CONST: '\'' ('\'\'' | ~['] )* '\'' | '"' ('""' | ~["] )* '"';
WS : [ \t\r\n]+ -> skip ;
COMMENT : '!' ~[\n\r]* -> skip ;

fragment PUNTO_FIJO: NUM_INT_CONST '.' [0-9]+;
fragment EXPONENECIAL: NUM_INT_CONST [eE] NUM_INT_CONST;
fragment MIXTO: PUNTO_FIJO [eE] NUM_INT_CONST;