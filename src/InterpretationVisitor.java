import nl.saxion.cos.generated.GrammarBaseVisitor;
import nl.saxion.cos.generated.GrammarParser;

import java.io.ObjectInputStream;

/**
 * InterpretationVisitor for type checking.
 *
 * Created by maurice_2 on 16-2-2017.
 */
class InterpretationVisitor extends GrammarBaseVisitor<Object> {

    @Override
    public Object visitOpExpr(GrammarParser.OpExprContext ctx) {
        // get left & right number and the operator
        int left = (int) visit(ctx.left);
        int right = (int) visit(ctx.right);
        String op = ctx.op.getText();

        // check with which operator a calculation has to be made
        switch (op.charAt(0)) {
            case '+': return left + right;
            case '-': return left - right;
            case '*': return left * right;
            case '/': return left / right;
            case '%': return left % right;
            default: throw new IllegalArgumentException("Illegal operator: " + op);
        }
    }

    @Override
    public Object visitLogaExpr(GrammarParser.LogaExprContext ctx) {
        // get left & right number and the operator
        int left = (int) visit(ctx.left);
        int right = (int) visit(ctx.right);
        String op = ctx.op.getText();

        // check with which operator a calculation has to be made
        switch (op) {
            case "<": return left < right;
            case "<=": return left <= right;
            case "==": return left == right;
            case "!=": return left != right;
            case ">=": return left >= right;
            case ">": return left > right;
//            case "AND": return left || right;

            default: throw new IllegalArgumentException("Illegal operator: " + op);
        }
    }

}
