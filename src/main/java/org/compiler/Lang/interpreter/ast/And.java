/********************************************************
* Trabalho de Teoria dos Compiladores(DCC045)(2021/1)   *
*                                                       *
* Projeto do Interpretador para a Linguagem Lang        *
* Nome: Lucas Diniz da Costa -- Matricula: 201465524C   *
*                                                       *
*********************************************************/
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public class And extends BinOP{
    /**
     * ---- Regra
     * exp:<assoc=left> exp AND exp    # AndOperation
    */

    public And(int line, int column, Expression left, Expression right){
        super(line, column, left, right);
    }

    @Override
    public String toString(){
        return (left.toString() + " && " + right.toString());
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
