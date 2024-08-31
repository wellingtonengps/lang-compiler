/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class Identifier extends LValue {
    /**
     * ---- Regra
     * lvalue: ID      # Identifier
     *
    */
    
    private String id;

    public Identifier (int line, int column, String id){
        super(line, column);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString(){
        return id.toString();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
