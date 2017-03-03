import nl.saxion.generated.GrammarLexer;
import nl.saxion.generated.GrammarParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * Created by maurice_2 on 16-2-2017.
 */
public class Compiler {

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
}
