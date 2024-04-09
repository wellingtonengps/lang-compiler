// Generated from D:/03 - Repositorio Local/03 - UFJF/06 - Compiladores/LangAntlr/lang-antlr/src/main/antlr4/org/compiler/LangAntlr/LangAntlrInitLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangAntlrInitParser}.
 */
public interface LangAntlrInitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangAntlrInitParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LangAntlrInitParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangAntlrInitParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LangAntlrInitParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangAntlrInitParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(LangAntlrInitParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangAntlrInitParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(LangAntlrInitParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangAntlrInitParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(LangAntlrInitParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangAntlrInitParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(LangAntlrInitParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangAntlrInitParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(LangAntlrInitParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangAntlrInitParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(LangAntlrInitParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangAntlrInitParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(LangAntlrInitParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangAntlrInitParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(LangAntlrInitParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangAntlrInitParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(LangAntlrInitParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangAntlrInitParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(LangAntlrInitParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangAntlrInitParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LangAntlrInitParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangAntlrInitParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LangAntlrInitParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangAntlrInitParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterBtype(LangAntlrInitParser.BtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangAntlrInitParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitBtype(LangAntlrInitParser.BtypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brances}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterBrances(LangAntlrInitParser.BrancesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brances}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitBrances(LangAntlrInitParser.BrancesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterIf(LangAntlrInitParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitIf(LangAntlrInitParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(LangAntlrInitParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(LangAntlrInitParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterate}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterIterate(LangAntlrInitParser.IterateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterate}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitIterate(LangAntlrInitParser.IterateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterRead(LangAntlrInitParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitRead(LangAntlrInitParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LangAntlrInitParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LangAntlrInitParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterReturn(LangAntlrInitParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitReturn(LangAntlrInitParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assing}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterAssing(LangAntlrInitParser.AssingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assing}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitAssing(LangAntlrInitParser.AssingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(LangAntlrInitParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LangAntlrInitParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(LangAntlrInitParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangAntlrInitParser#lvalues}.
	 * @param ctx the parse tree
	 */
	void enterLvalues(LangAntlrInitParser.LvaluesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangAntlrInitParser#lvalues}.
	 * @param ctx the parse tree
	 */
	void exitLvalues(LangAntlrInitParser.LvaluesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link LangAntlrInitParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(LangAntlrInitParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link LangAntlrInitParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(LangAntlrInitParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicsExprs}
	 * labeled alternative in {@link LangAntlrInitParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLogicsExprs(LangAntlrInitParser.LogicsExprsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicsExprs}
	 * labeled alternative in {@link LangAntlrInitParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLogicsExprs(LangAntlrInitParser.LogicsExprsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicExp}
	 * labeled alternative in {@link LangAntlrInitParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterLogicExp(LangAntlrInitParser.LogicExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicExp}
	 * labeled alternative in {@link LangAntlrInitParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitLogicExp(LangAntlrInitParser.LogicExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basicsExprs}
	 * labeled alternative in {@link LangAntlrInitParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterBasicsExprs(LangAntlrInitParser.BasicsExprsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basicsExprs}
	 * labeled alternative in {@link LangAntlrInitParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitBasicsExprs(LangAntlrInitParser.BasicsExprsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusMinus}
	 * labeled alternative in {@link LangAntlrInitParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(LangAntlrInitParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusMinus}
	 * labeled alternative in {@link LangAntlrInitParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(LangAntlrInitParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moreExprs}
	 * labeled alternative in {@link LangAntlrInitParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterMoreExprs(LangAntlrInitParser.MoreExprsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moreExprs}
	 * labeled alternative in {@link LangAntlrInitParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitMoreExprs(LangAntlrInitParser.MoreExprsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link LangAntlrInitParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterMultDivMod(LangAntlrInitParser.MultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link LangAntlrInitParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitMultDivMod(LangAntlrInitParser.MultDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExprs}
	 * labeled alternative in {@link LangAntlrInitParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExprs(LangAntlrInitParser.LiteralExprsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExprs}
	 * labeled alternative in {@link LangAntlrInitParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExprs(LangAntlrInitParser.LiteralExprsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterNot(LangAntlrInitParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitNot(LangAntlrInitParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterMinus(LangAntlrInitParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitMinus(LangAntlrInitParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterTrue(LangAntlrInitParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitTrue(LangAntlrInitParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterFalse(LangAntlrInitParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitFalse(LangAntlrInitParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code null}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterNull(LangAntlrInitParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code null}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitNull(LangAntlrInitParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterInt(LangAntlrInitParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitInt(LangAntlrInitParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterFloat(LangAntlrInitParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitFloat(LangAntlrInitParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterChar(LangAntlrInitParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitChar(LangAntlrInitParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LangAntlrInitParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LangAntlrInitParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code acessorValue}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterAcessorValue(LangAntlrInitParser.AcessorValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code acessorValue}
	 * labeled alternative in {@link LangAntlrInitParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitAcessorValue(LangAntlrInitParser.AcessorValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value}
	 * labeled alternative in {@link LangAntlrInitParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterValue(LangAntlrInitParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value}
	 * labeled alternative in {@link LangAntlrInitParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitValue(LangAntlrInitParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link LangAntlrInitParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(LangAntlrInitParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link LangAntlrInitParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(LangAntlrInitParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link LangAntlrInitParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterNew(LangAntlrInitParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link LangAntlrInitParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitNew(LangAntlrInitParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link LangAntlrInitParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(LangAntlrInitParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link LangAntlrInitParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(LangAntlrInitParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idVector}
	 * labeled alternative in {@link LangAntlrInitParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterIdVector(LangAntlrInitParser.IdVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idVector}
	 * labeled alternative in {@link LangAntlrInitParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitIdVector(LangAntlrInitParser.IdVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link LangAntlrInitParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterId(LangAntlrInitParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LangAntlrInitParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitId(LangAntlrInitParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code acessorID}
	 * labeled alternative in {@link LangAntlrInitParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterAcessorID(LangAntlrInitParser.AcessorIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code acessorID}
	 * labeled alternative in {@link LangAntlrInitParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitAcessorID(LangAntlrInitParser.AcessorIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangAntlrInitParser#exps}.
	 * @param ctx the parse tree
	 */
	void enterExps(LangAntlrInitParser.ExpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangAntlrInitParser#exps}.
	 * @param ctx the parse tree
	 */
	void exitExps(LangAntlrInitParser.ExpsContext ctx);
}