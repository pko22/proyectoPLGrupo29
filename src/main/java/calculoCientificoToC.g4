grammar calculoCientificoToC;

/*
Un programa está compuesto por cuatro partes:
la zona de declaraciones de constantes y variables(dcllist)
la zona de declaración de funciones y procedimientos (cabecera)
la zona de sentencias del programa principal (sentlist)
la zona de implementación de funciones y procedimientos(subproglist).
*/

prg : 'PROGRAM' IDENT ';' dcllist cabecera sentlist 'END' 'PROGRAM' IDENT subproglist;

// --- ZONA DE DECLARACIONES ---

dcllist : dcl dcllist | ;

dcl :  tipo dcl_AUX;
dcl_AUX : defcte | defvar ;

defcte : ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' ;
ctelist : ',' IDENT '=' simpvalue ctelist | ;

defvar : '::' varlist ';' ;
varlist : IDENT init varlist_AUX;
varlist_AUX : ',' IDENT init varlist_AUX | ;
init : '=' simpvalue | ;

tipo : 'INTEGER' | 'REAL' | 'CHARACTER' charlength;
charlength : '(' NUM_INT_CONST ')' | ;
simpvalue : NUM_INT_CONST | NUM_REAL_CONST | STRING_CONST;

// --- ZONA DE CABECERA (INTERFACE) ---

cabecera : 'INTERFACE' cablist 'END' 'INTERFACE' | ;

cablist : decproc decsubprog | decfun decsubprog;

decsubprog : decproc decsubprog | decfun decsubprog | ;

decproc : 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' IDENT;

decfun : 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT ';' dec_f_paramlist 'END' 'FUNCTION' IDENT;

formal_paramlist : '(' nomparamlist ')' | ;

nomparamlist : IDENT nomparamlist_AUX;
nomparamlist_AUX : ',' IDENT nomparamlist_AUX | ;

dec_s_paramlist : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';' dec_s_paramlist | ;
dec_f_paramlist : tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';' dec_f_paramlist | ;

tipoparam : 'IN' | 'OUT' | 'INOUT';

// --- ZONA DE SENTENCIAS ---

sentlist : sent sentlist_AUX;
sentlist_AUX : sent sentlist_AUX | ;

sent : IDENT sent_AUX | proc_call ';';
sent_AUX : '=' exp ';';

proc_call : 'CALL' IDENT subpparamlist;
subpparamlist : '(' exp explist ')' | ;

// --- EXPRESIONES ---

exp : termino exp_AUX;
exp_AUX : operador_sumas termino exp_AUX | ;
operador_sumas : '+' | '-' ;

termino: factor termino_AUX;
termino_AUX:operador_multiplicaciones factor termino_AUX | ;
operador_multiplicaciones : '*' | '/' ;

factor : simpvalue | '(' exp ')' | IDENT factor_AUX;
factor_AUX: '(' exp explist ')' | ;
explist : ',' exp explist | ;

// --- IMPLEMENTACIÓN DE SUBPROGRAMAS ---

subproglist : codproc subproglist | codfun subproglist | ;

codfun : 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT ';' declaracion_mixta_f_list sentlist 'END' 'FUNCTION' IDENT;
declaracion_mixta_f_list : tipo mixta_f_AUX declaracion_mixta_f_list | ;
mixta_f_AUX : ',' mixta_f_comma_factor | defvar;
mixta_f_comma_factor : 'INTENT' '(' 'IN' ')' IDENT ';' | 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' ;

codproc : 'SUBROUTINE' IDENT formal_paramlist declaracion_mixta_list sentlist 'END' 'SUBROUTINE' IDENT;
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

fragment PUNTO_FIJO: NUM_INT_CONST '.' [0-9]+;
fragment EXPONENECIAL: NUM_INT_CONST [eE] NUM_INT_CONST;
fragment MIXTO: PUNTO_FIJO [eE] NUM_INT_CONST;

    /*
    'comilla doble ” dentro'
    'comilla simple '' dentro'
    'comilla doble ” y simple '' dentro'
    --------------
    "comilla simple ' dentro"
    "comilla doble "" dentro"
    "comilla simple ' y doble "" dentro"
    */

/*
SIGNO: ('+'|'-') ;
WS : [\n\r\t ]+ -> skip;

fragment
LETRAS : [a-zA-Z] ;
DIGITOS : [0-9] ;
CARACTERES_HEX : [0-9A-F] ;
*/