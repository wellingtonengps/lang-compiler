/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.syntactic.ast;


public class Node extends SuperNode {

    private int line;
    private int column;

    public Node() {
        super();
    }

    public Node(int line, int column) {
        super();
        this.line = line;
        this.column = column;
    }


    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
