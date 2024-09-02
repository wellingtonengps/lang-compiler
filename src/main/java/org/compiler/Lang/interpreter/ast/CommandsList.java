/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CommandsList extends Command{

    private List<Command> commands;

    public CommandsList(int line, int column, List<Command> commands){
        super(line, column);
        this.commands = commands;
    }

    public CommandsList(int line, int column){
        super(line, column);
        this.commands = new ArrayList<Command>();
    }

    public List<Command> getCommands(){
        return (this.commands);
    }

    public void setCommands(List<Command> cmd){
        this.commands = cmd;
    }

    public void addCommand(Command cmd){
        commands.add(cmd);
    }

    @Override
    public String toString(){
        String text = " { ";
        for (Command command : commands) {
            text = text + command.toString();
        }
        text = text + " } ";
        return text;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
