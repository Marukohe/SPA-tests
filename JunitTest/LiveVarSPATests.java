package pascal.taie.analysis.dataflow.analysis;

import org.junit.Test;
import pascal.taie.analysis.Tests;

public class LiveVarSPATests {

    static void testLV(String inputClass) {
        Tests.testDFA(inputClass, "src/test/resources/SPA-tests",
                LiveVariableAnalysis.ID);
    }

    @Test
    public void testA() {
        testLV("TestA");
    }

    @Test
    public void testB() {
        testLV("TestB");
    }
    
    @Test
    public void testC() {
        testLV("TestC");
    }

    @Test
    public void testD() {
        testLV("TestD");
    }
}