package org.example.sort;

public class InsertSort {
	public int[] solution(int[] input) {
		for (int i = 1; i < input.length; i++) {
			int temp = input[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (input[j] > temp) {
					input[j + 1] = input[j];
				} else {
					break;
				}
			}
			input[j + 1] = temp;
		}
		return input;
	}
}
