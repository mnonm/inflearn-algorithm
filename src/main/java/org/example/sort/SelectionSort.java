package org.example.sort;

public class SelectionSort {
	public int[] solution(int[] inputs) {
		for (int i = 0; i < inputs.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < inputs.length; j++) {
				if (inputs[minIdx] > inputs[j]) {
					minIdx = j;
				}
			}

			int temp = inputs[i];
			inputs[i] = inputs[minIdx];
			inputs[minIdx] = temp;
		}

		return inputs;
	}
}
