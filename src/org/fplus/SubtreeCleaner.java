/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fplus;

import java.util.HashMap;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.fplus.parser.fplusBaseListener;

/**
 * Used to remove variable definitiions in deeper levels of the tree 
 * to aviod overwrite warnings
 */
public class SubtreeCleaner extends fplusBaseListener {

    private ParserRuleContext head;
    private ParseTreeAnnotations info;
    private ParseTreeWalker walker;

    /**
     * the cleaning is started with the head, the head is also cleaned.
     * @param newhead
     */
    public SubtreeCleaner(ParseTreeAnnotations info, ParserRuleContext newhead) {
        this.head = newhead;
        this.info = info;
        this.walker = new ParseTreeWalker();
    }

    /**
     * perform the cleaning itself.
     */
    public void clean() {
        this.walker.walk(this, head);
    }
    
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // check if we have variables at this position of the tree
        HashMap<String, Variable> vars = info.variables.get(ctx);
        if (vars != null) info.variables.removeFrom(ctx);
    }

}
