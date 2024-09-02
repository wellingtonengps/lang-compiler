/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import java.util.ArrayList;
import java.util.List;

import org.compiler.Lang.interpreter.Visitor;

public class Program extends Node{

    private List<Data> datas;
    private List<Function> functions;

    public Program(int line, int column){
        super(line, column);
        datas = new ArrayList<Data>();
        functions = new ArrayList<Function>();
    }

    public void addFunction(Function function){
        this.functions.add(function);
    }

    public void addData(Data data){
        this.datas.add(data);
    }

    public List<Data> getDatas() {
        return datas;
    }

    public List<Function> getFunctions() {
        return functions;
    }

    @Override
    public String toString(){
        return "Size";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
