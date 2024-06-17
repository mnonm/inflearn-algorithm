package org.example.dynamic;

public class StoneBridge {
	public int solution(int input) {
		/**
		 * 함정이 있음.
		 * 돌다리를 전부 건너려면 마지막 돌까지만 가면 되는게 아니라 완전히 건너가야 한다.
		 * 그래서 input에 + 1
		 */
		return dfs(input + 1);
	}

	public int dfs(int stoneCnt) {
		if (stoneCnt < 0) {
			return 0;
		}

		if (stoneCnt == 0) {
			return 1;
		}

		return dfs(stoneCnt - 1) + dfs(stoneCnt - 2);
	}
}
