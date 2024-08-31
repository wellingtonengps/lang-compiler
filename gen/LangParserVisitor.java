// Generated from D:/03 - Repositorio Local/03 - UFJF/06 - Compiladores/lang-compiler/src/main/antlr4/org/compiler/Lang/LangParser.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by the {@code program}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataDeclaration}
	 * labeled alternative in {@link LangParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDeclaration(LangParser.DataDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link LangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(LangParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link LangParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LangParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parametersFunction}
	 * labeled alternative in {@link LangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersFunction(LangParser.ParametersFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDeclaration}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(LangParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bTypeCall}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBTypeCall(LangParser.BTypeCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bTypeInt}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBTypeInt(LangParser.BTypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bTypeFloat}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBTypeFloat(LangParser.BTypeFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bTypeChar}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBTypeChar(LangParser.BTypeCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bTypeBool}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBTypeBool(LangParser.BTypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bTypeNameType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBTypeNameType(LangParser.BTypeNameTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commandsList}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandsList(LangParser.CommandsListContext ctx);
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
	 * Visit a parse tree produced by the {@code attribution}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribution(LangParser.AttributionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(LangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOperation}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperation(LangParser.AndOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpCall}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpCall(LangParser.RExpCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aExpCall}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAExpCall(LangParser.AExpCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(LangParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code difference}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifference(LangParser.DifferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(LangParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtractionOperation}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionOperation(LangParser.SubtractionOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mExpCall}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMExpCall(LangParser.MExpCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionOperation}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionOperation(LangParser.AdditionOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationOperation}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationOperation(LangParser.MultiplicationOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modularOperation}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModularOperation(LangParser.ModularOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sExpCall}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSExpCall(LangParser.SExpCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisionOperation}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionOperation(LangParser.DivisionOperationContext ctx);
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
	 * Visit a parse tree produced by the {@code integerNumber}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerNumber(LangParser.IntegerNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatNumber}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatNumber(LangParser.FloatNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charLitteral}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLitteral(LangParser.CharLitteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pExpCall}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPExpCall(LangParser.PExpCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pexpIdentifier}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexpIdentifier(LangParser.PexpIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expParenthesis}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParenthesis(LangParser.ExpParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInstanciate}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInstanciate(LangParser.TypeInstanciateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionReturn}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(LangParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LangParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataAccess}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataAccess(LangParser.DataAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(LangParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fCallParams}
	 * labeled alternative in {@link LangParser#exps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFCallParams(LangParser.FCallParamsContext ctx);
}