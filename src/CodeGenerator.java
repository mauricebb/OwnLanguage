import org.antlr.runtime.tree.TreeVisitor;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * ${CLASS}
 * Created by joost on 15/03/2017.
 */
class CodeGenerator extends GrammarBaseVisitor<ArrayList<String>>{
    HashMap<Integer, String> storage;

    public CodeGenerator() {
        storage = new HashMap<>();
    }


    @Override
    public ArrayList<String> visitNormVariable(GrammarParser.NormVariableContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String name = ctx.ID().getText();
        if (ctx.normVariableDeclaration() != null){

        }
        return code;
    }

    @Override
    public ArrayList<String> visitAtomExpr(GrammarParser.AtomExprContext ctx) {
        ArrayList<String>code = new ArrayList<>();
        code.add("ldc " + ctx.INT().getText());
        return code;
    }

    @Override
    public ArrayList<String> visitOpExpr(GrammarParser.OpExprContext ctx) {
        ArrayList<String>code = new ArrayList<>();
        code.addAll(visit(ctx.left));
        code.addAll(visit(ctx.right));
        String op = ctx.op.getText();

        //check with which operator a calculation has to be made
        switch (op.charAt(0)) {
            case '+': code.add("iadd");break;
            case '-': code.add("isub");break;
            case '*': code.add("imul");break;
            case '/': code.add("idiv");break;
            case '%': code.add("irem");break;
            default: throw new IllegalArgumentException("Illegal operator: " + op);
        }
        return code;
    }

    @Override
    public ArrayList<String> visitLogaExpr(GrammarParser.LogaExprContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.left));
        code.addAll(visit(ctx.right));
        String op = ctx.op.getText();
        switch (op){
            case "<": code.add("icmpLT");break;
            case "<=":code.add("icmpLE");break;
            case "==":code.add("icmpEQ");break;
            case "!=":code.add("icmpNE");break;
            case ">=":code.add("icmpGE");break;
            case ">":code.add("icmpGT");break;

            default: throw new IllegalArgumentException("Illegal operator: " + op);
//            case "AND": return left || right;
        }
        return code;
    }

    private void Log(String prefix, String message){
        System.out.println(prefix + ": " + message);
    }
}
