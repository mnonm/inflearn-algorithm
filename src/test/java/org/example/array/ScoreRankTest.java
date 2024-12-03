package org.example.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ScoreRankTest {
    private ScoreRank scoreRank = new ScoreRank();

    @Test
    void test1() {
        // given, when
        int[] result = scoreRank.solution(new int[]{87, 89, 92, 100, 76});

        // then
        assertThat(result).isEqualTo(new int[] {4, 3, 2, 1, 5});
    }

    @Test
    void test2() {
        // given, when
        int[] result = scoreRank.solution(new int[]{90, 90, 100, 100, 87, 55});

        // then
        assertThat(result).isEqualTo(new int[] {3, 3, 1, 1, 5, 6});
    }
}