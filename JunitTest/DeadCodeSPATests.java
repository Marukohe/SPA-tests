package pascal.taie.analysis.dataflow.analysis;

import org.junit.Test;
import pascal.taie.analysis.Tests;

public class DeadCodeSPATests {

    static void testDCD(String inputClass) {
        Tests.testDFA(inputClass, "src/test/resources/dataflow/deadcode/",
                DeadCodeDetection.ID);
    }

    @Test
    public void testA() {
        testLV("TestA");
    }
}