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
        // create the container for all informations created during parsing
        ParseTreeAnnotations info = new ParseTreeAnnotations(tree, parser);
        // create a merger for all expansions 
        ExpansionMerger merger = new ExpansionMerger(info);
        // create the visitor used for the first pass
        TreeVisitor visitor = new TreeVisitor(info, merger);
        // use the visitor for the first pass
        visitor.visit(tree);
        // Walk the tree in the second pass to merge everthing
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(merger, tree);
    }
}
