package org.example.tree;

import java.util.List;

public class MaxScore {

    static int maxScore = 0;
    public int solution(int timeLimit, List<ScoreWithTime> scores) {

        dfs(scores, 0, 0, 0, timeLimit);

        return maxScore;
    }

    private void dfs(List<ScoreWithTime> scores, int idx, int scoreSum, int timeSum, int timeLimit) {
        if (timeSum > timeLimit) {
            return;
        }

        if (idx == scores.size()) {
            maxScore = Math.max(maxScore, scoreSum);
            return;
        }

        ScoreWithTime scoreWithTime = scores.get(idx);
        dfs(scores, idx + 1, scoreSum + scoreWithTime.getScore(), timeSum + scoreWithTime.getTime(), timeLimit);
        dfs(scores, idx + 1, scoreSum, timeSum, timeLimit);
    }

    static class ScoreWithTime {
        private final int score;
        private final int time;

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
