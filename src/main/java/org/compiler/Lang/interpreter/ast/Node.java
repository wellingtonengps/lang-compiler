package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitable;
import org.compiler.Lang.interpreter.Visitor;

public class Node extends SuperNode implements Visitable {


    // Linha e coluna do nó com base no texto do arquivo de entrada passado
    private int line;
    private int column;

    // Construtor padrão da classe
    public Node() {
        super();		// Invoca o construtor da classe pai "SuperNode"
    }

    // Construtor padrão com Atributos de linha e coluna do nó
    public Node(int line, int column) {
        super();
        this.line = line;
        this.column = column;
    }

    // Retorna a linha do token no arquivo de entrada
    @Override
    public int getLine() {
        return line;
    }

    // Retorna a coluna do token no arquivo de entrada
    @Override
    public int getColumn() {
        return column;
    }


    // Metodo base do Visitor para caminhar nos nós da AST e verificar se é aceito ou não
    public void accept(Visitor v) {
        /* Vazio => A função é implementada nos outros nós */
    }
}
