package org.compiler.Lang.interpreter;

import org.antlr.v4.runtime.tree.ParseTree;
import org.compiler.Lang.LangParser;
import org.compiler.Lang.LangParserBaseVisitor;
import org.compiler.Lang.interpreter.ast.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe auxiliar que pega a parseTree do ANTLR e implementa os métodos com
 * base nos nós criados da AST no padrão NODE
 * Classe auxiliar que adapta a parseTree criada pelo ANTLR para receber o Node da AST criado
 * e implementa os métodos do Visitor padrão do ANTLR
 */
public class VisitorAdapter extends LangParserBaseVisitor<Node>{
    @Override
    public Node visitProg(LangParser.ProgContext ctx) {
        // ----- Regra
        // prog: data* func*
        // ctx.getStart() => Captura o token inicial do contexto

        Program program = new Program(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()); // Linha e coluna

        for (int i = 0; i < (ctx.data().size()) && this.shouldVisitNextChild(ctx, this.defaultResult()); i++) {
            ParseTree childTree = ctx.data(i);
            program.addData((Data) this.aggregateResult(this.defaultResult(), childTree.accept(this)));
        }

        for (int i = 0; i < (ctx.func().size()) && this.shouldVisitNextChild(ctx, this.defaultResult()); i++) {
            ParseTree childTree = ctx.func(i);
            program.addFunction((Function) this.aggregateResult(this.defaultResult(), childTree.accept(this)));
        }

        return program;
    }

