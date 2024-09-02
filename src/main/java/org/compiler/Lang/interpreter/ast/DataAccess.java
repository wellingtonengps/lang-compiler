/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class DataAccess extends LValue{

    private LValue lvalue;
    private String id;              // Atributo do objeto
    private String dataId;          // Nome do objeto

    public DataAccess (int line, int column, LValue lvalue, String id, String dataId){
        super(line, column);
        this.lvalue = lvalue;
        this.id = id;
        this.dataId = dataId;
    }

    public LValue getLValue() {
        return lvalue;
    }

    public String getId() {
        return id;
    }

    public String getDataId() {
        return dataId;
    }

    @Override
    public String toString(){
        return lvalue.toString() + "." + id.toString();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
