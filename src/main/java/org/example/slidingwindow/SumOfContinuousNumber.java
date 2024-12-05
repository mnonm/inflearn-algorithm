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

    /**
     * 수학적 방식
     * 1. 1부터 하나씩 증가하면서 n까지 숫자를 합한다
     * 2. targetNumber에서 합한 숫자를 제외하고 n개로 나눴을 때 나머지가 0이면 연속된 수로 targetNumber를 만들 수 있다
     *  ex1) targetNumber = 15
     *      1 + 2 = 3
     *      15 - 3 = 12
     *      12 / 2 = 6
     *   -> (1 + 6) + (2 + 6) = 15
     */
    public int solution2(int targetNumber) {
        int result = 0;
        int sum = 1;
        for (int i = 2; i < targetNumber; i++) {
            sum += i;

            if (sum > targetNumber) {
                break;
            }

            if ((targetNumber - sum) % i == 0) {
                result++;
            }
        }
        return result;
    }
}
