// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block3/cc/antlr/TypedCalcAttr.g4 by ANTLR 4.12.0
package block3.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypedCalcAttrParser}.
 */
public interface TypedCalcAttrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypedCalcAttrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TypedCalcAttrParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypedCalcAttrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TypedCalcAttrParser.ExprContext ctx);
}