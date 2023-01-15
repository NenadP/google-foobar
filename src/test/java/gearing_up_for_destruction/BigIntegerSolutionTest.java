package gearing_up_for_destruction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BigIntegerSolutionTest {

    @Test
    void test1() {
        assertArrayEquals(
                new int[]{-1, -1},
                Solution.solution(new int[]{4, 17, 50})
        );
    }

    @Test
    void test2() {
        assertArrayEquals(
                new int[]{12, 1},
                Solution.solution(new int[]{4, 30, 50})
        );
    }

    @Test
    void test3() {
        assertArrayEquals(
                new int[]{130, 3},
                Solution.solution(new int[]{25, 105, 145, 170})
        );
    }

    @Test
    void test4() {
        assertArrayEquals(
                new int[]{1000, 3},
                Solution.solution(new int[]{500, 1000, 1500, 2000, 2500, 3000, 3500, 4000, 4500, 5000, 5500, 6000, 6500, 7000, 7500, 8000, 8500, 9000, 9500, 10000})
        );
    }

    @Test
    void test5() {
        assertArrayEquals(
                new int[]{100, 3},
                Solution.solution(new int[]{1, 51})
        );
    }

    @Test
    void test6() {
        assertArrayEquals(
                new int[]{20, 1},
                Solution.solution(new int[]{1, 31})
        );
    }

    @Test
    void test7() {
        assertArrayEquals(
                new int[]{20, 1},
                Solution.solution(new int[]{1, 31, 51, 71})
        );
    }

    @Test
    void test8() {
        assertArrayEquals(
                new int[]{20, 1},
                Solution.solution(new int[]{1, 31, 51, 71, 91})
        );
    }

    @Test
    void test9() {
        assertArrayEquals(
                new int[]{4, 1},
                Solution.solution(new int[]{4, 9, 17, 31, 40})
        );
    }
}
