// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block3/cc/tabular/Tabular.g4 by ANTLR 4.12.0
package block3.cc.tabular;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TabularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TabularVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TabularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TabularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TabularParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(TabularParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TabularParser#tabular}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabular(TabularParser.TabularContext ctx);
	/**
	 * Visit a parse tree produced by {@link TabularParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(TabularParser.RowContext ctx);
}