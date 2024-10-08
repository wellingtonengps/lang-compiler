/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Function extends Node{

    private String id;
    private int hashCode;
    private Parameters parameters;
    private List<Type> returnTypes;     // Tipos de retorno da função
    private List<Command> commands;     // Corpo da função

    public Function(int line, int column, String id, Parameters parameters, int hashCode){
        super(line, column);
        this.id = id;
        this.parameters = parameters;
        this.returnTypes = new ArrayList<Type>();
        this.commands = new ArrayList<Command>();
        this.hashCode = hashCode;
    }

    public Function(int line, int column, String id, int hashCode){
        super(line, column);
        this.id = id;
        this.parameters = new Parameters(line, column);
        this.returnTypes = new ArrayList<Type>();
        this.commands = new ArrayList<Command>();
        this.hashCode = hashCode;
    }

    public String getId() {
        return id;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public List<Type> getReturnTypes() {
        return returnTypes;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public void addCommand(Command cmd){
        this.commands.add(cmd);
    }

    public void addReturnTypes(Type returnType){
        this.returnTypes.add(returnType);
    }

    @Override
    public String toString(){
        String s = id.toString() + "(";
        s += parameters.toString();
        if(returnTypes.size() > 0){
            s += ") : ";
            for(int i = 0; i < returnTypes.size() - 1; i++){
                String typeAux = returnTypes.get(i).toString();
                s += typeAux.toString() + ", ";
            }
            s += returnTypes.get(returnTypes.size() - 1).toString();
        }else{
            s += ")";
        }
        s += "{\n";
        for (Command command : commands) {
            s += command.toString() + "\n";
        }
        s += " } ";
        return s;
    }

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public void setReturnTypes(List<Type> returnTypes) {
        this.returnTypes = returnTypes;
    }

    public int getHashCode() {
        return hashCode;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
