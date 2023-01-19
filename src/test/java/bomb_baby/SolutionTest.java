package bomb_baby;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        assertEquals(
                "1",
                Solution.solution("2", "1")
        );
    }

    @Test
    void test2() {
        assertEquals(
                "4",
                Solution.solution("4", "7")
        );
    }

    @Test
    void test3() {
        assertEquals(
                "impossible",
                Solution.solution("2", "4")
        );
    }

    @Test
    void test4() {
        // The algo goes in reverse of this example. This is an illustration going from initial available bombs to the target
        // 1 1 step 0
        // 1 2 step 1
        // 1 3 step 2
        // 4 3 step 3
        // 7 3 step 4
        // 7 10 step 5
        // 17 10 step 6
        // 17 27 step 7
        // ... repeating last step of adding 17 for 69 more times to get to:
        // 17 1200 step 76
        // or in other words, since mach reached its target, adding 17 to facula happened 70 times
        assertEquals(
                "76",
                Solution.solution("17", "1200")
        );
    }
}
