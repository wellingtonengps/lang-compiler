/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class Read extends Command {

    private LValue lvalue;

    public Read (int line, int column, LValue lvalue){
        super(line, column);
        this.lvalue = lvalue;
    }

    @Override
    public String toString(){
        return " read " + lvalue.toString() + " ; ";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public LValue getLValue() {
        return lvalue;
    }
}