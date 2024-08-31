/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

public abstract class Expression extends Node {
    // Classe abstrata para tratar os nós derivados de 'exp' na gramática
    // Utilizado também para expressões que trabalham com um operador e dois operandos   

    private Expression expression;

    public Expression(int line, int column) {
        super(line, column);
    }

    public Expression(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

}