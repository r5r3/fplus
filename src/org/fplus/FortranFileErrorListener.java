package org.fplus;

import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

/**
 * React on errors found during parsing.
 *
 * @author Robert Redl
 */
public class FortranFileErrorListener implements ANTLRErrorListener {

    int nerrors = 0;
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        System.err.println("line "+line+":"+charPositionInLine+":");
        String[] lines = msg.split("\n");
        for (String oneline:lines) System.err.println(oneline);
        underlineError(recognizer,(Token)offendingSymbol, line, charPositionInLine);
        nerrors += 1;
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int line, int charPositionInLine, boolean bln, BitSet bitset, ATNConfigSet atncs) {
        //System.err.println("fplus internal ambiguity error in line "+line+":"+charPositionInLine);
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
        // don't care for now!
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
        // don't care for now!
    }

    protected void underlineError(Recognizer recognizer,
            Token offendingToken, int line,
            int charPositionInLine) {
        CommonTokenStream tokens = (CommonTokenStream) recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        System.err.println(errorLine);
        for (int i = 0; i < charPositionInLine; i++) {
            System.err.print(" ");
        }
        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();
        if (start >= 0 && stop >= 0) {
            for (int i = start; i <= stop; i++) {
                System.err.print("^");
            }
        }
        System.err.println();
    }
    
    /**
     *  stop further processing if errors are present
     */
    public void exitIfErrorsWereFound() {
        if (nerrors > 0) {
            System.err.println("\nfound "+nerrors+" errors!");
            System.exit(-1);
        }
    }
}
