// Generated from /home/glavo/IdeaProjects/Gini/src/main/antlr4/Gini.g4 by ANTLR 4.7
package org.glavo.gini.compile;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GiniParser}.
 */
public interface GiniListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GiniParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(GiniParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link GiniParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(GiniParser.FContext ctx);
}