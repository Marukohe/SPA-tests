package pascal.taie.analysis.dataflow.analysis.constprop;

import org.junit.Test;
import pascal.taie.analysis.Tests;
import pascal.taie.analysis.dataflow.inter.InterConstantPropagation;

public class InterCPSPATests {

    private static final String CLASS_PATH = "src/test/resources/SPA-tests";

    static void test(String inputClass) {
        Tests.testDFA(inputClass, CLASS_PATH, InterConstantPropagation.ID,
                "edge-refine:false;alias-aware:false", "-a", "cg=algorithm:cha"
        );
    }

    @Test
    public void TestA() {
        InterCPSPATests.test("TestA");
    }

    @Test
    public void TestB() {
        InterCPSPATests.test("TestB");
    }
}