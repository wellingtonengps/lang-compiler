/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class TypeArray extends Type{

    private Type type;

    public TypeArray(int line, int column, Type type) {
        super(line, column);
        this.type = type;
    }
    
    public Type getType() {
        return type;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return type.toString() + "[]";
    }
}
