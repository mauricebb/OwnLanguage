import nl.saxion.cos.generated.GrammarLexer;
import nl.saxion.cos.generated.GrammarParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * Represents a compiler
 *
 * Created by maurice_2 on 16-2-2017.
 */
public class Compiler {

    private static void evaluate(String fileName) throws IOException {
        // Step 1 create InputStream
        ANTLRInputStream inputStream = new ANTLRFileStream(fileName);

        // Step 2 create lexer
        GrammarLexer lexer = new GrammarLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Step 3 create parser
        GrammarParser parser = new GrammarParser(tokens);
        GrammarParser.ProgContext tree = parser.prog();

        // Step 4 type checking
        try {
            InterpretationVisitor visitor = new InterpretationVisitor();
            Object result = visitor.visitProg(tree);
            System.out.println("Result " + result);
        } catch(CompileException ce) {
            System.err.println("Error: " + ce.getMessage());
        }
    }

    public static void main( String[] args ) throws IOException {
        evaluate("tests/example1.sl");
    }

}

//    public static void main(String[] args) {
//        try {
//            // Stap 1 lexer
//            GrammarLexer lexer = new GrammarLexer(new ANTLRFileStream("lexer"));
//            CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//            // Stap 2 parser
//            GrammarParser parser = new GrammarParser(tokens);
//            GrammarParser.ProgContext tree = parser.prog();
//
//            // Stap 3 type checking
//            InterpretationVisitor visitor = new InterpretationVisistor();
//            int result = visitor.visitProg(tree);
//            System.out.println("Result " + result);
//
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//
//    }