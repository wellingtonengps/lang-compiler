package org.compiler.Lang.interpreter.ast;

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
