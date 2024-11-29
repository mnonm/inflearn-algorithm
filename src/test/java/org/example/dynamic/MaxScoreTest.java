package org.example.dynamic;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.example.dynamic.MaxScore.ScoreWithTime;
import org.junit.jupiter.api.Test;

class MaxScoreTest {

    private MaxScore maxScore = new MaxScore();

    @Test
    void test1() {
        // given
        int targetTime = 20;
        List<ScoreWithTime> scoreWithTimes = List.of(
            new ScoreWithTime(10, 5),
            new ScoreWithTime(25, 12),
            new ScoreWithTime(15, 8),
            new ScoreWithTime(6, 3),
            new ScoreWithTime(7, 4)
        );

        // when
        int result = maxScore.solution(targetTime, scoreWithTimes);

        // then
        assertThat(result).isEqualTo(41);
    }
}