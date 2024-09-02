/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */

package org.compiler.Lang.interpreter;

import org.antlr.v4.runtime.tree.ParseTree;
import org.compiler.Lang.LangParser.*;
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
public class VisitorAdapter extends LangParserBaseVisitor<Node> {


    @Override
    public Node visitProgram(ProgramContext ctx) {

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
    public Node visitDataDeclaration(DataDeclarationContext ctx) {

        String nametype = ctx.NAME_TYPE().getText(); // Captura o nome de tipo
        List<Declaration> decls = new ArrayList<Declaration>(); // Declarações

        // Percorre o número de declarações
        for (int i = 0; i < ctx.decl().size(); i++) {
            Declaration declarationAccept = (Declaration)ctx.decl().get(i).accept(this);
            decls.add(declarationAccept); // Listagem de declarações do data
        }

        return new Data(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), nametype, decls);
    }

    @Override
    public Node visitVarDeclaration(VarDeclarationContext ctx) {

        return new Declaration(
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine(),
                ctx.getChild(0).getText(),      // Nome da variavel
                (Type) ctx.type().accept(this)  // Tipo da variavel: Int, Char, Bool,... OU NameType
        );
    }

    @Override
    public Node visitFunction(FunctionContext ctx) {


        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        // Criando uma lista para armazenar os tipos dos parâmetros
        List<String> paramTypes = new ArrayList<>();

        if (ctx.params() != null) {
            ctx.params().getChildCount();
            Parameters parameters = (Parameters) ctx.params().accept(this);
            paramTypes = parameters.getTypeAsStringList(); // Adicione os tipos dos parâmetros à lista
        }

        // Gerando o identificador único da função
        String functionName = ctx.getChild(0).getText();
        String functionId = generateFunctionId(functionName, paramTypes.size());

        Function function = new Function(line, column, functionId, ctx.hashCode());


        if (ctx.params() != null) {
            function.setParameters((Parameters) ctx.params().accept(this));
            function.setId(functionId); // Define o identificador único para a função
        }

        // Definindo os tipos de retorno da função
        for (int i = 0; i < ctx.type().size(); i++) {
            ParseTree childTree = ctx.type(i);
            function.addReturnTypes((Type) childTree.accept(this));
        }

        // Adicionando os comandos dentro do corpo da função
        for (int i = 0; i < ctx.cmd().size(); i++) {
            ParseTree childTree = ctx.cmd(i);
            function.addCommand((Command) childTree.accept(this));
        }

        return function;
    }

    private String generateFunctionId(String functionName, int paramTypesSize) {
        if(paramTypesSize != 0){
            return functionName + "_" + paramTypesSize;
        }
        return functionName + "_";
    }

    @Override
    public Node visitParametersFunction(ParametersFunctionContext ctx) {

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
    public Node visitBTypeCall(BTypeCallContext ctx) {
        return super.visitBTypeCall(ctx);
    }

    @Override
    public Node visitTypeDeclaration(TypeDeclarationContext ctx) {
        Type type = (Type) ctx.type().accept(this);
        return new TypeArray(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), type);
    }

    @Override
    public Node visitBTypeInt(BTypeIntContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new TypeInt(line, column);
    }

    @Override
    public Node visitBTypeChar(BTypeCharContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new TypeChar(line, column);
    }

    @Override
    public Node visitBTypeBool(BTypeBoolContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new TypeBool(line, column);
    }

    @Override
    public Node visitBTypeFloat(BTypeFloatContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new TypeFloat(line, column);
    }

    @Override
    public Node visitBTypeNameType(BTypeNameTypeContext ctx) {
        String nameType = ctx.getChild(0).getText();    // Captura o nome do tipo
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new NameType(line, column, nameType);
    }

