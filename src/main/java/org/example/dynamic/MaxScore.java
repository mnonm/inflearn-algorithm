package org.example.dynamic;

import java.util.Arrays;
import java.util.List;

public class MaxScore {
    public int solution(int targetTime, List<ScoreWithTime> scoreWithTimes) {
        // 인덱스를 시간으로 보고, 해당 시간 동안 얻을 수 있는 최고 점수
        int[] dy = new int[targetTime + 1];
        Arrays.fill(dy, 0);

        for (ScoreWithTime scoreWithTime : scoreWithTimes) {
            /**
             * 문제는 한 번만 풀 수 있으므로 동전 교환 문제와 다르게 역순회를 해야 중복 없이 해결할 수 있다
             */
            for (int j = targetTime; j >= scoreWithTime.getTime(); j--) {
                dy[j] = Math.max(dy[j], dy[j - scoreWithTime.getTime()] + scoreWithTime.getScore());
            }
        }

        return dy[targetTime];
    }

    static class ScoreWithTime {
        private int score;
        private int time;

        public ScoreWithTime(int score, int time) {
            this.score = score;
            this.time = time;
        }

        public int getScore() {
            return score;
        }

        public int getTime() {
            return time;
        }
    }
}
