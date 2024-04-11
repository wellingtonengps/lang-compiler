package org.compiler.LangAntlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class LangAntlrInitTest
{
    /**
     * Rigorous Test :-)

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }*/

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }



    @Test
    public void testSyntax() throws Exception {
        File folder = new File("src/test/testes/sintaxe/");
        File[] listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        for (File file : listOfFiles) {
            if (file.isFile()) {
                String[] args = {file.getAbsolutePath()}; // Argumento representando o caminho do arquivo
                // Act
                LangAntlrInit.main(args);

                System.setOut(originalOut);

                assertTrue( true );
            }
        }
    }

    @Test
    public void testError() throws Exception {
        // Arrange
        String[] args = {"src/test/testes/sintaxe/exemplo.txt"}; // Argumento representando o caminho do arquivo

        // Act
        LangAntlrInit.main(args);

        //System.setOut(originalOut);

        assertTrue(true);
    }
}
