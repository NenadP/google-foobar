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
}
