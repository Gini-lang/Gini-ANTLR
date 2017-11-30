// Generated from C:/Users/Glavo/IdeaProjects/Gini/src/main/antlr4\Gini.g4 by ANTLR 4.7
package org.glavo.gini.compile;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GiniParser}.
 */
public interface GiniListener extends ParseTreeListener {
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