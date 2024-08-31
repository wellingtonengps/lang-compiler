/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

public abstract class SuperNode {
   
   // The line and column of the node in the input text
   
    public abstract int getLine();
    public abstract int getColumn();
}


