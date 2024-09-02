/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Parameters extends Node {

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
    // Novo método para retornar os tipos como Strings
    public List<String> getTypeAsStringList() {
        List<String> typeAsStringList = new ArrayList<>();
        for (Type t : this.type) {
            typeAsStringList.add(t.toString()); // Converte cada Type para String
        }
        return typeAsStringList;
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
