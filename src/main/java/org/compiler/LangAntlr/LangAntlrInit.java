package org.compiler.LangAntlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.compiler.LangAntlr.utils.EmitToken;

import java.io.FileReader;
import java.util.List;

public class LangAntlrInit {
    public static void main(String[] args)
            throws Exception {

        ANTLRInputStream input = new ANTLRInputStream(new FileReader(args[0]));

        LangAntlrInitLexer lexer = new LangAntlrInitLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.fill();

        for (Token token : tokens.getTokens()) {
            EmitToken.emit(token);
        }

    }
}
