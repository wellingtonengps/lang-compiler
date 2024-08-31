/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class TypeData extends Type {

    private String id;

    public TypeData(int line, int column, String  id) {
        super(line, column);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public void setId(String id) {
        this.id = id;
    }
}