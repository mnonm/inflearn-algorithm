package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class SavingThePrincess {
    public int solution(int numberOfPrince, int targetNumber) {
        /**
         * 1~n까지 숫자를 Queue로 생성
         * Queue의 구현체로 LinkedList 임을 확인
         * LinkedList로 바로 생성하는 부분 확인
         */
        Queue<Integer> queue = IntStream.rangeClosed(1, numberOfPrince)
            .boxed()
            .collect(LinkedList::new, LinkedList::add, LinkedList::addAll);

        int idx = 0;
        while (queue.size() != 1) {
            idx++;
            if (idx == targetNumber) {
                // 인덱스에 해당하는 사람은 제거
                queue.poll();
                idx = 0;
            }
            else {
                // 인덱스에 해당하지 않으면 큐의 마지막에 다시 삽입
                Integer notTargetNumber = queue.poll();
                queue.offer(notTargetNumber);
            }
        }

        return queue.poll();
    }
}
