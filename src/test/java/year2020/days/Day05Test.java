package year2020.days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import year2020.days.day05.Day05;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day05Test {

    private static final String DAY = "5";
    private static final String SHORT_INPUT = "src/test/resources/year2020/day-05-input-test.txt";
    private static final String SHORT_INPUT2 = "src/test/resources/year2020/day-05-input-test-2.txt";
    private static final String SHORT_INPUT3 = "src/test/resources/year2020/day-05-input-test-3.txt";
    private static final String SHORT_INPUT4 = "src/test/resources/year2020/day-05-input-test-4.txt";
    private static final String BIG_INPUT = "src/main/resources/year2020/day-05-input.txt";
    private AbstractDay2020 day;

    @BeforeEach
    void setUp() {
        day = new Day05();
    }

    @Test
    void testSolvePart1WithShortInput() {
        assertThat(day.solvePart1(SHORT_INPUT), is(equalTo("357")));
    }

    @Test
    void testSolvePart1WithShortInput2() {
        assertThat(day.solvePart1(SHORT_INPUT2), is(equalTo("567")));
    }

    @Test
    void testSolvePart1WithShortInput3() {
        assertThat(day.solvePart1(SHORT_INPUT3), is(equalTo("119")));
    }

    @Test
    void testSolvePart1WithShortInput4() {
        assertThat(day.solvePart1(SHORT_INPUT4), is(equalTo("820")));
    }

    @Test
    void testSolvePart1WithBigInput() {
        assertThat(day.solvePart1(BIG_INPUT), is(equalTo("890")));
    }

    @Test
    void testSolvePart1WithInputDay() {
        assertThat(day.solvePart1(DAY), is(equalTo("890")));
    }

    @Test
    void testSolvePart2WithBigInput() {
        assertThat(day.solvePart2(BIG_INPUT), is(equalTo("651")));
    }

    @Test
    void testSolvePart2WithInputDay() {
        assertThat(day.solvePart2(DAY), is(equalTo("651")));
    }

}