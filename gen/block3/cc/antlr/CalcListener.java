// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block3/cc/antlr/Calc.g4 by ANTLR 4.12.0
package block3.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPar(CalcParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPar(CalcParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CalcParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CalcParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code times}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTimes(CalcParser.TimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code times}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTimes(CalcParser.TimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlus(CalcParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlus(CalcParser.PlusContext ctx);
}