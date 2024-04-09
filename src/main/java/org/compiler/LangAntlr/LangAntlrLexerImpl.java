package org.compiler.LangAntlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

public class LangAntlrLexerImpl extends LangAntlrInitLexer {
    public LangAntlrLexerImpl(CharStream input) {
        super(input);
    }
    /*
    @Override
    public Token emit() {
        Token token = super.emit();

        switch (token.getType()) {
            case LangAntlrInitLexer.ID:
                System.out.println("ID : " + token.getText());
                break;
            case LangAntlrInitLexer.INT:
                System.out.println("INT : " + token.getText());
                break;
            case LangAntlrInitLexer.FLOAT:
                System.out.println("FLOAT : " + token.getText());
                break;
            case LangAntlrInitLexer.CHAR:
                System.out.println("CHAR : " + token.getText());
                break;
            case LangAntlrInitLexer.BOOLEAN:
                System.out.println("BOOLEAN : " + token.getText());
                break;
            case LangAntlrInitLexer.DATA:
                System.out.println("DATA");
                break;
            case LangAntlrInitLexer.PRINT:
                System.out.println("PRINT");
                break;
            case LangAntlrInitLexer.IF:
                System.out.println("IF");
                break;
            case LangAntlrInitLexer.ELSE:
                System.out.println("ELSE");
                break;
            case LangAntlrInitLexer.ITERATE:
                System.out.println("ITERATE");
                break;
            case LangAntlrInitLexer.TRUE:
                System.out.println("TRUE");
                break;
            case LangAntlrInitLexer.FALSE:
                System.out.println("FALSE");
                break;
            case LangAntlrInitLexer.NEW:
                System.out.println("NEW");
                break;
            case LangAntlrInitLexer.READ:
                System.out.println("READ");
                break;
            case LangAntlrInitLexer.RETURN:
                System.out.println("RETURN");
                break;
            default:
                System.out.println(token.getText());
        }

        return token;
    }*/
}
