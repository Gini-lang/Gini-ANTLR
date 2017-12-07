// Generated from C:/Users/Glavo/IdeaProjects/Gini/src/main/antlr4\Gini.g4 by ANTLR 4.7
package org.glavo.gini.compile;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GiniParser}.
 */
public interface GiniListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GiniParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(GiniParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(GiniParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLetStatement(GiniParser.LetStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLetStatement(GiniParser.LetStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(GiniParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(GiniParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fromImportStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFromImportStatement(GiniParser.FromImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fromImportStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFromImportStatement(GiniParser.FromImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDefineStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefineStatement(GiniParser.FunctionDefineStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDefineStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefineStatement(GiniParser.FunctionDefineStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(GiniParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(GiniParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#functionReturnType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturnType(GiniParser.FunctionReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#functionReturnType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturnType(GiniParser.FunctionReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void enterDottedName(GiniParser.DottedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void exitDottedName(GiniParser.DottedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GiniParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GiniParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(GiniParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(GiniParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#exprN}.
	 * @param ctx the parse tree
	 */
	void enterExprN(GiniParser.ExprNContext ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#exprN}.
	 * @param ctx the parse tree
	 */
	void exitExprN(GiniParser.ExprNContext ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(GiniParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(GiniParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(GiniParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(GiniParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#lambdaExpr}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpr(GiniParser.LambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#lambdaExpr}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpr(GiniParser.LambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#functionParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameterList(GiniParser.FunctionParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#functionParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameterList(GiniParser.FunctionParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(GiniParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(GiniParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#functionTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeExpr(GiniParser.FunctionTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#functionTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeExpr(GiniParser.FunctionTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr3(GiniParser.Expr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr3(GiniParser.Expr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterExpr4(GiniParser.Expr4Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitExpr4(GiniParser.Expr4Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr5}.
	 * @param ctx the parse tree
	 */
	void enterExpr5(GiniParser.Expr5Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr5}.
	 * @param ctx the parse tree
	 */
	void exitExpr5(GiniParser.Expr5Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterExpr6(GiniParser.Expr6Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitExpr6(GiniParser.Expr6Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr7}.
	 * @param ctx the parse tree
	 */
	void enterExpr7(GiniParser.Expr7Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr7}.
	 * @param ctx the parse tree
	 */
	void exitExpr7(GiniParser.Expr7Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr8}.
	 * @param ctx the parse tree
	 */
	void enterExpr8(GiniParser.Expr8Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr8}.
	 * @param ctx the parse tree
	 */
	void exitExpr8(GiniParser.Expr8Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr9}.
	 * @param ctx the parse tree
	 */
	void enterExpr9(GiniParser.Expr9Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr9}.
	 * @param ctx the parse tree
	 */
	void exitExpr9(GiniParser.Expr9Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr10}.
	 * @param ctx the parse tree
	 */
	void enterExpr10(GiniParser.Expr10Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr10}.
	 * @param ctx the parse tree
	 */
	void exitExpr10(GiniParser.Expr10Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void enterCompareOp(GiniParser.CompareOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void exitCompareOp(GiniParser.CompareOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr11}.
	 * @param ctx the parse tree
	 */
	void enterExpr11(GiniParser.Expr11Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr11}.
	 * @param ctx the parse tree
	 */
	void exitExpr11(GiniParser.Expr11Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr12}.
	 * @param ctx the parse tree
	 */
	void enterExpr12(GiniParser.Expr12Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr12}.
	 * @param ctx the parse tree
	 */
	void exitExpr12(GiniParser.Expr12Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr13}.
	 * @param ctx the parse tree
	 */
	void enterExpr13(GiniParser.Expr13Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr13}.
	 * @param ctx the parse tree
	 */
	void exitExpr13(GiniParser.Expr13Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr14}.
	 * @param ctx the parse tree
	 */
	void enterExpr14(GiniParser.Expr14Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr14}.
	 * @param ctx the parse tree
	 */
	void exitExpr14(GiniParser.Expr14Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr15}.
	 * @param ctx the parse tree
	 */
	void enterExpr15(GiniParser.Expr15Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr15}.
	 * @param ctx the parse tree
	 */
	void exitExpr15(GiniParser.Expr15Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#functionArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgumentList(GiniParser.FunctionArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#functionArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgumentList(GiniParser.FunctionArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#expr16}.
	 * @param ctx the parse tree
	 */
	void enterExpr16(GiniParser.Expr16Context ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#expr16}.
	 * @param ctx the parse tree
	 */
	void exitExpr16(GiniParser.Expr16Context ctx);
	/**
	 * Enter a parse tree produced by {@link GiniParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GiniParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GiniParser.LiteralContext ctx);
}