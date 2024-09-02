/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */

package org.compiler.Lang.interpreter.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.compiler.Lang.LangLexer;
import org.compiler.Lang.LangParser;
import org.compiler.Lang.interpreter.VisitorAdapter;
import org.compiler.Lang.interpreter.ast.Node;
import org.compiler.Lang.interpreter.ast.SuperNode;


public class LangParserImpl implements ParseAdaptor {

    // Retorna null se encontrar erros de sintaxe no arquivo de entrada
    @Override
    public SuperNode parseFile(String path) {
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

            ParseTree tree = parser.prog();

            if (parser.getNumberOfSyntaxErrors() != 0) {
                return null;
            }

            VisitorAdapter ast = new VisitorAdapter();

            Node node = ast.visit(tree);

            return node;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
