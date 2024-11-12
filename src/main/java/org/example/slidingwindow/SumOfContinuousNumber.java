package org.example.slidingwindow;

import java.util.stream.IntStream;

public class SumOfContinuousNumber {

    public int solution(int targetNumber) {

        // 연속된 수의 합이므로 절반을 넘는 순간부터는 확인할 필요가 없다
        int[] numbers = IntStream.rangeClosed(1, targetNumber / 2 + 1).toArray();

        int lt = 0, rt = 0;
        int sum = 0;
        int result = 0;

        // lt가 마지막 인덱스 전까지 가면 종료 (rt 전)
        while (lt < numbers.length - 1) {
            if (sum == targetNumber) {
                result++;
                sum -= numbers[lt++];
                continue;
            }

            if (sum < targetNumber) {
                sum += numbers[rt];
                rt++;
            }
            else {
                sum -= numbers[lt];
                lt++;
            }
        }

        return result;
    }
}
