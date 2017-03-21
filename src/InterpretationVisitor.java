import javax.xml.crypto.Data;
import java.util.HashMap;

/**
 * InterpretationVisitor for type checking.
 * <p>
 * Created by maurice_2 on 16-2-2017.
 */
class InterpretationVisitor extends GrammarBaseVisitor<DataType> {
    private HashMap<String, String> memory;

    InterpretationVisitor() {
        this.memory = new HashMap<>();
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
    public DataType visitNormVariable(GrammarParser.NormVariableContext ctx) {
        String id = ctx.ID().getText();
        if (!memory.containsKey(id)) {
            memory.put(id, ctx.dataType().getText());
        }
        return null;
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
        return getDatatype(visit(ctx.expr()));
//        if (visit(ctx.expr()) == DataType.BOOL) {
//            return DataType.BOOL;
//        } else if (visit(ctx.expr()) == DataType.INT) {
//            return DataType.INT;
//        } else if (visit(ctx.expr()) == DataType.STRING) {
//            return DataType.STRING;
//        } else if (visit(ctx.expr()) == null){
//            return DataType.VOID;
//        } else {
//            throw new IllegalArgumentException("Not a DataType");
//        }
    }

    @Override
    public DataType visitReturnStatement(GrammarParser.ReturnStatementContext ctx) {
        return getDatatype(visit(ctx.expr()));
    }


    @Override
    public DataType visitCondition(GrammarParser.ConditionContext ctx) {

        return null;
//        if (visit(ctx.BOOLEAN()) == DataType.BOOL) {
//            return DataType.BOOL;
//        } else {
//            throw new IllegalArgumentException("Not a DataType");
//        }
    }

    private DataType getDatatype(DataType type) {
        if (type == DataType.BOOL) {
            return DataType.BOOL;
        } else if (type == DataType.INT) {
            return DataType.INT;
        } else if (type == DataType.STRING) {
            return DataType.STRING;
        } else if (type == null) {
            return DataType.VOID;
        } else {
            throw new IllegalArgumentException("Not a DataType");
        }
    }

    private DataType getTypeFromMemory(String typeText) {
        if (typeText.equalsIgnoreCase("boolean")) {
            return DataType.BOOL;
        } else if (typeText.equalsIgnoreCase("string")) {
            return DataType.STRING;
        } else if (typeText.equalsIgnoreCase("int")) {
            return DataType.INT;
        } else if (typeText.equalsIgnoreCase("void")) {
            return DataType.VOID;
        } else if (typeText.equalsIgnoreCase("char")) {
            return DataType.CHAR;
        }
        throw new IllegalArgumentException();
    }

}
