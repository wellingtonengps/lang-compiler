package org.compiler.LangAntlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileReader;

public class LangAntlrInit {
    public static void main(String[] args)
            throws Exception {

        ANTLRInputStream input = new ANTLRInputStream(new FileReader(args[0]));

        //LangAntlrInitLexer lexer = new LangAntlrInitLexer(input);

        LangAntlrSuperiorLexer lexer = new LangAntlrSuperiorLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LangAntlrInitParser parser = new LangAntlrInitParser(tokens);
        ParseTree tree = parser.prog(); // begin parsing at init rule


        //System.out.println(tree.toStringTree(parser)); // print LISP-style tree

    }
}
