/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class Difference extends BinOP{
    /**
     * ---- Regra
     *  rexp: <assoc=left> rexp DIFFERENCE aexp  # Difference
    */
    public Difference(int line, int column, Expression left, Expression right) {
        super(line, column, left, right);
    }

    @Override
    public String toString(){
        return left.toString() + " != " + right.toString();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
