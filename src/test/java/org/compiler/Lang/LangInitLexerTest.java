package org.compiler.Lang;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LangInitLexerTest {

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
    @DisplayName("Verifica se encontra o error de um caractere inválido no arquivo de teste")
    public void testLexer() throws Exception {

        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errContent));

        String[] args = {"src/test/testes/lexico/errado/attrAND.lan"};

        LangInit.main(args);

        System.setOut(originalOut);

        String expectedErrorMessage = "token recognition error at";
        assertTrue(errContent.toString().contains(expectedErrorMessage));
    }


    public void test(String file) throws Exception {

        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errContent));

        String[] args = {"src/test/testes/lexico/certo/" + file};

        LangInit.main(args);

        System.setOut(originalOut);

        String errorOutput = errContent.toString().trim();

        String expectedErrorMessage = "";
        assertEquals(expectedErrorMessage, errorOutput);
    }

    @Test
    public void testAttrADD() throws Exception {
        test("attrADD.lan");
    }

    @Test
    public void testAttrAND() throws Exception {
        test("attrAND.lan");
    }

    @Test
    public void testAttrCHAR() throws Exception {
        test("attrCHAR.lan");
    }

    @Test
    public void testAttrCHARESCAPE1() throws Exception {
        test("attrCHARESCAPE1.lan");
    }

    @Test
    public void testAttrCHARESCAPE2() throws Exception {
        test("attrCHARESCAPE2.lan");
    }

    @Test
    public void testAttrCHARESCAPE3() throws Exception {
        test("attrCHARESCAPE3.lan");
    }

    @Test
    public void testAttrCMD() throws Exception {
        test("attrCMD.lan");
    }

    @Test
    public void testAttrDIV() throws Exception {
        test("attrDIV.lan");
    }

    @Test
    public void testAttrEQ() throws Exception {
        test("attrEQ.lan");
    }

    @Test
    public void testAttrFloat() throws Exception {
        test("attrFloat.lan");
    }

    @Test
    public void testAttrLT() throws Exception {
        test("attrLT.lan");
    }

    @Test
    public void testAttrMOD() throws Exception {
        test("attrMOD.lan");
    }

    @Test
    public void testAttrMULT() throws Exception {
        test("attrMULT.lan");
    }

    @Test
    public void testAttrNEQ() throws Exception {
        test("attrNEQ.lan");
    }

    @Test
    public void testAttrNULL() throws Exception {
        test("attrNULL.lan");
    }

    @Test
    public void testAttrSUB() throws Exception {
        test("attrSUB.lan");
    }

    @Test
    public void testAttrTRUE() throws Exception {
        test("attrTRUE.lan");
    }

    @Test
    public void testChainIf() throws Exception {
        test("chainIf.lan");
    }

    @Test
    public void testData() throws Exception {
        test("data.lan");
    }

    @Test
    public void testFunction() throws Exception {
        test("function.lan");
    }

    @Test
    public void testFunctionCall() throws Exception {
        test("function_call.lan");
    }

    @Test
    public void testFunctionCallExpr() throws Exception {
        test("function_call_expr.lan");
    }

    @Test
    public void testFunctionCallRet() throws Exception {
        test("function_call_ret.lan");
    }

    @Test
    public void testFunctionCallRetUse() throws Exception {
        test("function_call_ret_use.lan");
    }

    @Test
    public void testFunctionCallRetUse2() throws Exception {
        test("function_call_ret_use2.lan");
    }

    @Test
    public void testIfelseOneCMD() throws Exception {
        test("ifelse_oneCMD.lan");
    }

    @Test
    public void testIfOneCMD() throws Exception {
        test("if_oneCMD.lan");
    }

    @Test
    public void testInstanciate() throws Exception {
        test("instanciate.lan");
    }

    @Test
    public void testIterateCMD() throws Exception {
        test("iterateCMD.lan");
    }

    @Test
    public void testIterateOneCMD() throws Exception {
        test("iterate_oneCMD.lan");
    }

    @Test
    public void testParameter() throws Exception {
        test("parameter.lan");
    }

    @Test
    public void testPrintCMD() throws Exception {
        test("printCMD.lan");
    }
    



}


