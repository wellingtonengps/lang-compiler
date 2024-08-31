/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class FloatNumber extends LValue{
    /**
     * ---- Regra
     * sexp: FLOAT  # FloatNumber
    */
    private Float value;
    
    public FloatNumber(int line, int column, Float value){
        super(line, column);
        this.value = value;
    }

    public void setValue(Float value){
        this.value = value;
    }

    public Float getValue(){
        return value;
    }

    @Override
    public String toString(){
        return " " + value.toString() + " ";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return null;
    }
}
