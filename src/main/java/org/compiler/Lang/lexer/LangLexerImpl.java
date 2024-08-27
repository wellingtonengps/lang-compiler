/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 * */
package org.compiler.Lang.lexer;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.compiler.Lang.lexer.utils.FormatEmitToken;

public class LangLexerImpl extends org.compiler.Lang.LangLexer {
    public LangLexerImpl(CharStream input) {
        super(input);
    }

    @Override
    public Token emit() {
        Token token = super.emit();
        FormatEmitToken.emit(token);
        return super.emit();
    }
}
