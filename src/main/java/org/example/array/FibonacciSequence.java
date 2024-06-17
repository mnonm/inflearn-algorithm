package org.example.array;

public class FibonacciSequence {
	public int[] solution(int input) {
		int[] result = new int[input];

		result[0] = 1;
		result[1] = 1;

		for (int i = 2; i < input; i++) {
			result[i] = result[i - 2] + result[i - 1];
		}

		return result;
	}
}
