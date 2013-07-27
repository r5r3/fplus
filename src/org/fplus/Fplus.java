package org.fplus;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
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

    @Parameter(description = "input-file")
    private List<String> infile = new ArrayList<String>();

    @Parameter(names="-o", description = "output-file")
    private String outfile = null;
    
    @Parameter(names={"-h", "--help"}, description = "show this help message", help = true)
    private boolean displayHelp = false;

    public Fplus(String[] args) throws Exception {
        // parse the commandline arguments
        JCommander jcmd = new JCommander(this);
        jcmd.setProgramName("fplus");
        jcmd.parse(args);
        // show the usage information
        if (displayHelp == true) {
            System.out.println("fplus is a preprocessor for FORTRAN files.\n");
            jcmd.usage();
            System.exit(-1);
        }
    }
    
    /**
     * Preprocess one single fortran file
     * @param inputStream   read the contents from an input stream
     * @param outputStream  write the result to an output stream
     * @throws IOException
     */
    public void workOnFortranFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
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
        // write the result to the output stream
        PrintStream ps = new PrintStream(outputStream);
        ps.print(merger.getResult());
    }
    
    /**
     * @param
     * args
     * the
     * command
     * line
     * arguments
     */
    public static void main(String[] args) throws Exception {
        // create the Fplus object. That will parse the command line options
        Fplus fplus = new Fplus(args);

        // some argument checks
        if (fplus.infile.size() > 1) {
            Logger.Error("Excactly one input file is expected!", null);
        }
        
        // create input and output streams, use files
        // if given, else use std in and out
        InputStream instr;
        OutputStream outstr;
        if (fplus.infile.isEmpty()) {
            instr = System.in;
        } else {
            File infile = new File(fplus.infile.get(0));
            if (!infile.exists()) Logger.Error("input file not found: "+infile.toString(), null);
            instr = new FileInputStream(infile);
        }
        if (fplus.outfile == null) {
            outstr = System.out;
        } else {
            File outfile = new File(fplus.outfile);
            // the output file is already present, check if we can write to it
            // if not, check if the parent folder exists and is writeable
            if (outfile.exists()) {
                if (!outfile.canWrite()) Logger.Error("the outfile file is not writable: "+outfile.toString(), null);
            } else {
                File parent = outfile.getAbsoluteFile().getParentFile();
                if (!parent.isDirectory()) Logger.Error("folder for output file not found: "+parent.toString(), null);
                if (!parent.canWrite()) Logger.Error("the output folder is not writable: "+parent.toString(), null);
            }
            outstr = new FileOutputStream(outfile);
        }
        
        // work on the file
        fplus.workOnFortranFile(instr, outstr);
        
        // close the streams
        instr.close();
        outstr.flush();
        outstr.close();     
    }
}
