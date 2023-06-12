// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block6/cc/pascal/FuncPascal6.g4 by ANTLR 4.12.0
package block6.cc.pascal;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FuncPascal6Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FuncPascal6Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FuncPascal6Parser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(FuncPascal6Parser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncPascal6Parser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(FuncPascal6Parser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncPascal6Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(FuncPascal6Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link FuncPascal6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(FuncPascal6Parser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link FuncPascal6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(FuncPascal6Parser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link FuncPascal6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(FuncPascal6Parser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prfExpr}
	 * labeled alternative in {@link FuncPascal6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrfExpr(FuncPascal6Parser.PrfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link FuncPascal6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(FuncPascal6Parser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link FuncPascal6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(FuncPascal6Parser.FalseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link FuncPascal6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(FuncPascal6Parser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link FuncPascal6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(FuncPascal6Parser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link FuncPascal6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(FuncPascal6Parser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link FuncPascal6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpr(FuncPascal6Parser.PlusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link FuncPascal6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(FuncPascal6Parser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncPascal6Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(FuncPascal6Parser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncPascal6Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FuncPascal6Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncPascal6Parser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(FuncPascal6Parser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncPascal6Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(FuncPascal6Parser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncPascal6Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FuncPascal6Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link FuncPascal6Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssStat(FuncPascal6Parser.AssStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link FuncPascal6Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(FuncPascal6Parser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link FuncPascal6Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(FuncPascal6Parser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link FuncPascal6Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStat(FuncPascal6Parser.BlockStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inStat}
	 * labeled alternative in {@link FuncPascal6Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInStat(FuncPascal6Parser.InStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outStat}
	 * labeled alternative in {@link FuncPascal6Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutStat(FuncPascal6Parser.OutStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idTarget}
	 * labeled alternative in {@link FuncPascal6Parser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdTarget(FuncPascal6Parser.IdTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncPascal6Parser#prfOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrfOp(FuncPascal6Parser.PrfOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncPascal6Parser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOp(FuncPascal6Parser.MultOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncPascal6Parser#plusOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOp(FuncPascal6Parser.PlusOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncPascal6Parser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp(FuncPascal6Parser.BoolOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncPascal6Parser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(FuncPascal6Parser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link FuncPascal6Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(FuncPascal6Parser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link FuncPascal6Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(FuncPascal6Parser.BoolTypeContext ctx);
}