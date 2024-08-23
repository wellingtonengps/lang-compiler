/********************************************************
* Trabalho de Teoria dos Compiladores(DCC045)(2021/1)   *
*                                                       *
* Projeto do Interpretador para a Linguagem Lang        *
* Nome: Lucas Diniz da Costa -- Matricula: 201465524C   *
*                                                       *
*********************************************************/
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class If extends Command {
    /**
     * ---- Regra
     * cmd: IF OPEN_PARENT exp CLOSE_PARENT cmd   # If
     *
    */
    
    private Expression exp;
    private Command cmd;

    public If (int line, int column, Expression exp, Command cmd){
        super(line, column);
        this.exp = exp;
        this.cmd = cmd;
    }

    @Override
    public String toString(){
        return  " if ( " + exp.toString() + " ) " + cmd.toString();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public Expression getExp() {
        return exp;
    }

    public Command getCmd() {
        return cmd;
    }
    
}

