parser grammar LangParser;

options { tokenVocab=LangLexer; }

prog: data* func* #program;

data: DATA NAME_TYPE OPEN_CURLY_BRACER (decl)* CLOSE_CURLY_BRACER #dataDeclaration;

decl: ID DOUBLE_COLON type SEMICOLON #varDeclaration;

func: ID OPEN_PARENTESIS (params)? CLOSE_PARENTESIS (COLON type (COMMA type)*)? OPEN_CURLY_BRACER (cmd)* CLOSE_CURLY_BRACER #function;

params: ID DOUBLE_COLON type (COMMA ID DOUBLE_COLON type)* #parametersFunction;
//params: param (COMMA param)*;
//param: ID DOUBLE_COLON type;

type: type OPEN_BRACKET CLOSE_BRACKET #typeDeclaration
      | btype #bTypeCAll
      ;

btype: TYPE_INT #bTypeInt
      | TYPE_FLOAT #bTypeFloat
      | TYPE_CHAR  #bTypeChar
      | TYPE_BOOL #bTypeBool
      | NAME_TYPE #bTypeNameType
      ;

cmd: OPEN_CURLY_BRACER (cmd)* CLOSE_CURLY_BRACER #commandsList
     | IF OPEN_PARENTESIS exp CLOSE_PARENTESIS cmd #if
     | IF OPEN_PARENTESIS exp CLOSE_PARENTESIS ifcmd=cmd ELSE elsecmd=cmd #ifElse
     | ITERATE OPEN_PARENTESIS exp CLOSE_PARENTESIS cmd #iterate
     | READ lvalue SEMICOLON #read
     | PRINT exp SEMICOLON #print
     | RETURN exp (COMMA exp)* SEMICOLON #return
     | lvalue ATTRIBUTION exp SEMICOLON #attribution
     | ID OPEN_PARENTESIS exps? CLOSE_PARENTESIS (LESS_THAN lvalue (COMMA lvalue)* MORE_THAN)? SEMICOLON #functionCall;

exp: exp AND exp #andOperation
     | rexp #rexpCall;

rexp: aexp LESS_THAN aexp #lessThan
      |<assoc=left> rexp EQUAL aexp #equality
      |<assoc=left> rexp NOT_EQUAL aexp #diffence
      | aexp #aExpCall
    ;

aexp:  aexp PLUS mexp #additionOperation
      | aexp MINUS mexp #substractionOperation
      | mexp #mExpCall
      ;

mexp:  <assoc=left> mexp MULT sexp #multiplicationOperation
     | <assoc=left> mexp DIV sexp  #divisonOperation
     | <assoc=left> mexp MOD sexp #modularOperation
     | sexp #sExpCall
     ;

sexp:  <assoc=right> NOT sexp #not
     | <assoc=right> MINUS sexp #minus
     | TRUE #true
     | FALSE #false
     | NULL #null
     | INT #intergeNumber
     | FLOAT #floatNumber
     | CHAR #charLitteral
     | pexp #pExpCall;

pexp: lvalue #pexpIdentifier
     | <assoc=left> OPEN_PARENTESIS exp CLOSE_PARENTESIS #expParenthesis
     | NEW type (OPEN_BRACKET exp CLOSE_BRACKET)? #typeInstanciate
     | ID OPEN_PARENTESIS exps? CLOSE_PARENTESIS OPEN_BRACKET exp CLOSE_BRACKET #functionReturn;

lvalue: ID #identifier
       | <assoc=left> lvalue OPEN_BRACKET exp CLOSE_BRACKET #arrayAccess
       | <assoc=left> lvalue ACCESSOR ID #dataAccess;

exps: exp (COMMA exp)* #fCallParams;
