package org.compiler.Lang.syntactic;

import lang.ast.SuperNode;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.compiler.Lang.LangLexer;
import org.compiler.Lang.LangParser;
import org.compiler.Lang.lexer.LangLexerImpl;
import org.compiler.Lang.syntactic.ast.Node;
import org.compiler.Lang.syntactic.parser.ParseAdaptor;

import java.io.FileReader;
import java.io.IOException;

public class LangParserImpl implements ParseAdaptor {

    // Retornar null caso o encontre error de sintaxe (parse resulte em error)
    @Override
    public SuperNode parseFile(String path) throws IOException {

        ANTLRInputStream input = new ANTLRInputStream(new FileReader(path));

        LangLexer lexer = new LangLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LangParser parser = new LangParser(tokens);


        ParseTree tree = parser.prog();

        if(parser.getNumberOfSyntaxErrors() != 0) {
            return null;
        }

        //System.out.println(tree.toStringTree(parser));

        return new Node();
    }
}
