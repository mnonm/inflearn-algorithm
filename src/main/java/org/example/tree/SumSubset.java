package org.example.tree;

import java.util.Arrays;

public class SumSubset {
	private static boolean flag = false;

	public boolean solution(int depth, int sum, int[] arr) {
		int total = Arrays.stream(arr).sum();

		if (total % 2 == 1) {
			return false;
		}

		return dfs(depth, sum, arr, total);
	}

	private boolean dfs(int depth, int sum, int[] arr, int total) {
		if (flag) {
			return true;
		}

		if (depth == arr.length || sum > total / 2) {
			// 부분합이 전체의 절반을 넘어가는 순간 같을 수 없어지므로
			return false;
		}

		if(sum == total / 2) {
			// flag를 둔 이유는 부분합이 같은 집합을 이미 찾았으므로 더 이상 탐색이 필요가 없으므로
			flag = true;
			return true;
		}

		boolean result1 = dfs(depth + 1, sum + arr[depth], arr, total);
		boolean result2 = dfs(depth + 1, sum, arr, total);

		return result1 || result2;
	}
}
