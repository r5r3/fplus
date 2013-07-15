package org.fplus;

// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*; 
import org.antlr.v4.runtime.tree.*;
import org.fplus.parser.fplusLexer;
import org.fplus.parser.fplusParser;

/**
 *
 * @author
 * Robert Schuster
 */
public class Fplus {

    /**
     * @param
     * args
     * the
     * command
     * line
     * arguments
     */
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        // create a lexer that feeds off of input CharStream
        fplusLexer lexer = new fplusLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        fplusParser parser = new fplusParser(tokens);
        // begin parsing at fortranFile rule
        ParseTree tree = parser.fortranFile();
        // walk the tree
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new Translator(parser, tree), tree);
    }
}
