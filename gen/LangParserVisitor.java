// Generated from D:/03 - Repositorio Local/03 - UFJF/06 - Compiladores/LangAntlr/lang-antlr/src/main/antlr4/org/compiler/Lang/LangParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(LangParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(LangParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(LangParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LangParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(LangParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBtype(LangParser.BtypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brances}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrances(LangParser.BrancesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(LangParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(LangParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterate}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterate(LangParser.IterateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(LangParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(LangParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assing}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssing(LangParser.AssingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(LangParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#lvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalues(LangParser.LvaluesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(LangParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicsExprs}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicsExprs(LangParser.LogicsExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicExp}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExp(LangParser.LogicExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicsExprs}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicsExprs(LangParser.BasicsExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusMinus}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(LangParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreExprs}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreExprs(LangParser.MoreExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivMod(LangParser.MultDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExprs}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExprs(LangParser.LiteralExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(LangParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(LangParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(LangParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(LangParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code null}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(LangParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LangParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(LangParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(LangParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LangParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code acessorValue}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcessorValue(LangParser.AcessorValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LangParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(LangParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(LangParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(LangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idVector}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdVector(LangParser.IdVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LangParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code acessorID}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcessorID(LangParser.AcessorIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#exps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExps(LangParser.ExpsContext ctx);
}