package elevator_maintenance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void test1() {
        assertArrayEquals(
                new String[]{"0.1", "1.1.1", "1.2", "1.2.1", "1.11", "2", "2.0", "2.0.0"},
                elevator_maintenance.Solution.solution(new String[]{"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"})

        );
    }

    @Test
    void test2() {
        assertArrayEquals(
                new String[]{"1.0", "1.0.2", "1.0.12", "1.1.2", "1.3.3"},
                elevator_maintenance.Solution.solution(new String[]{"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"})
        );
    }
}
