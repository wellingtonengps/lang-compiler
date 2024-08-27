package org.compiler.Lang.interpreter;

public interface Visitable {
    public void accept (Visitor v);
}