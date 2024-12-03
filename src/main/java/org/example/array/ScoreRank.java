package org.example.array;

public class ScoreRank {

    public int[] solution(int[] scores) {
        int[] ranks = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            int rank = 1;
            for (int j = 0; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }

        return ranks;
    }
}
