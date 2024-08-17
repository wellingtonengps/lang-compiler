/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 * */
package org.compiler.Lang.lexer.utils;

import org.antlr.v4.runtime.Token;
import org.compiler.Lang.LangLexer;

public class FormatEmitToken {
    public static void emit(Token token) {
        switch (token.getType()) {
            case LangLexer.ID:
                System.out.println("ID : " + token.getText());
                break;
            case LangLexer.INT:
                System.out.println("INT : " + token.getText());
                break;
            case LangLexer.FLOAT:
                System.out.println("FLOAT : " + token.getText());
                break;
            case LangLexer.CHAR:
                System.out.println("CHAR : " + token.getText());
                break;
            case LangLexer.BOOLEAN:
                System.out.println("BOOLEAN : " + token.getText());
                break;
            case LangLexer.DATA:
                System.out.println("DATA");
                break;
            case LangLexer.PRINT:
                System.out.println("PRINT");
                break;
            case LangLexer.IF:
                System.out.println("IF");
                break;
            case LangLexer.ELSE:
                System.out.println("ELSE");
                break;
            case LangLexer.ITERATE:
                System.out.println("ITERATE");
                break;
            case LangLexer.TRUE:
                System.out.println("TRUE");
                break;
            case LangLexer.FALSE:
                System.out.println("FALSE");
                break;
            case LangLexer.NEW:
                System.out.println("NEW");
                break;
            case LangLexer.READ:
                System.out.println("READ");
                break;
            case LangLexer.RETURN:
                System.out.println("RETURN");
                break;
            default:
                System.out.println(token.getText());
        }

    }

}
