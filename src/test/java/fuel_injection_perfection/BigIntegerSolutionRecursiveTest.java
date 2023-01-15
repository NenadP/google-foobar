package fuel_injection_perfection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigIntegerSolutionRecursiveTest {
    @Test
    void test1() {
        assertEquals(
                2,
                SolutionRecursive.solution("4")
        );
    }

    @Test
    void test2() {
        assertEquals(
                5,
                SolutionRecursive.solution("15")
        );
    }
    @Test
    void test3() {
        assertEquals(
                6,
                SolutionRecursive.solution("26")
        );
    }

    @Test
    void test4() {
        assertEquals(
                6,
                SolutionRecursive.solution("19")
        );
    }

    @Test
    void test5() {
        assertEquals(
                4,
                SolutionRecursive.solution("10")
        );
    }

    @Test
    void test6() {
        assertEquals(
                10,
                SolutionRecursive.solution("768")
        );
    }
}
