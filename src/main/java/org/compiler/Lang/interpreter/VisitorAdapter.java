package org.compiler.Lang.interpreter;

import org.antlr.v4.runtime.tree.ParseTree;
import org.compiler.Lang.LangParser;
import org.compiler.Lang.LangParserBaseVisitor;
import org.compiler.Lang.interpreter.ast.Node;
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
    public Node visitBtype(LangParser.BtypeContext ctx) {
        return super.visitBtype(ctx);
    }

    @Override
    public Node visitBrances(LangParser.BrancesContext ctx) {
        return super.visitBrances(ctx);
    }

    @Override
    public Node visitIf(LangParser.IfContext ctx) {
        return super.visitIf(ctx);
    }

    @Override
    public Node visitIfElse(LangParser.IfElseContext ctx) {
        return super.visitIfElse(ctx);
    }

    @Override
    public Node visitIterate(LangParser.IterateContext ctx) {
        return super.visitIterate(ctx);
    }

    @Override
    public Node visitRead(LangParser.ReadContext ctx) {
        return super.visitRead(ctx);
    }

    @Override
    public Node visitPrint(LangParser.PrintContext ctx) {
        return super.visitPrint(ctx);
    }

    @Override
    public Node visitReturn(LangParser.ReturnContext ctx) {
        return super.visitReturn(ctx);
    }

    @Override
    public Node visitAssing(LangParser.AssingContext ctx) {
        return super.visitAssing(ctx);
    }

    @Override
    public Node visitLessThan(LangParser.LessThanContext ctx) {
        return super.visitLessThan(ctx);
    }

    @Override
    public Node visitType(LangParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Node visitParam(LangParser.ParamContext ctx) {
        return super.visitParam(ctx);
    }

    @Override
    public Node visitParams(LangParser.ParamsContext ctx) {
        return super.visitParams(ctx);
    }

    @Override
    public Node visitLvalues(LangParser.LvaluesContext ctx) {
        return super.visitLvalues(ctx);
    }

    @Override
    public Node visitAndExp(LangParser.AndExpContext ctx) {
        return super.visitAndExp(ctx);
    }

    @Override
    public Node visitLogicsExprs(LangParser.LogicsExprsContext ctx) {
        return super.visitLogicsExprs(ctx);
    }

    @Override
    public Node visitLogicExp(LangParser.LogicExpContext ctx) {
        return super.visitLogicExp(ctx);
    }

    @Override
    public Node visitBasicsExprs(LangParser.BasicsExprsContext ctx) {
        return super.visitBasicsExprs(ctx);
    }

    @Override
    public Node visitPlusMinus(LangParser.PlusMinusContext ctx) {
        return super.visitPlusMinus(ctx);
    }

    @Override
    public Node visitMoreExprs(LangParser.MoreExprsContext ctx) {
        return super.visitMoreExprs(ctx);
    }

    @Override
    public Node visitMultDivMod(LangParser.MultDivModContext ctx) {
        return super.visitMultDivMod(ctx);
    }

    @Override
    public Node visitLiteralExprs(LangParser.LiteralExprsContext ctx) {
        return super.visitLiteralExprs(ctx);
    }

    @Override
    public Node visitNot(LangParser.NotContext ctx) {
        return super.visitNot(ctx);
    }

    @Override
    public Node visitMinus(LangParser.MinusContext ctx) {
        return super.visitMinus(ctx);
    }

    @Override
    public Node visitTrue(LangParser.TrueContext ctx) {
        return super.visitTrue(ctx);
    }

    @Override
    public Node visitFalse(LangParser.FalseContext ctx) {
        return super.visitFalse(ctx);
    }

    @Override
    public Node visitNull(LangParser.NullContext ctx) {
        return super.visitNull(ctx);
    }

    @Override
    public Node visitInt(LangParser.IntContext ctx) {
        return super.visitInt(ctx);
    }

    @Override
    public Node visitFloat(LangParser.FloatContext ctx) {
        return super.visitFloat(ctx);
    }

    @Override
    public Node visitChar(LangParser.CharContext ctx) {
        return super.visitChar(ctx);
    }

    @Override
    public Node visitLiteral(LangParser.LiteralContext ctx) {
        return super.visitLiteral(ctx);
    }

    @Override
    public Node visitAcessorValue(LangParser.AcessorValueContext ctx) {
        return super.visitAcessorValue(ctx);
    }

    @Override
    public Node visitValue(LangParser.ValueContext ctx) {
        return super.visitValue(ctx);
    }

    @Override
    public Node visitParentesis(LangParser.ParentesisContext ctx) {
        return super.visitParentesis(ctx);
    }

    @Override
    public Node visitNew(LangParser.NewContext ctx) {
        return super.visitNew(ctx);
    }

    @Override
    public Node visitFunctionCall(LangParser.FunctionCallContext ctx) {
        return super.visitFunctionCall(ctx);
    }

    @Override
    public Node visitIdVector(LangParser.IdVectorContext ctx) {
        return super.visitIdVector(ctx);
    }

    @Override
    public Node visitId(LangParser.IdContext ctx) {
        return super.visitId(ctx);
    }

    @Override
    public Node visitAcessorID(LangParser.AcessorIDContext ctx) {
        return super.visitAcessorID(ctx);
    }

    @Override
    public Node visitExps(LangParser.ExpsContext ctx) {
        return super.visitExps(ctx);
    }
}
