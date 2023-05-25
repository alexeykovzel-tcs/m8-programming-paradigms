// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block3/cc/tabular/Tabular.g4 by ANTLR 4.12.0
package block3.cc.tabular;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TabularParser}.
 */
public interface TabularListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TabularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TabularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TabularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabularParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(TabularParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabularParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(TabularParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabularParser#tabular}.
	 * @param ctx the parse tree
	 */
	void enterTabular(TabularParser.TabularContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabularParser#tabular}.
	 * @param ctx the parse tree
	 */
	void exitTabular(TabularParser.TabularContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabularParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(TabularParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabularParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(TabularParser.RowContext ctx);
}