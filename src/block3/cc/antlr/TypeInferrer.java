package block3.cc.antlr;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.List;

public class TypeInferrer extends TypedCalcBaseListener {
    private ParseTreeProperty<Type> types;

    public void init() {
        types = new ParseTreeProperty<>();
    }

    public Type typeOf(ParseTree tree) {
        return types.get(tree);
    }

    @Override
    public void exitMult(TypedCalcParser.MultContext ctx) {
        handleOp(ctx, ctx.expr());
    }

    @Override
    public void exitPlus(TypedCalcParser.PlusContext ctx) {
        handleOp(ctx, ctx.expr());
    }

    private void handleOp(TypedCalcParser.ExprContext ctx,
                          List<TypedCalcParser.ExprContext> expr) {
        Type type1 = types.get(expr.get(0));
        Type type2 = types.get(expr.get(1));
        types.put(ctx, type1 == type2 ? type1 : Type.ERR);
    }

    @Override
    public void exitParens(TypedCalcParser.ParensContext ctx) {
        types.put(ctx, types.get(ctx.expr()));
    }

    @Override
    public void exitNumber(TypedCalcParser.NumberContext ctx) {
        types.put(ctx, Type.NUM);
    }

    @Override
    public void exitString(TypedCalcParser.StringContext ctx) {
        types.put(ctx, Type.STR);
    }

    @Override
    public void exitBoolean(TypedCalcParser.BooleanContext ctx) {
        types.put(ctx, Type.BOOL);
    }
}
