package org.example.array;

public class VisibleStudent {
	public int solution(int size, int[] inputs) {
		int cnt = 0;
		int maxSize = 0;

		for (int input : inputs) {
			if (input > maxSize) {
				cnt++;
				maxSize = input;
			}
		}

		return cnt;
	}
}
