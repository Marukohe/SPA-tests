package pascal.taie.analysis.dataflow.analysis;

import org.junit.Test;
import pascal.taie.analysis.Tests;

public class DeadCodeSPATests {

    static void testDCD(String inputClass) {
        Tests.testDFA(inputClass, "src/test/resources/SPA-tests/",
                DeadCodeDetection.ID);
    }

    @Test
    public void testA() {
        testDCD("TestA");
    }

    @Test
    public void testB() {
        testDCD("TestB");
    }

    @Test
    public void testC() {
        testDCD("TestC");
    }

    @Test
    public void testD() {
        testDCD("TestD");
    }
}