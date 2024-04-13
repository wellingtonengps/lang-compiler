/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 * */
package org.compiler.Lang;

import org.antlr.v4.runtime.*;

import java.io.FileReader;

public class LangInit {
    public static void main(String[] args)
            throws Exception {

        ANTLRInputStream input = new ANTLRInputStream(new FileReader(args[0]));

        LangLexerImpl lexer = new LangLexerImpl(input);

        Token token;
        do {
            token = lexer.nextToken();
        } while (token.getType() != Token.EOF);
    }
}
