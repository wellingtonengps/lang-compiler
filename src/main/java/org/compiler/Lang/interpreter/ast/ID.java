/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class ID extends Expression{
    private String value;

    public ID(int line, int column, String value){
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
