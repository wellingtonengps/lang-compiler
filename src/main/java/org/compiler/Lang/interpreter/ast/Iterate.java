/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class Iterate extends Command {
    /**
     * ---- Regra
     * cmd: ITERATE OPEN_PARENT exp CLOSE_PARENT cmd  # Iterate
    */
    private String it;          // nome do iterate
    private Expression exp;
    private Command cmd;

    public Iterate (int line, int column, String it, Expression exp, Command cmd){
        super(line, column);
        this.it = it;
        this.exp = exp;
        this.cmd = cmd;
    }

    @Override
    public String toString(){
        return it.toString() + " ( " + exp.toString() + " ) " + cmd.toString();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    /*public Iterate getIterate() {
        return it;
    }

    public void setIterate(Iterate it) {
        this.it = it;
    }*/

    public Expression getExp() {
        return exp;
    }

    public void setExp(Expression exp) {
        this.exp = exp;
    }

    public Command getCmd() {
        return cmd;
    }

    public void setCmd(Command cmd) {
        this.cmd = cmd;
    }

}
