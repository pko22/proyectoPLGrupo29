grammar calculoCientificoToC;

/*
Un programa está compuesto por cuatro partes:
la zona de declaraciones de constantes y variables(dcllist)
la zona de declaración de funciones y procedimientos (cabecera)
la zona de sentencias del programa principal (sentlist)
la zona de implementación de funciones y procedimientos(subproglist).
*/

@members {
    // Clase de apoyo para gestionar la lógica de traducción
    TraductorUtils utils = new TraductorUtils();
}

// --- REGLA INICIAL ---
prg returns [String res] :
    'PROGRAM' id1=IDENT ';' dcllist cabecera sentlist 'END' 'PROGRAM' id2=IDENT subproglist
    {
        // El orden según el enunciado: Defines -> Cabeceras -> Subprogramas -> Main [cite: 185, 255]
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
    : 'INTEGER'   { $res = "int"; utils.setDimActual(""); }
    | 'REAL'      { $res = "float"; utils.setDimActual(""); }
    | 'CHARACTER' charlength { $res = "char"; utils.setDimActual($charlength.res); }
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
    'SUBROUTINE' id1=IDENT formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' id2=IDENT
    { $res = "void " + $id1.text + $formal_paramlist.res + ";\n"; }
    ;

decfun returns [String res] :
    'FUNCTION' id1=IDENT '(' nomparamlist ')' tipo '::' id2=IDENT ';' dec_f_paramlist 'END' 'FUNCTION' id3=IDENT
    { $res = $tipo.res + " " + $id1.text + "(" + $nomparamlist.res + ");\n"; }
    ;

formal_paramlist returns [String res] :
    '(' nomparamlist ')' { $res = "(" + $nomparamlist.res + ")"; }
    | { $res = "(void)"; }
    ;

nomparamlist returns [String res] :
    IDENT nomparamlist_AUX { $res = $IDENT.text + $nomparamlist_AUX.res; }
    | { $res = ""; }
    ;

nomparamlist_AUX returns [String res] :
    ',' IDENT nomparamlist_AUX { $res = ", " + $IDENT.text + $nomparamlist_AUX.res; }
    | { $res = ""; }
    ;

dec_s_paramlist : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';' dec_s_paramlist | ;
dec_f_paramlist : tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';' dec_f_paramlist | ;
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
    IDENT sent_AUX { $res = "\t" + $IDENT.text + $sent_AUX.res; }
    | proc_call ';' { $res = "\t" + $proc_call.res + ";\n"; }
    ;

sent_AUX returns [String res] :
    '=' exp ';' { $res = " = " + $exp.res + ";\n"; }
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
    'FUNCTION' id1=IDENT '(' nomparamlist ')' tipo '::' id2=IDENT ';' declaracion_mixta_f_list sentlist 'END' 'FUNCTION' id3=IDENT
    { $res = $tipo.res + " " + $id1.text + "(" + $nomparamlist.res + ") {\n" + $sentlist.res + "}\n"; }
    ;

codproc returns [String res] :
    'SUBROUTINE' id1=IDENT formal_paramlist declaracion_mixta_list sentlist 'END' 'SUBROUTINE' id2=IDENT
    { $res = "void " + $id1.text + $formal_paramlist.res + " {\n" + $sentlist.res + "}\n"; }
    ;

declaracion_mixta_f_list : tipo mixta_f_AUX declaracion_mixta_f_list | ;
mixta_f_AUX : ',' mixta_f_comma_factor | defvar;
mixta_f_comma_factor : 'INTENT' '(' 'IN' ')' IDENT ';' | 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' ;

declaracion_mixta_list : tipo mixta_AUX declaracion_mixta_list | ;
mixta_AUX : ',' mixta_comma_factor | defvar;
mixta_comma_factor : 'INTENT' '(' tipoparam ')' IDENT ';' | 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' ;
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