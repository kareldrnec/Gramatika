package output;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class GrammarErrorListener extends BaseErrorListener {
    private boolean error;
    private String errorMsg;
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        this.error = true;
        this.errorMsg = recognizer.getClass().getSimpleName() + " ERROR: " + msg;
        //System.exit(0);
    }

    public void set() {
        this.error = false;
    }

    public boolean isError() {
        return this.error;
    }

    public void displayErrMsg() {
        System.err.println(errorMsg);
    }
}
