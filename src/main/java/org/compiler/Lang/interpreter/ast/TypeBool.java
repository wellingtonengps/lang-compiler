/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class TypeBool extends Type{
    /**
     * ---- Regra
     * btype: BOOL_TYPE     # BTypeBool
    */
    public TypeBool(int line, int column){
        super(line, column);
    }    

    @Override
    public String toString(){
        return "Bool";
    }

    @Override
    public void accept(Visitor v){ 
        v.visit(this);
    }
}
