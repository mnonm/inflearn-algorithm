package org.example.dynamic;

public class StairUp {
	public int solution(int input) {
		int result = dfs(input);
		return result;
	}

	private int dfs(int input) {
		if (input == 0) {
			return 1;
		}

		if (input < 0) {
			return 0;
		}

		int result = 0;
		result += dfs(input - 1);
		result += dfs(input - 2);

		return result;
	}

	/**
	 * 계단을 1, 2, 3개씩 늘려가보면 결국 피보나치 수열 처럼 이전의 두 개 값을 합치면 해당 단계의 올라가는 방법 수를 구할 수 있다
	 * 1개일 때: 1
	 * 2개일 때: 2
	 * 3개일 때: 3
	 * 4개일 때: 5
	 */
	public int solution2(int input) {
		int[] dy = new int[input];
		dy[0] = 1;
		dy[1] = 2;

		for (int i = 2; i < input; i++) {
			dy[i] = dy[i - 1] + dy[i - 2];
		}

		return dy[input - 1];
	}
}
