// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block3/cc/antlr/TypedCalcAttr.g4 by ANTLR 4.12.0
package block3.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TypedCalcAttrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TypedCalcAttrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TypedCalcAttrParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TypedCalcAttrParser.ExprContext ctx);
}