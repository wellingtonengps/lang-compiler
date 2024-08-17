package org.compiler.Lang.syntactic.lang.parser;

import org.compiler.Lang.syntactic.lang.ast.SuperNode;

import java.io.IOException;


// Adaptador para classe de parser. a Função parseFile deve retornar null caso o parser resulte em erro. 

public interface ParseAdaptor{
   public abstract SuperNode parseFile(String path) throws IOException;
}



