package org.example.tree;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.example.tree.MaxScore.ScoreWithTime;
import org.junit.jupiter.api.Test;

class MaxScoreTest {
    private MaxScore maxScore = new MaxScore();

    @Test
    void test1() {
        // given
        int timeLimit = 20;
        List<ScoreWithTime> scoreWithTimes = List.of(
            new ScoreWithTime(10, 5),
            new ScoreWithTime(25, 12),
            new ScoreWithTime(15, 8),
            new ScoreWithTime(6, 3),
            new ScoreWithTime(7, 4)
        );

        // when
        int result = maxScore.solution(timeLimit, scoreWithTimes);

        // then
        assertThat(result).isEqualTo(41);
    }

    @Test
    void test2() {
        // given
        int timeLimit = 50;
        List<ScoreWithTime> scoreWithTimes = List.of(
            new ScoreWithTime(12, 7),
            new ScoreWithTime(16, 8),
            new ScoreWithTime(20, 10),
            new ScoreWithTime(30, 15),
            new ScoreWithTime(10, 5),
            new ScoreWithTime(25, 12),
            new ScoreWithTime(15, 8),
            new ScoreWithTime(6,3),
            new ScoreWithTime(7,4)
        );

        // when
        int result = maxScore.solution(timeLimit, scoreWithTimes);

        // then
        assertThat(result).isEqualTo(101);
    }
}