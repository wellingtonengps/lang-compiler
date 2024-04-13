package org.compiler.LangAntlr;

import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LangAntlrInit {
    public static void main(String[] args)
            throws Exception {

        ANTLRInputStream input = new ANTLRInputStream(new FileReader(args[0]));

        LangAntlrInitLexerImpl lexer = new LangAntlrInitLexerImpl(input);

        Token token;
        do {
            token = lexer.nextToken();
        } while (token.getType() != Token.EOF);
    }
}
