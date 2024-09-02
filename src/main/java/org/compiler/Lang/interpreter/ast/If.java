/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class If extends Command {

    private Expression exp;
    private Command cmd;

    public If (int line, int column, Expression exp, Command cmd){
        super(line, column);
        this.exp = exp;
        this.cmd = cmd;
    }

    @Override
    public String toString(){
        return  " if ( " + exp.toString() + " ) " + cmd.toString();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public Expression getExp() {
        return exp;
    }

    public Command getCmd() {
        return cmd;
    }
    
}

