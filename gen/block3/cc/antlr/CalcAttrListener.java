// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block3/cc/antlr/CalcAttr.g4 by ANTLR 4.12.0
package block3.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcAttrParser}.
 */
public interface CalcAttrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcAttrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalcAttrParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcAttrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalcAttrParser.ExprContext ctx);
}