package org.compiler.Lang.interpreter.parser;

import org.antlr.v4.runtime.*;
import org.compiler.Lang.interpreter.VisitorAdapter;
import org.compiler.Lang.interpreter.ast.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.compiler.Lang.LangLexer;
import org.compiler.Lang.LangParser;
import org.compiler.Lang.lexer.LangLexerImpl;
import org.compiler.Lang.syntactic.parser.ParseAdaptor;

import java.io.FileReader;
import java.io.IOException;

public class LangParserImpl implements ParseAdaptor {

    @Override
    // Retornar null caso o encontre error de sintaxe (parse resulte em error)
    public SuperNode parseFile(String path) {
        try {
            // Cria uma variavel que irá armazenar um charStream de ANTLR
            // a partir de um arquivo
            CharStream stream = CharStreams.fromFileName(path);

            // Cria um analisador léxico que é carregado com os dados do arquivo
            LangLexer lexer = new LangLexer(stream);

            // Cria um buffer de tokens com base no analisador léxico
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Utiliza o analisador sintático criado e será alimentado com os buffers
            // dos tokens
            LangParser parser = new LangParser(tokens);

            // Remove os detectores de erros léxicos padrão gerado pela ferramenta
            // A ideia é que quando ocorrer um erro execução no lexer, pare tudo
            // e retorne uma excessão em Runtime
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener()  {
                // Sobreescreve o método base de identificação de erros
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.out.println("line "+ line + ":" + charPositionInLine + " -- " + msg);
                    throw new RuntimeException(e.getCause());
                }
            });

            // Cria uma árvore da sintaxe
            ParseTree tree = parser.prog();

            // Verifica se o analisador sintático encontrou erros
            if (parser.getNumberOfSyntaxErrors() != 0) {
                return null;
            }
            // Retorna um nó caso não encontre erros no arquivo passado
            // O Nó é vazio mas esta classe poderá ser utilizada nas próximas etapas do
            // compilador

            // Metodo do visitor --- apenas será utilizado onde houver visitor
            // Cria um adaptador da ParseTree do ANTLR para receber o padrão Node
            // criado para a AST do trabalho
            VisitorAdapter ast = new VisitorAdapter();

            // Passa um objeto do tipo parseTree e retorna do tipo Node
            // Visita a árvore
            Node node = ast.visit(tree);

            return node;
        } catch (Exception e) {
            e.printStackTrace();
            // O Nó é vazio mas esta classe poderá ser utilizada nas próximas etapas do
            // compilador
            return null;
        }
    }
}
