import org.antlr.runtime.tree.TreeVisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


/**
 * ${CLASS}
 * Created by joost on 15/03/2017.
 */
class CodeGenerator extends GrammarBaseVisitor<ArrayList<String>>{
    HashMap<String, Integer> storage;

    public CodeGenerator() {
        storage = new HashMap<>();
    }


    @Override
    public ArrayList<String> visitNormVariable(GrammarParser.NormVariableContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String name = ctx.ID().getText();
        //System.out.println(name);
        DataType type = getDataType(ctx.dataType());
        code.add("iconst_0" + "");
        code.add("istore");
        storage.put(name, storage.size());

        if (ctx.normVariableDeclaration() != null){
            visit(ctx.dataType());
        }
        return code;
    }

    @Override
    public ArrayList<String> visitNormVariableDeclaration(GrammarParser.NormVariableDeclarationContext ctx) {
        return null;
    }



    private DataType getDataType(GrammarParser.DataTypeContext context){
        //System.out.println(context.getText());
        return null;
    }

    @Override
    public ArrayList<String> visitAtomExpr(GrammarParser.AtomExprContext ctx) {
        ArrayList<String>code = new ArrayList<>();
        code.add("ldc " + ctx.INT().getText());
        printArray(code);
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
    public ArrayList<String> visitLogIdExpr(GrammarParser.LogIdExprContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("iload " + storage.get(ctx.ID().getText()));
        printArray(code);
        return code;
    }

    @Override
    public ArrayList<String> visitExpr(GrammarParser.ExprContext ctx) {
        ArrayList<String>code = new ArrayList<>();
        code.add("temp");
        return code;
    }

    @Override
    public ArrayList<String> visitLogaExpr(GrammarParser.LogaExprContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        System.out.println(Arrays.toString(new HashMap[]{storage}));
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
        System.out.println(Arrays.toString(new ArrayList[]{code}));
        return code;
    }

    @Override
    public ArrayList<String> visitIdExpr(GrammarParser.IdExprContext ctx) {
        ArrayList<String>code = new ArrayList<>();
        if (storage.containsKey(ctx.ID().getText())){
            code.add("iload" + storage.get(ctx.ID().getText()));
        }
        return code;
    }

    @Override
    public ArrayList<String> visitReturnStatement(GrammarParser.ReturnStatementContext ctx) {
return null;
    }

    private void Log(String prefix, String message){
        System.out.println(prefix + ": " + message);
    }

    private void printArray(ArrayList<String>code){
        System.out.println(Arrays.toString(new ArrayList[]{code}));
    }

}
