package org.compiler.LangAntlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    public void testMain() throws Exception {
        // Arrange
        String[] args = {"src/test/testes/sintaxe/exemplo.txt"}; // Argumento representando o caminho do arquivo

        // Act
        LangAntlrInit.main(args);

        System.setOut(originalOut);

        assertTrue( true );
    }
}
