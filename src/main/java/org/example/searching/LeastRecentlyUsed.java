package org.example.searching;

public class LeastRecentlyUsed {
	public int[] solution(int size, int[] inputs) {
		int[] arr = new int[size];

		for (int i : inputs) {
			int idx = getIndex(arr, i);

			if (idx >= 0) {
				for (int j = idx; j > 0; j--) {
					arr[j] = arr[j - 1];
				}
				arr[0] = i;
			} else {
				for (int j = size - 1; j > 0; j--) {
					arr[j] = arr[j - 1];
				}
				arr[0] = i;
			}
		}

		return arr;
	}

	private int getIndex(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
