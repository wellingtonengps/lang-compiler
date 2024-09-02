/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */

package org.compiler.Lang.interpreter;

import org.compiler.Lang.interpreter.ast.SuperNode;

public interface InterpreterAdaptor{
    public abstract SuperNode interpretFile(String path);
}
