/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Return extends Command {

    private List<Expression> exps = new ArrayList<>();

    public Return (int line, int column, List<Expression> exps){
        super(line, column);
        this.exps = exps;
    }

    public List<Expression> getExps() {
        return exps;
    }

    public void setExps(List<Expression> exps){
        this.exps = exps;
    }

    @Override
    public String toString(){
        String s = "";
        for (Expression expression : exps) {
            s += expression.toString() + ", " ;
        }
        s = "return " + s;
        if(exps.size() > 0){
            s = s.substring(0, s.length() - 2);
        }
        s += ";";
        return s;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
}
