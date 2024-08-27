/*
* Gustavo De Angelis Bartholomeu (201935009)
* Wellington Pereira Silva (201935041)
*/
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


TYPE_INT   : 'Int' ;
TYPE_FLOAT : 'Float' ;
TYPE_CHAR  : 'Char';
TYPE_BOOL  : 'Bool';

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

ID: [a-z][a-zA-Z0-9_]* ;
NAME_TYPE: [A-Z][a-zA-Z0-9_]*;

BOOLEAN   : TRUE | FALSE;
NULL      :  '\'' '\\0' '\'' | 'null';
//ID        : CHAR (CHAR | NUMBER | '_')* ;
//TYPE      : UPPERCASE (ID)* ;
FLOAT     : (NUMBER)* '.' (NUMBER)+ ;
INT       : (NUMBER)+ ;
//LITERAL   : '\'' (CHAR | '\\n' | '\\t' | '\\\\') '\'';
CHAR: ('\''([\u0000-\u0026]|[\u0028-\u005B]|[\u005D-\u007F])'\'')       // (000 - 127)(Menos o 27 => aspas simples ' e nem 97 => Contrabarra \ ) Captura todos os caracteres da tabela ASCII, conforme a especificação da linguagem
    | ('\'''\\n''\'')           // '\n' => Contrabarra_n
    | ('\'''\\t''\'')           // '\t' => Contrabarra_t
    | ('\'''\\b''\'')           // '\b' => Contrabarra_b
    | ('\'''\\r''\'')           // '\r' => Contrabarra_r
    | ('\'''\\\\''\'')          // Especifica '\\' que é a '\' => Contrabarra
    | ('\'\\\'\'')              // Especifica a aspas simples: "\\\'" => \' => '
    ;
NUMBER    : [0-9] ;
UPPERCASE : [A-Z] ;
LOWERCASE : [a-z] ;


