// Generated from D:/03 - Repositorio Local/03 - UFJF/06 - Compiladores/lang-compiler/src/main/antlr4/org/compiler/Lang/LangParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code program}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code program}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataDeclaration}
	 * labeled alternative in {@link LangParser#data}.
	 * @param ctx the parse tree
	 */
	void enterDataDeclaration(LangParser.DataDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataDeclaration}
	 * labeled alternative in {@link LangParser#data}.
	 * @param ctx the parse tree
	 */
	void exitDataDeclaration(LangParser.DataDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link LangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(LangParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link LangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(LangParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link LangParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link LangParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parametersFunction}
	 * labeled alternative in {@link LangParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParametersFunction(LangParser.ParametersFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parametersFunction}
	 * labeled alternative in {@link LangParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParametersFunction(LangParser.ParametersFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDeclaration}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(LangParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDeclaration}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(LangParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bTypeCall}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBTypeCall(LangParser.BTypeCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bTypeCall}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBTypeCall(LangParser.BTypeCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bTypeInt}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterBTypeInt(LangParser.BTypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bTypeInt}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitBTypeInt(LangParser.BTypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bTypeFloat}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterBTypeFloat(LangParser.BTypeFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bTypeFloat}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitBTypeFloat(LangParser.BTypeFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bTypeChar}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterBTypeChar(LangParser.BTypeCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bTypeChar}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitBTypeChar(LangParser.BTypeCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bTypeBool}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterBTypeBool(LangParser.BTypeBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bTypeBool}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitBTypeBool(LangParser.BTypeBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bTypeNameType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterBTypeNameType(LangParser.BTypeNameTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bTypeNameType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitBTypeNameType(LangParser.BTypeNameTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commandsList}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCommandsList(LangParser.CommandsListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commandsList}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCommandsList(LangParser.CommandsListContext ctx);
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
	 * Enter a parse tree produced by the {@code attribution}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterAttribution(LangParser.AttributionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribution}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitAttribution(LangParser.AttributionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(LangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(LangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andOperation}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAndOperation(LangParser.AndOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andOperation}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAndOperation(LangParser.AndOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpCall}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRExpCall(LangParser.RExpCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpCall}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRExpCall(LangParser.RExpCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aExpCall}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterAExpCall(LangParser.AExpCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aExpCall}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitAExpCall(LangParser.AExpCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(LangParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(LangParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code difference}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterDifference(LangParser.DifferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code difference}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitDifference(LangParser.DifferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equality}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterEquality(LangParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitEquality(LangParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractionOperation}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionOperation(LangParser.SubtractionOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractionOperation}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionOperation(LangParser.SubtractionOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mExpCall}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterMExpCall(LangParser.MExpCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mExpCall}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitMExpCall(LangParser.MExpCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionOperation}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionOperation(LangParser.AdditionOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionOperation}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionOperation(LangParser.AdditionOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationOperation}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationOperation(LangParser.MultiplicationOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationOperation}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationOperation(LangParser.MultiplicationOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modularOperation}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterModularOperation(LangParser.ModularOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modularOperation}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitModularOperation(LangParser.ModularOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sExpCall}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterSExpCall(LangParser.SExpCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sExpCall}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitSExpCall(LangParser.SExpCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionOperation}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterDivisionOperation(LangParser.DivisionOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionOperation}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitDivisionOperation(LangParser.DivisionOperationContext ctx);
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
	 * Enter a parse tree produced by the {@code integerNumber}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterIntegerNumber(LangParser.IntegerNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerNumber}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitIntegerNumber(LangParser.IntegerNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatNumber}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterFloatNumber(LangParser.FloatNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatNumber}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitFloatNumber(LangParser.FloatNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charLitteral}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterCharLitteral(LangParser.CharLitteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charLitteral}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitCharLitteral(LangParser.CharLitteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pExpCall}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterPExpCall(LangParser.PExpCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pExpCall}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitPExpCall(LangParser.PExpCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pexpIdentifier}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterPexpIdentifier(LangParser.PexpIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pexpIdentifier}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitPexpIdentifier(LangParser.PexpIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expParenthesis}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterExpParenthesis(LangParser.ExpParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expParenthesis}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitExpParenthesis(LangParser.ExpParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeInstanciate}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterTypeInstanciate(LangParser.TypeInstanciateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeInstanciate}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitTypeInstanciate(LangParser.TypeInstanciateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionReturn}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(LangParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionReturn}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(LangParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LangParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LangParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataAccess}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterDataAccess(LangParser.DataAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataAccess}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitDataAccess(LangParser.DataAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(LangParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(LangParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fCallParams}
	 * labeled alternative in {@link LangParser#exps}.
	 * @param ctx the parse tree
	 */
	void enterFCallParams(LangParser.FCallParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fCallParams}
	 * labeled alternative in {@link LangParser#exps}.
	 * @param ctx the parse tree
	 */
	void exitFCallParams(LangParser.FCallParamsContext ctx);
}