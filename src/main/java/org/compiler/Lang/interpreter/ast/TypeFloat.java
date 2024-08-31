/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class TypeFloat extends Type{
    /**
     * ---- Regra
     * btype: FLOAT_TYPE    # BTypeFloat
    */
    public TypeFloat(int line, int column){
        super(line, column);
    }    

    @Override
    public String toString(){
        return "Float";
    }

    @Override
    public void accept(Visitor v){ 
        v.visit(this);
    }
}
