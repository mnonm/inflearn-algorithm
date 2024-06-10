package org.example.sort;

public class BubbleSort {
	public int[] solution(int[] input) {
		for (int i = 1; i < input.length; i++) {
			for (int j = 0; j < input.length - i; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}

		return input;
	}
}

