package org.example.recursive;

/**
 * 재귀보단 당연히 for문이 빠르다
 * 반복되는 숫자를 저장해두는 메모이제이션을 사용하면 그나마 성능이 좋아진다
 */
public class FibonacciRecursive {
	private static int[] array;

	public void solution(int input) {
		array = new int[input + 1];

		dfs(input);

		for (int i = 1; i <= input; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public int dfs(int n) {
		if (array[n] > 0) {
			return array[n];
		}

		if (n == 1 || n == 2) {
			return array[n] = 1;
		}

		return array[n] = dfs(n - 2) + dfs(n - 1);
	}
}
