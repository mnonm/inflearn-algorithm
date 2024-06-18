package org.example.slidingwindow;

public class MaximumSales {
	public int solution(int[] input, int day) {
		int sum = 0;
		int max;
		for (int i = 0; i < day; i++) {
			sum += input[i];
		}

		max = sum;

		for (int i = 0; i < input.length - day; i++) {
			sum -= input [i];
			sum += input [i + day];

			max = Math.max(sum, max);
		}

		return max;
	}
}
