/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class ExpParenthesis extends Expression {

    private Expression exp;

    public ExpParenthesis (int line, int column, Expression exp){
        super(line, column);
        this.exp = exp;
    }

    @Override
    public String toString(){
        return " ( " + exp.toString() + " ) ";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
