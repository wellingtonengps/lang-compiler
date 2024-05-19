// Generated from D:/03 - Repositorio Local/03 - UFJF/06 - Compiladores/LangAntlr/lang-antlr/src/main/antlr4/org/compiler/Lang/LangParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(LangParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(LangParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(LangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(LangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(LangParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(LangParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(LangParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(LangParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(LangParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(LangParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterBtype(LangParser.BtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitBtype(LangParser.BtypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brances}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterBrances(LangParser.BrancesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brances}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitBrances(LangParser.BrancesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterIf(LangParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitIf(LangParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(LangParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(LangParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterate}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterIterate(LangParser.IterateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterate}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitIterate(LangParser.IterateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterRead(LangParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitRead(LangParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterReturn(LangParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitReturn(LangParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assing}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterAssing(LangParser.AssingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assing}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitAssing(LangParser.AssingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(LangParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(LangParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#lvalues}.
	 * @param ctx the parse tree
	 */
	void enterLvalues(LangParser.LvaluesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#lvalues}.
	 * @param ctx the parse tree
	 */
	void exitLvalues(LangParser.LvaluesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(LangParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(LangParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicsExprs}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLogicsExprs(LangParser.LogicsExprsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicsExprs}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLogicsExprs(LangParser.LogicsExprsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicExp}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterLogicExp(LangParser.LogicExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicExp}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitLogicExp(LangParser.LogicExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basicsExprs}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterBasicsExprs(LangParser.BasicsExprsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basicsExprs}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitBasicsExprs(LangParser.BasicsExprsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusMinus}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(LangParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusMinus}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(LangParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moreExprs}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterMoreExprs(LangParser.MoreExprsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moreExprs}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitMoreExprs(LangParser.MoreExprsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterMultDivMod(LangParser.MultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitMultDivMod(LangParser.MultDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExprs}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExprs(LangParser.LiteralExprsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExprs}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExprs(LangParser.LiteralExprsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterNot(LangParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitNot(LangParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterMinus(LangParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitMinus(LangParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterTrue(LangParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitTrue(LangParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterFalse(LangParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitFalse(LangParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code null}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterNull(LangParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code null}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitNull(LangParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterInt(LangParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitInt(LangParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterFloat(LangParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitFloat(LangParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterChar(LangParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitChar(LangParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LangParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code acessorValue}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterAcessorValue(LangParser.AcessorValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code acessorValue}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitAcessorValue(LangParser.AcessorValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterValue(LangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitValue(LangParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(LangParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(LangParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterNew(LangParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitNew(LangParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(LangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(LangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idVector}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterIdVector(LangParser.IdVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idVector}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitIdVector(LangParser.IdVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterId(LangParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitId(LangParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code acessorID}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterAcessorID(LangParser.AcessorIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code acessorID}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitAcessorID(LangParser.AcessorIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#exps}.
	 * @param ctx the parse tree
	 */
	void enterExps(LangParser.ExpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#exps}.
	 * @param ctx the parse tree
	 */
	void exitExps(LangParser.ExpsContext ctx);
}