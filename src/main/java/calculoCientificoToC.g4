grammar calculoCientificoToC;

/*
Un programa está compuesto por cuatro partes:
la zona de declaraciones de constantes y variables(dcllist)
la zona de declaración de funciones y procedimientos (cabecera)
la zona de sentencias del programa principal (sentlist)
la zona de implementación de funciones y procedimientos(subproglist).
*/

prg : 'PROGRAM' IDENT ';' dcllist cabecera sentlist 'END' 'PROGRAM' IDENT subproglist;

dcllist : dcl dcllist | ;

cabecera : 'INTERFACE' cablist 'END' 'INTERFACE' | ;
cablist : decproc decsubprog | decfun decsubprog;
decsubprog : decproc decsubprog | decfun decsubprog | ;
sentlist : sent sentlist_AUX;
sentlist_AUX : sent sentlist_AUX | ;

dcl : defcte | defvar;
defcte : tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' ;
ctelist : ',' IDENT '=' simpvalue ctelist | ;
simpvalue : NUM_INT_CONST | NUM_REAL_CONST | STRING_CONST;
defvar : tipo '::' varlist ';' ;

tipo : 'INTEGER' | 'REAL' | 'CHARACTER' charlength;
charlength : '(' NUM_INT_CONST ')' | ;
varlist : IDENT init varlist_AUX;

varlist_AUX : ',' IDENT init varlist_AUX | ;

init : '=' simpvalue | ;

decproc : 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' IDENT;

formal_paramlist : '(' nomparamlist ')' | ;

nomparamlist : IDENT nomparamlist_AUX;

nomparamlist_AUX : ',' IDENT nomparamlist_AUX | ;

dec_s_paramlist : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';' dec_s_paramlist | ;

tipoparam : 'IN' | 'OUT' | 'INOUT';

decfun : 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT ';' dec_f_paramlist 'END' 'FUNCTION' IDENT;

dec_f_paramlist : tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';' dec_f_paramlist | ;

sent : IDENT sent_AUX | proc_call ';';

sent_AUX : '=' exp ';' | ;

exp : factor exp_AUX;

exp_AUX : op factor exp_AUX | ;

op : '+' | '-' | '*' | '/';

factor : simpvalue | '(' exp ')' | IDENT factor_AUX;

factor_AUX: '(' exp explist ')' | ;

explist : ',' exp explist | ;

proc_call : 'CALL' IDENT subpparamlist;

subpparamlist : '(' exp explist ')' | ;

subproglist : codproc subproglist | codfun subproglist | ;

codproc : 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist dcllist sentlist 'END' 'SUBROUTINE' IDENT;

codfun : 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT ';' dec_f_paramlist dcllist sentlist IDENT '=' exp ';' 'END' 'FUNCTION' IDENT;


/*
Tanto en la declaración de subprogramas (decproc y decfun) como en su implementación
(codproc y codfun) la declaración de parámetros formales (dec_s_paramlist y
dec_f_paramlist) se debe realizar en el mismo orden que se mencionan en la cabecera
(nomparamlist)
*/

IDENT : [a-zA-Z] [a-zA-Z0-9_]* ;

NUM_INT_CONST: '-'? [0-9]+;

NUM_REAL_CONST: PUNTO_FIJO | EXPONENECIAL | MIXTO;

STRING_CONST: '\'' ('\'\'' | ~['] )* '\'' | '"' ('""' | ~["] )* '"';

WS : [ \t\r\n]+ -> skip ;
fragment
    PUNTO_FIJO: NUM_INT_CONST '.' [0-9]+;
    EXPONENECIAL: NUM_INT_CONST [eE] NUM_INT_CONST;
    MIXTO: PUNTO_FIJO [eE] NUM_INT_CONST;
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
