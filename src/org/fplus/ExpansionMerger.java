package org.fplus;

import java.util.GregorianCalendar;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.fplus.parser.fplusBaseListener;
import org.fplus.parser.fplusParser;

/**
 * This class is used in the second pass to merge all expansion created by
 * the visitor. Rule without expansion use their text content as expansion.
 * 
 * @author Robert Redl
 */
public class ExpansionMerger extends fplusBaseListener {
    
    // all informations created by the visitor are stored here
    ParseTreeAnnotations info;
    
    // the result of merging everything
    private StringBuilder result = null;

    public ExpansionMerger(ParseTreeAnnotations info) {
        this.info = info;
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // don't merge rules that have there own expansion methode
        if (info.hasOwnExpansion(ctx)) return;
        
        // merge the children of this rule
        mergeRuleExpansions(ctx);
        
        // is this is the head node, then walk the tree again to get the 
        // changes from interfaces for templates
        if (ctx != info.head) return;
        
        // are there unexpanded interface lines?
        if (!info.interfaceLines.isEmpty()) {
            for (fplusParser.InterfaceLineContext ilc:info.interfaceLines.values()) {
                Logger.Warning(String.format("unused interface line '%s'.", ilc.Identifier().getText()), ilc.Interface().getSymbol().getLine());
            }
        }
        
        // are there unexpanded generic lines?
        if (!info.genericLines.isEmpty()) {
            for (fplusParser.GenericTypeBoundLineContext glc:info.genericLines.values()) {
                Logger.Warning(String.format("unused interface line '%s'.", glc.Identifier().get(glc.Identifier().size()-1).getText()), glc.Generic().getSymbol().getLine());
            }
        }
        
        // store the final result if this head node
        result = new StringBuilder(String.format("%s This file was automatically created by fplus on %s\n", info.LineCommentPrefix, new GregorianCalendar().getTime().toString()));
        result.append(info.getExpansion(ctx));
    }
    
    /**
     *  Returns the result of merging all expansion in this tree
     */
    public String getResult() {
        return result.toString();
    }
    
    /**
     * Combine the Expansions from all children of a rule
     * @param ctx
     */
    public void mergeRuleExpansions(ParserRuleContext ctx) {
        // create the expansion
        StringBuilder buffer = new StringBuilder();
        for (int i=0; i<ctx.getChildCount();i++) {
            ParseTree child = ctx.getChild(i);
            String expansion = info.getExpansion(child);
            if (expansion != null) {
                buffer.append(expansion);
            } else {
                buffer.append(child.getText());
            }
        }
        info.setExpansion(ctx, buffer.toString());
    }   
    
}
