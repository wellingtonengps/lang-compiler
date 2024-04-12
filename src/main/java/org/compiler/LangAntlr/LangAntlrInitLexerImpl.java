package org.compiler.LangAntlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.compiler.LangAntlr.LangAntlrInitLexer;
import org.compiler.LangAntlr.utils.FormatEmitToken;

public class LangAntlrInitLexerImpl extends LangAntlrInitLexer {
    public LangAntlrInitLexerImpl(CharStream input) {
        super(input);
    }

    @Override
    public Token emit() {
        Token token = super.emit();
        FormatEmitToken.emit(token);
        return super.emit();
    }
}
