package org.example.slidingwindow;

public class ContinuousPartialSequence {

	public int solution(int[] input, int target) {
		int lt = 0;
		int rt = 0;
		int sum = input[rt];
		int cnt = 0;

		if (sum == target) {
			cnt++;
		}

		while (lt != input.length - 1) {
			if (sum < target && rt < input.length - 1) {
				rt++;
				sum += input[rt];
			}
			else {
				sum -= input[lt];
				lt++;
			}

			if (sum == target) {
				cnt++;
			}
		}

		return cnt;
	}

	/**
	 * 이중 포문으로 인한 타임 아웃
	 * sliding window나 two pointer 문제는 한 번의 반복으로 해결할 수 없는지 고민 필요
	 */
	public int failSolution(int[] input, int target) {
		int length = input.length;
		int cnt = 0;

		for (int windowSize = 1; windowSize <= length; windowSize++) {
			if (windowSize > target) {
				continue;
			}

			int sum = 0;

			for (int j = 0; j < windowSize; j++) {
				sum += input[j];
			}
			if (sum == target) {
				cnt++;
			}

			for (int i = 0; i < length - windowSize; i++) {
				sum -= input[i];
				sum += input[i + windowSize];
				if (sum == target) {
					cnt++;
				}
			}
		}

		return cnt;
	}
}
