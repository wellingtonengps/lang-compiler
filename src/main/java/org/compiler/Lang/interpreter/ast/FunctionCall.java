/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import java.util.ArrayList;
import java.util.List;

import org.compiler.Lang.interpreter.Visitor;

public class FunctionCall extends Command{

    private String id;
    private FCallParams functionCallParams;             //'exps' => Parâmetros da função
    private List<LValue> lvalues = new ArrayList<>();       // Variaveis que serão retornadas

    public FunctionCall (int line, int column, String id){
        super(line, column);
        this.id = id;
    }

    public FunctionCall (int line, int column, String id, FCallParams params){
        super(line, column);
        this.id = id;
        this.functionCallParams = params;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FCallParams getFCallParams() {
        return functionCallParams;
    }

    public void setFCallParams(FCallParams fCallParams) {
        this.functionCallParams = fCallParams;
    }

    public List<LValue> getLValues() {
        return lvalues;
    }

    public void setLValues(List<LValue> lvalues) {
        this.lvalues = lvalues;
    }

    public void addLValue(LValue lvalue){
        lvalues.add(lvalue);
    }

    @Override
    public String toString(){
        StringBuilder bld = new StringBuilder("");
        for (LValue lvalue : lvalues) {
            bld.append(lvalue.toString() + ", ");
        }
        if(functionCallParams != null){
            if(bld.length() > 0){
                return id.toString() + " ( " +  functionCallParams.toString() + " ) " + 
                " < " + bld.substring(0, bld.length() - 2) + " > ; ";
            }
            return id.toString() + " ( " +  functionCallParams.toString() + " ) ; ";
        }
        else{
            if(bld.length() > 0){
                return id.toString() + " ( " + "" + " ) " + 
                " < " + bld.substring(0, bld.length() - 2) + " > " + " ; ";
            }
            return id.toString() + " ( " +  "" + " ) " + "" + " ; ";
        }
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
