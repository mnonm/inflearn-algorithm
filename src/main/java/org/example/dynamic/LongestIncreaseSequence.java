package org.example.dynamic;

import java.util.Arrays;

public class LongestIncreaseSequence {
	public int solution(int[] input) {
		int[] dy = new int[input.length];
		dy[0] = 1;

		for (int i = 1; i < input.length; i++) {
			int max = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (input[i] > input[j] && dy[j] > max) {
					max = dy[j];
				}

				dy[i] = max + 1;
			}
		}

		return Arrays.stream(dy).max().getAsInt();
	}
}
