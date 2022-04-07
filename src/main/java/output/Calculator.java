package output;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Calculator {
    public static void main(String[] args) {
        String[] lines;
        GrammarLexer lexer;
        CommonTokenStream tokens;
        GrammarParser parser;
        ParseTree tree;
        GrammarErrorListener errorListener = new GrammarErrorListener();
        EvalVisitor eval = new EvalVisitor();
        FileParser fp = new FileParser();

        // Validni data
        // System.out.println("--- Validní data ---");
        // fp.setLines("src/main/files/valid.txt");

        // Nevalidni data
        System.out.println("--- Nevalidní data ---");
        fp.setLines("src/main/files/invalid.txt");

        lines = fp.getLines();

        System.out.println("--- Start ---");

        for (int i = 0; i < lines.length; i++) {
            lexer = new GrammarLexer(CharStreams.fromString(lines[i]));
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorListener);
            tokens = new CommonTokenStream(lexer);
            parser = new GrammarParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            tree = parser.program();
            if (errorListener.isError()) {                 // --- chyba v lexeru nebo parseru ---
                System.err.println("Chyba v prikladu na radku: " + (i+1)); // vypis radku souboru
                errorListener.displayErrMsg();
                errorListener.set();
            } else {
                eval.visit(tree);
            }
        }
        System.out.println("--- KONEC ---");
    }

}