    @Override
    public Node visitData(LangParser.DataContext ctx) {
        // ----- Regra
        // data: DATA_TYPE NAME_TYPE OPEN_BRACES decl* CLOSE_BRACES # DataDeclaration
        /**
         * Modelo:
         * data Teste{
         * -- declarações
         *  2 :: Int;
         *  'a' :: Char;
         * }
         */

        //String nametype = ctx.NAME_TYPE().getText(); // Captura o nome de tipo

        String nametype = ctx.getText(); // Captura o nome de tipo
        List<Declaration> decls = new ArrayList<Declaration>(); // Declarações

        // Percorre o número de declarações
        for (int i = 0; i < ctx.decl().size(); i++) {
            Declaration declarationAccept = (Declaration)ctx.decl().get(i).accept(this);
            decls.add(declarationAccept); // Listagem de declarações do data
        }

        return new Data(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), nametype, decls);
    }

    @Override
    public Node visitDecl(LangParser.DeclContext ctx) {
        // ----- Regra
        // decl: ID DOUBLE_COLON type SEMI

        //Type tipo = ctx.type().accept(this);
        //ctx.type().

        return new Declaration(
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine(),
                ctx.getChild(0).getText(),      // Nome da variavel
                (Type) ctx.type().accept(this)  // Tipo da variavel: Int, Char, Bool,... OU NameType
        );
    }

    @Override
    public Node visitFunc(LangParser.FuncContext ctx) {
        // ----- Regra
        // func: ID OPEN_PARENT params? CLOSE_PARENT (COLON type (COMMA type)*)?
        //    OPEN_BRACES cmd* CLOSE_BRACES    # Function

        // (COLON type (COMMA type)*)? -- Tipos de Retorno da função


        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        Function function = new Function(line, column, ctx.getChild(0).getText());  // Nome da função

        Parameters parameters;

        if (ctx.params() != null) { // Checa se há parametros na função
            parameters = (Parameters) ctx.params().accept(this);
            function.setParameters(parameters);
        }

        for (int i = 0; i < (ctx.type().size()) && this.shouldVisitNextChild(ctx, this.defaultResult()); i++) {
            ParseTree childTree = ctx.type(i);
            function.addReturnTypes((Type) this.aggregateResult(this.defaultResult(), childTree.accept(this)));
        }

        for (int i = 0; i < (ctx.cmd().size()) && this.shouldVisitNextChild(ctx, this.defaultResult()); i++) {
            ParseTree childTree = ctx.cmd(i);
            function.addCommand((Command) this.aggregateResult(this.defaultResult(), childTree.accept(this)));
        }

        return function;
    }

    @Override
    public Node visitTypeInt(LangParser.TypeIntContext ctx) {
        // ----- Regra
        // btype: INT_TYPE     # BTypeInt
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new TypeInt(line, column);
    }

    @Override
    public Node visitTypeFloat(LangParser.TypeFloatContext ctx) {
        // ----- Regra
        // btype: FLOAT_TYPE    # BTypeFloat
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new TypeFloat(line, column);
    }

    @Override
    public Node visitTypeChar(LangParser.TypeCharContext ctx) {
        // ----- Regra
        // btype: CHAR_TYPE     # BTypeChar
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new TypeChar(line, column);
    }

    @Override
    public Node visitTypeBool(LangParser.TypeBoolContext ctx) {
        // ----- Regra
        // btype: BOOL_TYPE     # BTypeBool
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new TypeBool(line, column);
    }

    public Node visitCommandsList(LangParser.CommandsListContext ctx) {
        // ----- Regra
        // cmd: OPEN_BRACES cmd* CLOSE_BRACES      # CommandsList
        List<Command> cmds = new ArrayList<>();

        for (int i = 0; i < ctx.cmd().size(); i++) {
            cmds.add((Command) ctx.cmd().get(i).accept(this));
        }

        return new CommandsList(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), cmds);
    }



    @Override
    public Node visitIf(LangParser.IfContext ctx) {
        // ----- Regra
        // cmd: IF OPEN_PARENT exp CLOSE_PARENT cmd   # If
        Expression exp = (Expression) ctx.getChild(2).accept(this);
        Command cmd = (Command) ctx.getChild(4).accept(this);

        return new If(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exp, cmd);
    }

    @Override
    public Node visitIfElse(LangParser.IfElseContext ctx) {
        // ----- Regra
        // cmd: IF OPEN_PARENT exp CLOSE_PARENT cmd ELSE cmd  # IfElse
        Expression exp = (Expression) ctx.getChild(2).accept(this);
        Command cmd = (Command) ctx.getChild(4).accept(this);
        Command elseCmd = (Command) ctx.getChild(6).accept(this);

        return new IfElse(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exp, cmd, elseCmd);
    }

    @Override
    public Node visitIterate(LangParser.IterateContext ctx) {
        // ----- Regra
        // cmd: ITERATE OPEN_PARENT exp CLOSE_PARENT cmd  # Iterate
        Expression exp = (Expression) ctx.getChild(2).accept(this);
        Command cmd = (Command) ctx.getChild(4).accept(this);

        return new Iterate(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.getChild(0).getText(), exp, cmd);
    }

    @Override
    public Node visitRead(LangParser.ReadContext ctx) {
        // ----- Regra
        // cmd: READ lvalue SEMI  # Read
        LValue lValue = (LValue) ctx.getChild(1).accept(this);
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new Read(line, column, lValue);
    }

    @Override
    public Node visitPrint(LangParser.PrintContext ctx) {
        // ----- Regra
        // cmd: PRINT exp SEMI    # Print
        //Expression expression = (Expression) ctx.exp().accept(this);
        Expression expression = (Expression) ctx.exp().accept(this);
        return new Print(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), expression);
    }

    @Override
    public Node visitReturn(LangParser.ReturnContext ctx) {
        // ----- Regra
        // cmd: RETURN exp (COMMA exp)* SEMI  # Return
        List<Expression> exps = new ArrayList<Expression>();

        for (int i = 0; i < ctx.exps().exp().size(); i++) {
            exps.add((Expression) ctx.exps().exp().get(i).accept(this));
        }

        return new Return(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exps);
    }

    @Override
    public Node visitAssing(LangParser.AssingContext ctx) {
        // ----- Regra
        // cmd: lvalue EQUALS exp SEMI    # Attribution
        return new Attribution(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                (LValue) ctx.lvalue().accept(this), (Expression) ctx.exp().accept(this));
    }

    @Override
    public Node visitLessThan(LangParser.LessThanContext ctx) {
        // ----- Regra
        // cmd: ID OPEN_PARENT exps? CLOSE_PARENT (LESS_THAN lvalue (COMMA lvalue)* GREATER_THAN)? SEMI   # FunctionCall

        FunctionCall fcall = new FunctionCall(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.getChild(0).getText());

        // Verifica se há parametros na função
        if (ctx.acessParams != null) {
            FCallParams exps = (FCallParams) ctx.exps().accept(this);

            fcall = new FunctionCall(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.getChild(0).getText(), exps);
        }

        for (int i = 0; i < ctx.lvalue().size() && this.shouldVisitNextChild(ctx, this.defaultResult()); i++) {
            ParseTree childTree = ctx.lvalue(i);
            fcall.addLValue((LValue) this.aggregateResult(this.defaultResult(), childTree.accept(this)));
        }

        return fcall;
    }


    @Override
    public Node visitTypeVector(LangParser.TypeVectorContext ctx) {
        // ----- Regra --- TIPO DE ARRAY NOS PARAMETROS DE FUNCAO
        // type: type OPEN_BRACKET CLOSE_BRACKET   # TypeDeclaration
        Type type = (Type) ctx.type().accept(this);
        return new TypeArray(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), type);
    }

    @Override
    public Node visitTypeBase(LangParser.TypeBaseContext ctx) {
        return super.visitTypeBase(ctx);
    }

    @Override
    public Node visitParams(LangParser.ParamsContext ctx) {
        // ----- Regra
        // params: ID DOUBLE_COLON type (COMMA ID DOUBLE_COLON type)*  # ParametersFunction

        List<String> ids = new ArrayList<>();
        List<Type> types = new ArrayList<>();

        for (int i = 0; i < ctx.type().size(); i++) {   // Encontra os ids e os tipos e armazena na classe Parameter
            ids.add(ctx.ID().get(i).getText());
            types.add((Type) ctx.type().get(i).accept(this));
        }

        Parameters parameters = new Parameters(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ids, types);

        return parameters;
    }

    @Override
    public Node visitAndExp(LangParser.AndExpContext ctx) {
        // ----- Regra
        // exp:<assoc=left> exp AND exp    # AndOperation
        Expression left = (Expression) ctx.getChild(0).accept(this);
        Expression right = (Expression) ctx.getChild(2).accept(this);

        return new And(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), left, right);
    }

    @Override
    public Node visitLogicsExprs(LangParser.LogicsExprsContext ctx) {
        // ----- Regra
        // exp: rexp      # RExpCall
        return super.visitLogicsExprs(ctx);
    }

    @Override
    public Node visitLogicExp(LangParser.LogicExpContext ctx) {
        // ----- Regra
        // rexp: <assoc=left> rexp EQUALITY aexp    # Equality
        Expression left = (Expression) ctx.getChild(0).accept(this);
        Expression right = (Expression) ctx.getChild(2).accept(this);

        return new Equality(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), left, right);
    }

    @Override
    public Node visitBasicsExprs(LangParser.BasicsExprsContext ctx) {
        // ----- Regra
        // rexp: aexp      # AExpCall
        return super.visitBasicsExprs(ctx);
    }

    @Override
    public Node visitPlusMinus(LangParser.PlusMinusContext ctx) {
        return super.visitPlusMinus(ctx);
    }

    @Override
    public Node visitMoreExprs(LangParser.MoreExprsContext ctx) {
        // ----- Regra
        // aexp: mexp      # MExpCall
        return super.visitMoreExprs(ctx);
    }

    @Override
    public Node visitMultDivMod(LangParser.MultDivModContext ctx) {
        // ----- Regra
        // mexp: <assoc=left> mexp TIMES sexp   # MultiplicationOperation
        Expression left = (Expression) ctx.getChild(0).accept(this);
        Expression right = (Expression) ctx.getChild(2).accept(this);

        return new Multiplication(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), left, right);
    }

    @Override
    public Node visitLiteralExprs(LangParser.LiteralExprsContext ctx) {
        // ----- Regra
        // mexp: sexp   # SExpCall
        return super.visitLiteralExprs(ctx);
    }

    @Override
    public Node visitNot(LangParser.NotContext ctx) {
        // ----- Regra
        // sexp: <assoc=right> EXCLAMATION sexp # Not
        Expression exp = (Expression) ctx.getChild(1).accept(this);

        return new Not(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exp);
    }

    @Override
    public Node visitMinus(LangParser.MinusContext ctx) {
        // ----- Regra
        // sexp: <assoc=right> MINUS sexp   # Minus
        Expression exp = (Expression) ctx.getChild(1).accept(this);

        return new Minus(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exp);
    }

    @Override
    public Node visitTrue(LangParser.TrueContext ctx) {
        // ----- Regra
        // sexp: TRUE  # True
        return new BooleanValue(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                Boolean.parseBoolean(ctx.getChild(0).getText()));
    }

    @Override
    public Node visitFalse(LangParser.FalseContext ctx) {
        // ----- Regra
        // sexp: FALSE  # False
        return new BooleanValue(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                Boolean.parseBoolean(ctx.getChild(0).getText()));
    }

    @Override
    public Node visitNull(LangParser.NullContext ctx) {
        // ----- Regra
        // sexp: NULL  # Null
        return new Null(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
    }

    @Override
    public Node visitInt(LangParser.IntContext ctx) {
        // ----- Regra
        // sexp: INT   # IntegerNumber
        return new IntegerNumber(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), Integer.parseInt(ctx.getChild(0).getText()));
    }

    @Override
    public Node visitFloat(LangParser.FloatContext ctx) {
        // ----- Regra
        // sexp: FLOAT   # FloatNumber
        return new FloatNumber(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), Float.parseFloat(ctx.FLOAT().getText()));
    }

    @Override
    public Node visitChar(LangParser.CharContext ctx) {
        // ----- Regra
        // btype: CHAR_TYPE     # BTypeChar
        /*int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new TypeChar(line, column);*/

        return new CharLitteral(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                ctx.CHAR().getText());
    }


    @Override
    public Node visitAcessorValue(LangParser.AcessorValueContext ctx) {
        // ----- Regra
        // sexp: pexp   # PExpCall
        return super.visitAcessorValue(ctx);
    }

    @Override
    public Node visitValue(LangParser.ValueContext ctx) {
        // ----- Regra
        // pexp: lvalue    # PexpIdentifier
        return super.visitValue(ctx);
    }

    @Override
    public Node visitParentesis(LangParser.ParentesisContext ctx) {
        // ----- Regra
        // pexp: <assoc=left> OPEN_PARENT exp CLOSE_PARENT  # ExpParenthesis
        return (Expression) ctx.getChild(1).accept(this);
    }

    @Override
    public Node visitNew(LangParser.NewContext ctx) {
        // ----- Regra
        // pexp: NEW type (OPEN_BRACKET exp CLOSE_BRACKET)?    # TypeInstanciate

        // SE FOR SÓ O DATA

        if(ctx.type().accept(this) instanceof NameType){
            // System.out.println("Instancia um TypeInstanciate -- VisitorAdapter -- 541");
            // caso seja um ARRAY DE DATA
            if (ctx.exps() != null){
                Expression exp = (Expression) ctx.exps().accept(this);
                // Type type = (Type) ctx.type().accept(this);
                // System.out.println("Instancia um TypeInstanciate -- VisitorAdapter(ARRAY COMUM) -- 548 -- " + type.toString() + " -- " + exp.toString());
                return new TypeInstanciate(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exp, ctx.type().getText());
            }
            else{   // Caso seja somente o TIPO DATA MESMO
                return new TypeInstanciate(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.type().getText());
            }
        }

        // caso seja um new array, aceita a expressao
        if (ctx.exps() != null){
            Expression exp = (Expression) ctx.exps().accept(this);
            Type type = (Type) ctx.type().accept(this);
            // System.out.println("Instancia um TypeInstanciate -- VisitorAdapter(ARRAY COMUM) -- 548 -- " + type.toString() + " -- " + exp.toString());
            return new TypeInstanciate(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exp, type);
        }
        else {  // caso nao seja um new array, só aceita o type mesmo
            Type type = (Type) ctx.type().accept(this);
            return new TypeInstanciate(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), type);
        }
    }

    @Override
    public Node visitFunctionCall(LangParser.FunctionCallContext ctx) {
        // ----- Regra
        // pexp: ID OPEN_PARENT exps? CLOSE_PARENT OPEN_BRACKET exp CLOSE_BRACKET  # FunctionReturn // Como retorna 2 valores, logo precisa do funcao(parametros)[indice] Exemplo: fat(num−1)[0]
        String str = ctx.ID().getText();
        FCallParams fCallPar = (FCallParams) ctx.exps().accept(this);
        Expression exp = (Expression) ctx.exp().accept(this);
        return new FunctionReturn(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), str, fCallPar, exp);
    }

    @Override
    public Node visitIdVector(LangParser.IdVectorContext ctx) {
        // ----- Regra
        // lvalue: <assoc=left> lvalue OPEN_BRACKET exp CLOSE_BRACKET # ArrayAccess
        // System.out.println("582 - ARRAY Access --- "+ ctx.lvalue().getText() + " --- " + ctx.exp().getText());
        LValue lVal = (LValue) ctx.getChild(0).accept(this);
        Expression exp = (Expression) ctx.getChild(2).accept(this);

        return new ArrayAccess(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), lVal, exp);
    }

    @Override
    public Node visitId(LangParser.IdContext ctx) {
        // ----- Regra
        // lvalue: ID      # Identifier
        return new Identifier(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                ctx.ID().getText());
    }

    @Override
    public Node visitAcessorID(LangParser.AcessorIDContext ctx) {
        // ----- Regra
        // lvalue: <assoc=left> lvalue DOT ID     # DataAccess
        // System.out.println("608 - DATA Access --- "+ ctx.ID().getText() + " --- " + ctx.lvalue().getText() + " --- " + ctx.lvalue().getText());
        LValue lVal = (LValue) ctx.lvalue().accept(this);
        String str = ctx.getChild(2).getText();
        String dataId = ctx.lvalue().getText();
        return new DataAccess(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), lVal, str, dataId);
    }

    @Override
    public Node visitExps(LangParser.ExpsContext ctx) {
        // ----- Regra
        // exps: exp (COMMA exp)*      # FCallParams
        FCallParams fcall = new FCallParams(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        List<Expression> exps = new ArrayList<>();
        // Captura as expressoes 'exp'
        for (int i = 0; i < ctx.exp().size(); i++) {
            exps.add((Expression) ctx.exp().get(i).accept(this));
        }
        fcall.setExps(exps);
        return fcall;
    }
}
