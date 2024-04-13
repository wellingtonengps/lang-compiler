lexer grammar LangLexer;

DATA      : 'data' ;
PRINT     : 'print' ;
IF        : 'if' ;
ELSE      : 'else' ;
ITERATE   : 'iterate' ;
TRUE      : 'true'  ;
FALSE     : 'false' ;
NEW       : 'new' ;
READ      : 'read' ;
RETURN    : 'return' ;

PLUS                : '+' ;
MINUS               : '-' ;
MULT                : '*' ;
DIV                 : '/' ;
MOD                 : '%' ;

AND                 : '&&' ;
OR                  : '||' ;
NOT                 : '!' ;
LESS_THAN           : '<' ;
MORE_THAN           : '>' ;
EQUAL               : '==' ;
NOT_EQUAL           : '!=' ;

BTYPE: Int | Float | Char | Bool;
Int   : 'Int';
Float : 'Float';
Char  : 'Char';
Bool  : 'Bool';

OPEN_PARENTESIS     : '(' ;
CLOSE_PARENTESIS    : ')' ;
OPEN_BRACKET        : '[' ;
CLOSE_BRACKET       : ']' ;
OPEN_CURLY_BRACER   : '{' ;
CLOSE_CURLY_BRACER  : '}' ;

ACCESSOR         : '.' ;
COLON            : ':' ;
SEMICOLON        : ';' ;
DOUBLE_COLON     : '::' ;
COMMA            : ',' ;
ATTRIBUTION      : '=' ;

COMMENT           : '--' .*? ~[\r\n]* -> skip;
MULTILINE_COMMENT : '{-' .*? '-}' -> skip;
NEWLINE           : ([\r\n]+ | [\n]+) -> skip ;
WS                : [ \t]+ -> skip ;

TYPE      : UPPERCASE (ID)* ;
BOOLEAN   : TRUE | FALSE;
NULL      :  '\'' '\\0' '\'' | 'null';
ID        : CHAR (CHAR | NUMBER | '_')* ;
FLOAT     : (NUMBER)* '.' (NUMBER)+ ;
INT       : (NUMBER)+ ;
LITERAL   : '\'' (CHAR | '\\n' | '\\t' | '\\\\') '\'';
CHAR      : LOWERCASE | UPPERCASE ;
NUMBER    : [0-9] ;
UPPERCASE : [A-Z] ;
LOWERCASE : [a-z] ;

