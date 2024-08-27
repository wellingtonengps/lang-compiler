package org.compiler.Lang.interpreter;

import org.compiler.Lang.interpreter.ast.SuperNode;

public interface InterpreterAdaptor{
    public abstract SuperNode interpretFile(String path);
}
