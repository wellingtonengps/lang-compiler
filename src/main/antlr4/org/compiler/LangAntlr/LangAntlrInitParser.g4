parser grammar LangAntlrInitParser;

options { tokenVocab=LangAntlrInitLexer; }

prog: data* func*;

data: DATA TYPE OPEN_CURLY_BRACER (decl)* CLOSE_CURLY_BRACER;

decl: ID DOUBLE_COLON type SEMICOLON;

func: ID OPEN_PARENTESIS (params)? CLOSE_PARENTESIS (COLON type (COMMA type)*)? OPEN_CURLY_BRACER (cmd)* CLOSE_CURLY_BRACER;

params: param (COMMA param)*;

param: ID DOUBLE_COLON type;

type: type OPEN_BRACKET CLOSE_BRACKET
      | btype;

btype: BTYPE
       | TYPE;

cmd: OPEN_CURLY_BRACER (cmd)* CLOSE_CURLY_BRACER #brances
     | IF OPEN_PARENTESIS exp CLOSE_PARENTESIS cmd #if
     | IF OPEN_PARENTESIS exp CLOSE_PARENTESIS ifcmd=cmd ELSE elsecmd=cmd #ifElse
     | ITERATE OPEN_PARENTESIS exp CLOSE_PARENTESIS cmd #iterate
     | READ lvalue SEMICOLON #read
     | PRINT exp SEMICOLON #print
     | RETURN exps SEMICOLON #return
     | lvalue ATTRIBUTION exp SEMICOLON #assing
     | ID OPEN_PARENTESIS (acessParams=exps)? CLOSE_PARENTESIS (LESS_THAN (acessReturn=lvalues)? MORE_THAN)? SEMICOLON #lessThan;

lvalues: lvalue (COMMA lvalue)*;

exp: exp AND exp #andExp
     | rexp #logicsExprs;

rexp: left=rexp op=(LESS_THAN | MORE_THAN | EQUAL | NOT_EQUAL)  right=aexp # LogicExp
      | aexp #basicsExprs;

aexp:  left=aexp op=(PLUS|MINUS) right=mexp #PlusMinus
      | mexp #moreExprs;

mexp:  left=mexp op=(MULT|DIV|MOD) right=sexp #MultDivMod
     | sexp #literalExprs;

sexp:  NOT sexp #not
     | MINUS sexp #minus
     | TRUE #true
     | FALSE #false
     | NULL #null
     | INT #int
     | FLOAT #float
     | CHAR #char
     | LITERAL #literal
     | pexp #acessorValue;

pexp: lvalue #value
     | OPEN_PARENTESIS exp CLOSE_PARENTESIS #parentesis
     | NEW type (OPEN_BRACKET exps CLOSE_BRACKET)? #new
     | ID OPEN_PARENTESIS (acessParams=exps)? CLOSE_PARENTESIS (OPEN_BRACKET acessReturn=exp CLOSE_BRACKET)? #functionCall;

lvalue: ID #id
       | lvalue OPEN_BRACKET exp CLOSE_BRACKET #idVector
       | lvalue ACCESSOR ID #acessorID;

exps: exp (COMMA exp)*;