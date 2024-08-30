package org.compiler.Lang.interpreter.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.compiler.Lang.LangLexer;
import org.compiler.Lang.LangParser;
import org.compiler.Lang.interpreter.ast.Node;
import org.compiler.Lang.interpreter.ast.SuperNode;

import java.io.IOException;

public class LangParserImpl implements ParseAdaptor {

    // Retorna null se encontrar erros de sintaxe no arquivo de entrada
    @Override
    public SuperNode parseFile(String path){
        try{
            CharStream stream = CharStreams.fromFileName(path);

            // Cria um analisador léxico que é carregado com os dados do arquivo
            LangLexer lex = new LangLexer(stream);

            // Cria um buffer de tokens com base no analisador léxico
            CommonTokenStream tokens = new CommonTokenStream(lex);

            // Utiliza o analisador sintático criado e será alimentado com os buffers
            // dos tokens
            LangParser parser = new LangParser(tokens);

            // Cria uma árvore da sintaxe
            ParseTree tree = parser.prog();

            // Verifica se o analisador sintático encontrou erros
            if(parser.getNumberOfSyntaxErrors() != 0){
                return null;
            }
            // Retorna um nó caso não encontre erros no arquivo passado
            // O Nó é vazio mas esta classe poderá ser utilizada nas próximas etapas do compilador
            return new Node();
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