    @Override
    public Node visitCommandsList(CommandsListContext ctx) {
        List<Command> cmds = new ArrayList<>();

        for (int i = 0; i < ctx.cmd().size(); i++) {
            cmds.add((Command) ctx.cmd().get(i).accept(this));
        }

        return new CommandsList(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), cmds);
    }

    @Override
    public Node visitIf(IfContext ctx) {
        Expression exp = (Expression) ctx.getChild(2).accept(this);
        Command cmd = (Command) ctx.getChild(4).accept(this);

        return new If(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exp, cmd);
    }

    @Override
    public Node visitIfElse(IfElseContext ctx) {
        Expression exp = (Expression) ctx.getChild(2).accept(this);
        Command cmd = (Command) ctx.getChild(4).accept(this);
        Command elseCmd = (Command) ctx.getChild(6).accept(this);

        return new IfElse(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exp, cmd, elseCmd);
    }

    @Override
    public Node visitIterate(IterateContext ctx) {
        Expression exp = (Expression) ctx.getChild(2).accept(this);
        Command cmd = (Command) ctx.getChild(4).accept(this);

        return new Iterate(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.getChild(0).getText(), exp, cmd);
    }

    @Override
    public Node visitRead(ReadContext ctx) {
        LValue lValue = (LValue) ctx.getChild(1).accept(this);
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new Read(line, column, lValue);
    }

    @Override
    public Node visitPrint(PrintContext ctx) {
        Expression expression = (Expression) ctx.exp().accept(this);
        return new Print(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), expression);
    }

    @Override
    public Node visitReturn(ReturnContext ctx) {
        List<Expression> exps = new ArrayList<Expression>();

        for (int i = 0; i < ctx.exp().size(); i++) {
            exps.add((Expression) ctx.exp().get(i).accept(this));
        }

        return new Return(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exps);
    }

    @Override
    public Node visitAttribution(AttributionContext ctx) {
        return new Attribution(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                (LValue) ctx.lvalue().accept(this), (Expression) ctx.exp().accept(this));
    }



    @Override
    public Node visitFunctionCall(FunctionCallContext ctx) {

        FunctionCall fcall = new FunctionCall(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.getChild(0).getText() + "()");

        // Verifica se há parametros na função
        if (ctx.exps() != null) {
            FCallParams exps = (FCallParams) ctx.exps().accept(this);


            int paramTypesSize = exps.getExps().size();;

            // Obtém o nome da função
            String functionName = ctx.getChild(0).getText();

            String functionId = generateFunctionId( functionName, paramTypesSize);

            fcall = new FunctionCall(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), functionId, exps);
        }

        for (int i = 0; i < ctx.lvalue().size() && this.shouldVisitNextChild(ctx, this.defaultResult()); i++) {
            ParseTree childTree = ctx.lvalue(i);
            fcall.addLValue((LValue) this.aggregateResult(this.defaultResult(), childTree.accept(this)));
        }

        return fcall;
    }

    @Override
    public Node visitRExpCall(RExpCallContext ctx) {
        return super.visitRExpCall(ctx);
    }

    @Override
    public Node visitAndOperation(AndOperationContext ctx) {
        Expression left = (Expression) ctx.getChild(0).accept(this);
        Expression right = (Expression) ctx.getChild(2).accept(this);

        return new And(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), left, right);
    }

    @Override
    public Node visitAExpCall(AExpCallContext ctx) {
        return super.visitAExpCall(ctx);
    }

    @Override
    public Node visitLessThan(LessThanContext ctx) {
        Expression left = (Expression) ctx.getChild(0).accept(this);
        Expression right = (Expression) ctx.getChild(2).accept(this);

        return new LessThan(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), left, right);
    }

    @Override
    public Node visitEquality(EqualityContext ctx) {
        Expression left = (Expression) ctx.getChild(0).accept(this);
        Expression right = (Expression) ctx.getChild(2).accept(this);

        return new Equality(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), left, right);
    }

    @Override
    public Node visitDifference(DifferenceContext ctx) {
        Expression left = (Expression) ctx.getChild(0).accept(this);
        Expression right = (Expression) ctx.getChild(2).accept(this);

        return new Difference(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), left, right);
    }

    @Override
    public Node visitAdditionOperation(AdditionOperationContext ctx) {
        Expression left = (Expression) ctx.getChild(0).accept(this);
        Expression right = (Expression) ctx.getChild(2).accept(this);

        return new Addition(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), left, right);
    }

    @Override
    public Node visitSubtractionOperation(SubtractionOperationContext ctx) {
        Expression left = (Expression) ctx.getChild(0).accept(this);
        Expression right = (Expression) ctx.getChild(2).accept(this);

        return new Subtraction(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), left, right);
    }

    @Override
    public Node visitMExpCall(MExpCallContext ctx) {
        return super.visitMExpCall(ctx);
    }

    @Override
    public Node visitDivisionOperation(DivisionOperationContext ctx) {
        Expression left = (Expression) ctx.getChild(0).accept(this);
        Expression right = (Expression) ctx.getChild(2).accept(this);

        return new Division(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), left, right);
    }

    @Override
    public Node visitSExpCall(SExpCallContext ctx) {
        return super.visitSExpCall(ctx);
    }

    @Override
    public Node visitMultiplicationOperation(MultiplicationOperationContext ctx) {
        Expression left = (Expression) ctx.getChild(0).accept(this);
        Expression right = (Expression) ctx.getChild(2).accept(this);

        return new Multiplication(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), left, right);
    }

    @Override
    public Node visitModularOperation(ModularOperationContext ctx) {
        Expression left = (Expression) ctx.getChild(0).accept(this);
        Expression right = (Expression) ctx.getChild(2).accept(this);

        return new Modular(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), left, right);
    }

    @Override
    public Node visitNot(NotContext ctx) {
        Expression exp = (Expression) ctx.getChild(1).accept(this);

        return new Not(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exp);
    }

    @Override
    public Node visitMinus(MinusContext ctx) {
        Expression exp = (Expression) ctx.getChild(1).accept(this);

        return new Minus(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exp);
    }

    @Override
    public Node visitTrue(TrueContext ctx) {
        return new BooleanValue(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                Boolean.parseBoolean(ctx.getChild(0).getText()));
    }

    @Override
    public Node visitFalse(FalseContext ctx) {
        return new BooleanValue(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                Boolean.parseBoolean(ctx.getChild(0).getText()));
    }

    @Override
    public Node visitNull(NullContext ctx) {
        return new Null(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
    }

    @Override
    public Node visitIntegerNumber(IntegerNumberContext ctx) {
        return new IntegerNumber(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), Integer.parseInt(ctx.getChild(0).getText()));
    }

    @Override
    public Node visitFloatNumber(FloatNumberContext ctx) {
        return new FloatNumber(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), Float.parseFloat(ctx.FLOAT().getText()));
    }

    @Override
    public Node visitCharLitteral(CharLitteralContext ctx) {
        return new CharLitteral(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                ctx.CHAR().getText());
    }

    @Override
    public Node visitPExpCall(PExpCallContext ctx) {
        return super.visitPExpCall(ctx);
    }

    @Override
    public Node visitPexpIdentifier(PexpIdentifierContext ctx) {
        return super.visitPexpIdentifier(ctx);
    }

    @Override
    public Node visitExpParenthesis(ExpParenthesisContext ctx) {
        return (Expression) ctx.getChild(1).accept(this);
    }

    @Override
    public Node visitTypeInstanciate(TypeInstanciateContext ctx) {
        if(ctx.type().accept(this) instanceof NameType){
            // caso seja um ARRAY DE DATA
            if (ctx.exp() != null){
                Expression exp = (Expression) ctx.exp().accept(this);
                return new TypeInstanciate(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exp, ctx.type().getText());
            }
            else{   // Caso seja somente o TIPO DATA MESMO
                return new TypeInstanciate(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.type().getText());
            }
        }

        // caso seja um new array, aceita a expressao
        if (ctx.exp() != null){
            Expression exp = (Expression) ctx.exp().accept(this);
            Type type = (Type) ctx.type().accept(this);
            return new TypeInstanciate(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exp, type);
        }
        else {  // caso nao seja um new array, só aceita o type mesmo
            Type type = (Type) ctx.type().accept(this);
            return new TypeInstanciate(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), type);
        }
    }

    @Override
    public Node visitFunctionReturn(FunctionReturnContext ctx) {
        String str = ctx.ID().getText();
        FCallParams fCallPar = (FCallParams) ctx.exps().accept(this);
        Expression exp = (Expression) ctx.exp().accept(this);
        return new FunctionReturn(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), str, fCallPar, exp);
    }

    @Override
    public Node visitArrayAccess(ArrayAccessContext ctx) {
        LValue lVal = (LValue) ctx.getChild(0).accept(this);
        Expression exp = (Expression) ctx.getChild(2).accept(this);

        return new ArrayAccess(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), lVal, exp);
    }

    @Override
    public Node visitIdentifier(IdentifierContext ctx) {

        return new Identifier(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                ctx.ID().getText());
    }


    @Override
    public Node visitDataAccess(DataAccessContext ctx) {
        LValue lVal = (LValue) ctx.lvalue().accept(this);
        String str = ctx.getChild(2).getText();
        String dataId = ctx.lvalue().getText();
        return new DataAccess(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), lVal, str, dataId);
    }

    @Override
    public Node visitFCallParams(FCallParamsContext ctx) {
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
