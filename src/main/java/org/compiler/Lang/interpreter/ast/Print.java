/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class Print extends Command {

    private Expression exp;

    public Print (int line, int column, Expression exp){
        super(line, column);
        this.exp = exp;
    }

    public Expression getExpression() {
        return exp;
    }   

    @Override
    public String toString(){
        return " print " + exp.toString() + " ; ";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}