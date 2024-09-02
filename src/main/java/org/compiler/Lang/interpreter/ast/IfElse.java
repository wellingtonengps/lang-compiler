/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class IfElse extends Command {

    private Expression exp;
    private Command cmd;
    private Command elseCmd;

    public IfElse (int line, int column, Expression exp, Command cmd, Command elseCmd){
        super(line, column);
        this.exp = exp;
        this.cmd = cmd;
        this.elseCmd = elseCmd;
    }

    @Override
    public String toString(){
        return  " if ( " + exp.toString() + " ) " + cmd.toString() + " else " + elseCmd.toString();
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

    public Command getElseCmd() {
        return elseCmd;
    }    
}
