// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block6/cc/pascal/SimplePascal6.g4 by ANTLR 4.12.0
package pp.block6.cc.pascal;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimplePascal6Parser}.
 */
public interface SimplePascal6Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimplePascal6Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimplePascal6Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascal6Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimplePascal6Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascal6Parser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SimplePascal6Parser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascal6Parser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SimplePascal6Parser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascal6Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(SimplePascal6Parser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascal6Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(SimplePascal6Parser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascal6Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(SimplePascal6Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascal6Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(SimplePascal6Parser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascal6Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimplePascal6Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascal6Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimplePascal6Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link SimplePascal6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssStat(SimplePascal6Parser.AssStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link SimplePascal6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssStat(SimplePascal6Parser.AssStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link SimplePascal6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(SimplePascal6Parser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link SimplePascal6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(SimplePascal6Parser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link SimplePascal6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(SimplePascal6Parser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link SimplePascal6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(SimplePascal6Parser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link SimplePascal6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlockStat(SimplePascal6Parser.BlockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link SimplePascal6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlockStat(SimplePascal6Parser.BlockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inStat}
	 * labeled alternative in {@link SimplePascal6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterInStat(SimplePascal6Parser.InStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inStat}
	 * labeled alternative in {@link SimplePascal6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitInStat(SimplePascal6Parser.InStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outStat}
	 * labeled alternative in {@link SimplePascal6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterOutStat(SimplePascal6Parser.OutStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outStat}
	 * labeled alternative in {@link SimplePascal6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitOutStat(SimplePascal6Parser.OutStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idTarget}
	 * labeled alternative in {@link SimplePascal6Parser#target}.
	 * @param ctx the parse tree
	 */
	void enterIdTarget(SimplePascal6Parser.IdTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idTarget}
	 * labeled alternative in {@link SimplePascal6Parser#target}.
	 * @param ctx the parse tree
	 */
	void exitIdTarget(SimplePascal6Parser.IdTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(SimplePascal6Parser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(SimplePascal6Parser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(SimplePascal6Parser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(SimplePascal6Parser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(SimplePascal6Parser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(SimplePascal6Parser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prfExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrfExpr(SimplePascal6Parser.PrfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prfExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrfExpr(SimplePascal6Parser.PrfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(SimplePascal6Parser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(SimplePascal6Parser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(SimplePascal6Parser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(SimplePascal6Parser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(SimplePascal6Parser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(SimplePascal6Parser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(SimplePascal6Parser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(SimplePascal6Parser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(SimplePascal6Parser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(SimplePascal6Parser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(SimplePascal6Parser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link SimplePascal6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(SimplePascal6Parser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascal6Parser#prfOp}.
	 * @param ctx the parse tree
	 */
	void enterPrfOp(SimplePascal6Parser.PrfOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascal6Parser#prfOp}.
	 * @param ctx the parse tree
	 */
	void exitPrfOp(SimplePascal6Parser.PrfOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascal6Parser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(SimplePascal6Parser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascal6Parser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(SimplePascal6Parser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascal6Parser#plusOp}.
	 * @param ctx the parse tree
	 */
	void enterPlusOp(SimplePascal6Parser.PlusOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascal6Parser#plusOp}.
	 * @param ctx the parse tree
	 */
	void exitPlusOp(SimplePascal6Parser.PlusOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascal6Parser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(SimplePascal6Parser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascal6Parser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(SimplePascal6Parser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascal6Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(SimplePascal6Parser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascal6Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(SimplePascal6Parser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link SimplePascal6Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(SimplePascal6Parser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link SimplePascal6Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(SimplePascal6Parser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link SimplePascal6Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(SimplePascal6Parser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link SimplePascal6Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(SimplePascal6Parser.BoolTypeContext ctx);
}