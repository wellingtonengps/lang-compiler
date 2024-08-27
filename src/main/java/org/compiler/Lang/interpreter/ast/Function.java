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

public class Function extends Node{
    /**
     * ---- Regra
     * func: ID OPEN_PARENT params? CLOSE_PARENT (COLON type (COMMA type)*)?
     * OPEN_BRACES cmd* CLOSE_BRACES    # Function
     */
    private String id;
    private Parameters parameters;
    private List<Type> returnTypes;     // Tipos de retorno da função
    private List<Command> commands;     // Corpo da função

    public Function(int line, int column, String id, Parameters parameters){
        super(line, column);
        this.id = id;
        this.parameters = parameters;
        this.returnTypes = new ArrayList<Type>();
        this.commands = new ArrayList<Command>();
    }

    public Function(int line, int column, String id){
        super(line, column);
        this.id = id;
        this.parameters = new Parameters(line, column);
        this.returnTypes = new ArrayList<Type>();
        this.commands = new ArrayList<Command>();
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
    public String toString() {
        String s = (id != null ? id.toString() : "null") + "(";
        s += (parameters != null ? parameters.toString() : "null");
        if (returnTypes != null && returnTypes.size() > 0) {
            s += ") : ";
            for (int i = 0; i < returnTypes.size() - 1; i++) {
                String typeAux = returnTypes.get(i).toString();
                s += (typeAux != null ? typeAux.toString() : "null") + ", ";
            }
            s += (returnTypes.get(returnTypes.size() - 1) != null ? returnTypes.get(returnTypes.size() - 1).toString() : "null");
        } else {
            s += ")";
        }
        s += "{\n";
        if (commands != null) {
            for (Command command : commands) {
                s += (command != null ? command.toString() : "null") + "\n";
            }
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

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
