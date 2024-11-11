package org.example.array;

public class ScoreCalculator {
    public int solution(int[] inputs) {
        int score = 0;

        int additionalScore = 0;
        for (int i = 0; i < inputs.length; i++) {
            int input = inputs[i];

            if (input == 1) {
                additionalScore++;
                score += additionalScore;
            }
            else {
                additionalScore = 0;
            }
        }

        return score;
    }

}
