/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

import java.util.List;

public class FCallParams extends Expression{

    private List<Expression> exps;

    public FCallParams(int line, int column, List<Expression> exps){
        super(line, column);
        this.exps = exps;
    }

    public FCallParams(int line, int column){
        super(line, column);
        this.exps = null;
    }

    public List<Expression> getExps(){
        return exps;
    }

    public void setExps(List<Expression> e){
        this.exps = e;
    }

    public void addExp(Expression e){
        this.exps.add(e);
    }

    @Override
    public String toString(){
        String text = "";
        for (Expression expression : exps) {
            text = text + expression + ", ";
        }
        if(text.length() > 0){
            return text.substring(0, text.length() - 2);      // Remove a virgula e o ultimo espaço
        }
        return text;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
