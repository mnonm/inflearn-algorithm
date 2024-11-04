package org.example.dynamic;

import java.util.Arrays;

public class CoinExchange {

	public int solution(Integer[] coins, int targetExchange) {
		// 해당하는 인덱스의 금액을 만드는데 필요한 최소 동전 개수
		int[] dy = new int[targetExchange + 1];
		Arrays.fill(dy, Integer.MAX_VALUE);
		// 메모이제이션으로 처리하므로 초기화 필수
		dy[0] = 0;
		Arrays.sort(coins);

		// 모든 동전을 순회
		for (Integer coin : coins) {
			// 해당하는 동전부터 시작, target	까지 하나씩 증가하면서 전부 비교
			for (int i = coin; i <= targetExchange; i++) {
				// 동전을 하나 사용하므로 +1, dy에서 해당 동전의 금액을 제외
				dy[i] = Math.min(dy[i], dy[i - coin] + 1);
			}
		}

		return dy[targetExchange];
	}
}
