/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 * */

package org.compiler.Lang.syntactic.parser;

import org.compiler.Lang.syntactic.ast.SuperNode;


public interface ParseAdaptor{
   public abstract SuperNode parseFile(String path);
}



