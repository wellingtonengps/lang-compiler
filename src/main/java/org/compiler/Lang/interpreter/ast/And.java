/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class And extends BinOP{
    /**
     * ---- Regra
     * exp:<assoc=left> exp AND exp    # AndOperation
    */

    public And(int line, int column, Expression left, Expression right){
        super(line, column, left, right);
    }

    @Override
    public String toString(){
        return (left.toString() + " && " + right.toString());
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
