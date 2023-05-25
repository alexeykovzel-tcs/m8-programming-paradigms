// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block3/cc/antlr/TypedCalc.g4 by ANTLR 4.12.0
package block3.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypedCalcParser}.
 */
public interface TypedCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link TypedCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(TypedCalcParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link TypedCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(TypedCalcParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link TypedCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(TypedCalcParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link TypedCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(TypedCalcParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link TypedCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(TypedCalcParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link TypedCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(TypedCalcParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link TypedCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(TypedCalcParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link TypedCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(TypedCalcParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link TypedCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(TypedCalcParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link TypedCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(TypedCalcParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link TypedCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlus(TypedCalcParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link TypedCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlus(TypedCalcParser.PlusContext ctx);
}