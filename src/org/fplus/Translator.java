package org.fplus;

import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.fplus.parser.fplusBaseListener;
import org.fplus.parser.fplusLexer;
import org.fplus.parser.fplusParser;

/**
 * The actual work is done within this class. 
 * 
 * @author
 * Robert Schuster
 */
public class Translator extends fplusBaseListener {

    // a reference to the parser itself
    private fplusParser parser = null;
    private CharStream charstream = null;
    private TokenStream tokenstream = null;
    
    // all expensions are stored in parse tree properties
    private ParseTreeProperty<String> expansions = new ParseTreeProperty<String>();
    
    // the complete translation
    private StringBuilder translation = null;

    public Translator(fplusParser parser) {
        this.parser = parser;
        this.tokenstream = parser.getInputStream();
        this.charstream = tokenstream.getTokenSource().getInputStream();
    }
    
    /**
     * Store the expansion for a node
     * @param ctx
     * @param expansion
     */
    private void setExpansion(ParseTree ctx, String expansion) {
        this.expansions.put(ctx, expansion);
    }
    
    private String getExpansion(ParseTree ctx) {
        return this.expansions.get(ctx);
    }
    
    @Override
    public void exitLoopBlock(fplusParser.LoopBlockContext ctx) {
        //create the loop variable
        Variable loop_variable = getList(ctx.loopBegin().listAssignment());
        // look for variables to replace in the loop body
        int start = ctx.loopBlockContent().getStart().getTokenIndex();
        int stop = ctx.loopBlockContent().getStop().getTokenIndex();
        Token placeholder = null;
        for (int i=start; i<=stop; i++) {
            Token currentToken = tokenstream.get(i);
            if (currentToken.getType() == fplusLexer.Placeholder 
                    && getIdentifierFromPlaceholder(currentToken).equalsIgnoreCase(loop_variable.name)) {
                placeholder = currentToken;
            }
        }
        // any placeholders found? if so, replace the expansion
        if (placeholder != null) {
            // get the complete text contained in the loop
            String text = this.getExpansion(ctx.loopBlockContent());
            // loop over all values of the loop variable
            StringBuilder buffer = new StringBuilder();
            for (String val:loop_variable.values) {
                buffer.append(text.replace(placeholder.getText(), val));
            }
            this.setExpansion(ctx.loopBlockContent(), buffer.toString());
        }
        
        //merge and filter the content of this block
        mergeRuleExpansions(ctx);
        this.setExpansion(ctx, removePrefixedLines(this.getExpansion(ctx)));
    }

    
    
    /**
     * this method is used to store the expansion of every rule.
     * This expansion is changed for some Rules in the exit methods.
     * @param ctx 
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        this.setExpansion(ctx, ctx.getText());
    }

    /**
     * Merge the Expansions from all children
     * @param ctx 
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // some rules have there own merging method
        if (ctx instanceof fplusParser.LoopBlockContext) return;
        
        mergeRuleExpansions(ctx);
    }

    /**
     * Combine the Expansions from all children of a rule
     * @param ctx
     */
    private void mergeRuleExpansions(ParserRuleContext ctx) {
        StringBuilder buffer = new StringBuilder();
        for (int i=0; i<ctx.getChildCount();i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof ParserRuleContext) {
                String expansion = this.getExpansion(child);
                buffer.append(expansion);
                //System.out.println(expansion);
            } else {
                buffer.append(child.getText());
            }
        }
        if (buffer.length() > 0) this.setExpansion(ctx, buffer.toString());

        // store the final result if this head node
        if (ctx instanceof fplusParser.FortranFileContext) {
            translation = buffer;
            System.out.println("");
            System.out.println("RESULT:");
            System.out.println(translation);
        }        
    }
    
    /**
     * Remove lines that start with !$FP
     * @param text
     * @return
     */
    private String removePrefixedLines(String text) {
        StringBuilder buffer = new StringBuilder();
        String[] lines = text.split("\n");
        for (String line:lines) {
            if (!line.trim().startsWith("!$FP")) buffer.append(line).append("\n");
        }
        return buffer.toString();
    }
    /**
     * Extracts the Identifier used in a Placeholder
     * @param tok
     * @return
     */
    private String getIdentifierFromPlaceholder(Token tok) {
        if (tok.getType() == fplusParser.Placeholder) {
            return charstream.getText(new Interval(tok.getStartIndex()+2, tok.getStopIndex()-1));
        }
        return null;
    }
    
    /**
     * Creates a new Variable from a List Assignment
     * @param ctx
     * @return
     */
    private Variable getList(fplusParser.ListAssignmentContext ctx) {
        // create the variable
        String name = ctx.Identifier().getText();
        Variable result = new Variable(name);
        // store the values, try at first the do loop like innitialization: name = start, ende
        List<TerminalNode> ints =  ctx.IntegerConstant();
        if (!ints.isEmpty()) {
            int start = Integer.parseInt(ints.get(0).getText());
            int end = Integer.parseInt(ints.get(1).getText());
            for (int i=start; i<=end; i++) {
                result.addValue(Integer.toString(i));
            }
        // try the list like initialization
        } else {
            List<fplusParser.ListItemContext> items = ctx.list().listItem();
            for (int i=0;i<items.size();i++) {
                Token start = items.get(i).getStart();
                Token stop = items.get(i).getStop();
                if (start == stop) {
                    result.addValue(start.getText());
                } else {
                    // skip the '{' and '}'
                    int startindex = start.getTokenIndex();
                    int stopindex = stop.getTokenIndex();
                    if (startindex+1 == stopindex) {
                        result.addValue("");
                    } else {
                        start = tokenstream.get(startindex+1);
                        stop = tokenstream.get(stopindex-1);
                        Interval range = new Interval(start.getStartIndex(), stop.getStopIndex());
                        result.addValue(charstream.getText(range));
                    }
                }
            }
        }
        return result;        
    }
}
