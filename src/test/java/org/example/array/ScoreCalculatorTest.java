package org.example.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ScoreCalculatorTest {

    private ScoreCalculator scoreCalculator = new ScoreCalculator();

    @Test
    void test1() {
        // given
        int[] inputs = new int[]{1, 0, 1, 1, 1, 0, 0, 1, 1, 0};

        // when
        int result = scoreCalculator.solution(inputs);

        // then
        assertThat(result).isEqualTo(10);
    }
}