package org.compiler.Lang.syntactic;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;


import org.compiler.Lang.LangLexer;
import org.compiler.Lang.LangParser;
import org.compiler.Lang.syntactic.ast.SuperNode;
import org.compiler.Lang.syntactic.ast.Node;
import org.compiler.Lang.syntactic.parser.ParseAdaptor;

import java.io.IOException;


public class LangParserImpl implements ParseAdaptor {

    @Override
    public SuperNode parseFile(String path){
        CharStream stream = null;
        try {
            stream = CharStreams.fromFileName(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        LangLexer lexer = new LangLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LangParser parser = new LangParser(tokens);

        ParseTree tree = parser.prog();

        // Verifica se o analisador sintático encontrou erros
        if(parser.getNumberOfSyntaxErrors() != 0){
            return null;
        }

        //Retorna nó vazio
        return new Node();
    }
}
