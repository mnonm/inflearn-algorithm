package org.example.slidingwindow;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SumOfContinuousNumberTest {
    private SumOfContinuousNumber sumOfContinuousNumber = new SumOfContinuousNumber();

    @Test
    void test1() {
        // given, when
        int result = sumOfContinuousNumber.solution(15);

        // then
        assertThat(result).isEqualTo(3);
    }

    @Test
    void test2() {
        // given, when
        int result = sumOfContinuousNumber.solution(16);

        // then
        assertThat(result).isEqualTo(0);
    }

}