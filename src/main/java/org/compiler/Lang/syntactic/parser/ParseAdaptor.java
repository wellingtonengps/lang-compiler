package org.compiler.Lang.syntactic.parser;

import org.compiler.Lang.syntactic.ast.SuperNode;


// Adaptador para classe de parser. a Função parseFile deve retornar null caso o parser resulte em erro. 

public interface ParseAdaptor{
   public abstract SuperNode parseFile(String path);
}



