/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */

package org.compiler.Lang.interpreter;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.compiler.Lang.LangLexer;
import org.compiler.Lang.LangParser;
import org.compiler.Lang.interpreter.ast.Node;
import org.compiler.Lang.interpreter.ast.SuperNode;

import java.io.IOException;

public class LangInterpreterImpl implements InterpreterAdaptor{

    // Retorna null se encontrar erros de sintaxe no arquivo de entrada
    @Override
    public SuperNode interpretFile(String path) {
        try {
            CharStream stream = CharStreams.fromFileName(path);

            LangLexer lexer = new LangLexer(stream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            LangParser parser = new LangParser(tokens);

            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener()  {
                // Sobreescreve o método base de identificação de erros
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.out.println("line "+ line + ":" + charPositionInLine + " -- " + msg);
                    throw new RuntimeException(e.getCause());
                }
            });

            // Cria a árvore da sintaxe padrão
            ParseTree tree = parser.prog();

            // Verifica se o analisador sintático encontrou erros
            if (parser.getNumberOfSyntaxErrors() != 0) {
                return null;
            }

            // Cria um adaptador da ParseTree do ANTLR para receber o padrão Node
            VisitorAdapter ast = new VisitorAdapter();

            // Passa um objeto do tipo parseTree e retorna do tipo Node
            Node node = ast.visit(tree);

            // Interpreta o Visitor
            InterpreterVisitor interpreter = new InterpreterVisitor();

            // Aceita o nó e caminha na árvore
            node.accept(interpreter);

            return node;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
