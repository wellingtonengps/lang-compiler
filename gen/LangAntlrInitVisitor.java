// Generated from D:/03 - Repositorio Local/03 - UFJF/06 - Compiladores/LangAntlr/lang-antlr/src/main/antlr4/org/compiler/LangAntlr/LangAntlrInitLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangAntlrInitParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangAntlrInitVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangAntlrInitParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LangAntlrInitParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangAntlrInitParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(LangAntlrInitParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangAntlrInitParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(LangAntlrInitParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangAntlrInitParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(LangAntlrInitParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangAntlrInitParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LangAntlrInitParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangAntlrInitParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(LangAntlrInitParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangAntlrInitParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LangAntlrInitParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangAntlrInitParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBtype(LangAntlrInitParser.BtypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brances}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrances(LangAntlrInitParser.BrancesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(LangAntlrInitParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(LangAntlrInitParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterate}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterate(LangAntlrInitParser.IterateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(LangAntlrInitParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LangAntlrInitParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(LangAntlrInitParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assing}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssing(LangAntlrInitParser.AssingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(LangAntlrInitParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangAntlrInitParser#lvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalues(LangAntlrInitParser.LvaluesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link LangAntlrInitParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(LangAntlrInitParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicsExprs}
	 * labeled alternative in {@link LangAntlrInitParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicsExprs(LangAntlrInitParser.LogicsExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicExp}
	 * labeled alternative in {@link LangAntlrInitParser#rexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExp(LangAntlrInitParser.LogicExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicsExprs}
	 * labeled alternative in {@link LangAntlrInitParser#rexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicsExprs(LangAntlrInitParser.BasicsExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusMinus}
	 * labeled alternative in {@link LangAntlrInitParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(LangAntlrInitParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreExprs}
	 * labeled alternative in {@link LangAntlrInitParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreExprs(LangAntlrInitParser.MoreExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link LangAntlrInitParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivMod(LangAntlrInitParser.MultDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExprs}
	 * labeled alternative in {@link LangAntlrInitParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExprs(LangAntlrInitParser.LiteralExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(LangAntlrInitParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(LangAntlrInitParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(LangAntlrInitParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(LangAntlrInitParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code null}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(LangAntlrInitParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LangAntlrInitParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(LangAntlrInitParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(LangAntlrInitParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LangAntlrInitParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code acessorValue}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcessorValue(LangAntlrInitParser.AcessorValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value}
	 * labeled alternative in {@link LangAntlrInitParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LangAntlrInitParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link LangAntlrInitParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(LangAntlrInitParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link LangAntlrInitParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(LangAntlrInitParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link LangAntlrInitParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(LangAntlrInitParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idVector}
	 * labeled alternative in {@link LangAntlrInitParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdVector(LangAntlrInitParser.IdVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LangAntlrInitParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LangAntlrInitParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code acessorID}
	 * labeled alternative in {@link LangAntlrInitParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcessorID(LangAntlrInitParser.AcessorIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangAntlrInitParser#exps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExps(LangAntlrInitParser.ExpsContext ctx);
}