package i_love_lance_and_janice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigIntegerSolutionTest {

    @Test
    void test1() {
        assertEquals(
                "did you see last night's episode?",
                Solution.solution("wrw blf hvv ozhg mrtsg'h vkrhlwv?")
        );
    }

    @Test
    void test2() {
        assertEquals(
                "Yeah! I can't believe Lance lost his job at the colony!!",
                Solution.solution("Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!")
        );
    }
}
