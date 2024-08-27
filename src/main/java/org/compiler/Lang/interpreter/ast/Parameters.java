/********************************************************
* Trabalho de Teoria dos Compiladores(DCC045)(2021/1)   *
*                                                       *
* Projeto do Interpretador para a Linguagem Lang        *
* Nome: Lucas Diniz da Costa -- Matricula: 201465524C   *
*                                                       *
*********************************************************/
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Parameters extends Node {
    /**
     * ---- Regra
     * params: ID DOUBLE_COLON type (COMMA ID DOUBLE_COLON type)*  # ParametersFunction
    */

    private List<String> id;
    private List<Type> type;
    
    public Parameters (int line, int column){
        super(line, column);
        this.id = new ArrayList<String>();
        this.type = new ArrayList<Type>();
    }

    public Parameters (int line, int column, List<String> id, List<Type> type){
        super(line, column);
        this.id = id;
        this.type = type;
    }

    public int size() {
        return id.size();
    }

    public List<String> getId() {
        return id;
    }

    public String getSingleId(int id) {
        return this.id.get(id);
    }

    public Type getSingleType(int type) {
        return this.type.get(type);
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public List<Type> getType() {
        return type;
    }

    public void setType(List<Type> type) {
        this.type = type;
    }

    public void addParameter(String id, Type type){
        this.id.add(id);
        this.type.add(type);
    }

    @Override
    public String toString(){
        String s = "";
        // System.out.println("74 -- parametros --Type " + type.toString() );
        for(int i = 0; i < id.size(); i++){
            String idAux = id.get(i).toString();
            String typeAux = type.get(i).toString();
            s += idAux.toString() + " : " + typeAux.toString() + ", ";
        }
        return s;
     }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
}
