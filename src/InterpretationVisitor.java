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

        return super.visitNormVariable(ctx);
    }

    @Override
    public DataType visitOpExpr(GrammarParser.OpExprContext ctx) {
        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (left == DataType.INT && right == DataType.INT){
            return DataType.INT;
        } else if (left != DataType.INT){
            throw new IllegalArgumentException("Left is not of DataType INT");
        } else {
            throw new IllegalArgumentException("Right is not of Datatype INT");
        }
    }

    @Override
    public DataType visitAtomExpr(GrammarParser.AtomExprContext ctx) {
        DataType number = visit(ctx.INT());
        if (number == DataType.INT){
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

        if (left == DataType.INT && right == DataType.INT){
            return DataType.BOOL;
        } else if (left != DataType.INT){
            throw new IllegalArgumentException("Left is not of DataType int");
        } else {
            throw new IllegalArgumentException("Right is not of Datatype int");
        }
    }

//    @Override
//    public Object visitOpExpr(GrammarParser.OpExprContext ctx) {
//        // get left & right number and the operator
//        int left = (int) visit(ctx.left);
//        int right = (int) visit(ctx.right);
//        String op = ctx.op.getText();
//
//        // check with which operator a calculation has to be made
//        switch (op.charAt(0)) {
//            case '+': return left + right;
//            case '-': return left - right;
//            case '*': return left * right;
//            case '/': return left / right;
//            case '%': return left % right;
//            default: throw new IllegalArgumentException("Illegal operator: " + op);
//        }
//    }
//
//    @Override
//    public Object visitLogaExpr(GrammarParser.LogaExprContext ctx) {
//        // get left & right number and the operator
//        int left = (int) visit(ctx.left);
//        int right = (int) visit(ctx.right);
//        String op = ctx.op.getText();
//
//        // check with which operator a calculation has to be made
//        switch (op) {
//            case "<": return left < right;
//            case "<=": return left <= right;
//            case "==": return left == right;
//            case "!=": return left != right;
//            case ">=": return left >= right;
//            case ">": return left > right;
////            case "AND": return left || right;
//
//            default: throw new IllegalArgumentException("Illegal operator: " + op);
//        }
//    }



}
