// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block2/cc/antlr/Math.g4 by ANTLR 4.12.0
package block2.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathParser}.
 */
public interface MathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MathParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MathParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MathParser.ExprContext ctx);
}