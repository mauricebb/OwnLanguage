import nl.saxion.cos.generated.GrammarBaseVisitor;
import nl.saxion.cos.generated.GrammarParser;

import java.util.HashMap;

/**
 * InterpretationVisitor for type checking.
 * <p>
 * Created by maurice_2 on 16-2-2017.
 */
class InterpretationVisitor extends GrammarBaseVisitor<DataType> {
    private HashMap<String, DataType> memory;

    InterpretationVisitor() {
        this.memory = new HashMap<>();
    }

    @Override
    public DataType visitNormVariable(GrammarParser.NormVariableContext ctx) {
        String id = ctx.ID().getText();
        memory.put(id, visit(ctx.dataType()));
        //int value = super.visit(ctx.dataType());
        //return super.visitNormVariable(ctx);
        return null;
    }

    @Override
    public DataType visitBoolExpr(GrammarParser.BoolExprContext ctx) {
        return DataType.BOOL;
    }

    @Override
    public DataType visitExpr(GrammarParser.ExprContext ctx) {
        return null;
    }

    @Override
    public DataType visitOpExpr(GrammarParser.OpExprContext ctx) {
        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (left == DataType.INT && right == DataType.INT) {
            return DataType.INT;
        } else if (left != DataType.INT) {
            throw new IllegalArgumentException("Left is not of DataType INT");
        } else {
            throw new IllegalArgumentException("Right is not of Datatype INT");
        }
    }

    @Override
    public DataType visitAtomExpr(GrammarParser.AtomExprContext ctx) {
        DataType number = visit(ctx.INT());
        if (number == DataType.INT) {
            return DataType.INT;
        } else {
            throw new IllegalArgumentException("Child is not of DataType INT");
        }
    }

    @Override
    public DataType visitIdExpr(GrammarParser.IdExprContext ctx) {
        return super.visitIdExpr(ctx);
    }

    @Override
    public DataType visitLogaExpr(GrammarParser.LogaExprContext ctx) {
        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (left == DataType.INT && right == DataType.INT) {
            return DataType.BOOL;
        } else if (left != DataType.INT) {
            throw new IllegalArgumentException("Left is not of DataType int");
        } else {
            throw new IllegalArgumentException("Right is not of Datatype int");
        }
    }

    @Override
    public DataType visitPrintStatement(GrammarParser.PrintStatementContext ctx) {
        if (visit(ctx.expr()) == DataType.BOOL) {
            return DataType.BOOL;
        } else if (visit(ctx.expr()) == DataType.INT) {
            return DataType.INT;
        } else {
            throw new IllegalArgumentException("Not a DataType");
        }
    }

    @Override
    public DataType visitReturnStatement(GrammarParser.ReturnStatementContext ctx) {
        if (visit(ctx.expr()) == DataType.BOOL) {
            return DataType.BOOL;
        } else if (visit(ctx.expr()) == DataType.INT) {
            return DataType.INT;
        } else if (visit(ctx.expr()) == DataType.STRING) {
            return DataType.STRING;
        } else {
            throw new IllegalArgumentException("Not a DataType");
        }
    }

    @Override
    public DataType visitCondition(GrammarParser.ConditionContext ctx) {
        if (visit(ctx.BOOLEAN()) == DataType.BOOL) {
            return DataType.BOOL;
        } else {
            throw new IllegalArgumentException("Not a DataType");
        }
    }

}
