package org.example.twopointer;

import java.util.ArrayList;
import java.util.List;

public class TwoArrayMerge {
	public int[] solution(int firstSize, int[] firstArray, int secondSize, int[] secondArray) {
		int[] result = new int[firstSize + secondSize];
		int firstIdx = 0, secondIdx = 0;
		boolean firstEnd = false, secondEnd = false;

		for (int i = 0; i < result.length; i++) {
			if (firstIdx == firstSize) {
				firstEnd = true;
				break;
			}
			if (secondIdx == secondSize) {
				secondEnd = true;
				break;
			}

			if (firstArray[firstIdx] < secondArray[secondIdx]) {
				result[i] = firstArray[firstIdx];
				firstIdx++;
			} else if (firstArray[firstIdx] == secondArray[secondIdx]) {
				result[i] = firstArray[firstIdx];
				i++;
				result[i] = secondArray[secondIdx];
				firstIdx++;
				secondIdx++;
			} else {
				result[i] = secondArray[secondIdx];
				secondIdx++;
			}
		}

		if (firstEnd) {
			for (int i = secondIdx; i < result.length; i++) {
				result[firstSize + i] = secondArray[secondIdx];
				secondIdx++;
				if (secondIdx == secondSize) {
					break;
				}
			}
		}

		if (secondEnd) {
			for (int i = firstIdx; i < result.length; i++) {
				result[secondSize + i] = firstArray[firstIdx];
				firstIdx++;
				if (firstIdx == firstSize) {
					break;
				}
			}
		}

		return result;
	}

	public int[] solution2(int input1, int[] input2, int input3, int[] input4) {
		int p1 = 0, p2 = 0;
		List<Integer> result = new ArrayList<>();
		while (p1 < input1 && p2 < input3) {
			if (input2[p1] > input4[p2]) {
				result.add(input4[p2++]);
			} else {
				result.add(input2[p1++]);
			}
		}

		while (p2 < input3) {
			result.add(input4[p2++]);
		}
		while (p1 < input1) {
			result.add(input2[p1++]);
		}

		return result.stream()
			.mapToInt(Integer::intValue)
			.toArray();
	}
}
