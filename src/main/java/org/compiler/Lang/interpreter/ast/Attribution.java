/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class Attribution extends Command{
    /**
     * ---- Regra
     * cmd: lvalue EQUALS exp SEMI    # Attribution
     * -- Attribution é um tipo de comando
    */

    private LValue lvalue;
    private Expression exp;

    public Attribution(int line, int column, LValue lvalue, Expression exp){
        super(line, column);
        this.lvalue = lvalue;
        this.exp = exp;
    }

    public void setLValue(LValue lvalue){
        this.lvalue = lvalue;
    }

    public void setExp(Expression exp){
        this.exp = exp;
    }

    public LValue getLValue(){
        return (this.lvalue);
    }

    public Expression getExp(){
        return (this.exp);
    }

    @Override
    public String toString(){
        return this.lvalue.toString() + " = " + this.exp.toString();
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
