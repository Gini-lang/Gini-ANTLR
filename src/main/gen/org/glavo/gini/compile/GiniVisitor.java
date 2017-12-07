// Generated from C:/Users/Glavo/IdeaProjects/Gini/src/main/antlr4\Gini.g4 by ANTLR 4.7
package org.glavo.gini.compile;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GiniParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GiniVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GiniParser#sourceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFile(GiniParser.SourceFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStatement(GiniParser.LetStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(GiniParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fromImportStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportStatement(GiniParser.FromImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDefineStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefineStatement(GiniParser.FunctionDefineStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link GiniParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(GiniParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#functionReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturnType(GiniParser.FunctionReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#dottedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedName(GiniParser.DottedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GiniParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(GiniParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#exprN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprN(GiniParser.ExprNContext ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(GiniParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(GiniParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#lambdaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpr(GiniParser.LambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#functionParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterList(GiniParser.FunctionParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(GiniParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#functionTypeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeExpr(GiniParser.FunctionTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr3(GiniParser.Expr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr4(GiniParser.Expr4Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr5(GiniParser.Expr5Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr6(GiniParser.Expr6Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr7(GiniParser.Expr7Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr8(GiniParser.Expr8Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr9(GiniParser.Expr9Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr10}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr10(GiniParser.Expr10Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#compareOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOp(GiniParser.CompareOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr11}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr11(GiniParser.Expr11Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr12}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr12(GiniParser.Expr12Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr13}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr13(GiniParser.Expr13Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr14}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr14(GiniParser.Expr14Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr15}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr15(GiniParser.Expr15Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#functionArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgumentList(GiniParser.FunctionArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#expr16}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr16(GiniParser.Expr16Context ctx);
	/**
	 * Visit a parse tree produced by {@link GiniParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(GiniParser.LiteralContext ctx);
}