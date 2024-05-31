package org.example.twopointer;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CommonNumber {
	public List<Integer> solution(int[] input1, int[] input2) {
		Set<Integer> set1 = Arrays.stream(input1)
			.boxed()
			.collect(toSet());

		Set<Integer> set2 = Arrays.stream(input2)
			.boxed()
			.collect(toSet());

		set1.retainAll(set2);

		return set1.stream()
			.sorted()
			.collect(toList());
	}

	public List<Integer> solution2(int[] input1, int[] input2) {
		Arrays.sort(input1);
		Arrays.sort(input2);

		return findCommonNumber(input1, input2);
	}

	private static List<Integer> findCommonNumber(int[] input1, int[] input2) {
		List<Integer> result = new ArrayList<>();
		int idx1 = 0;
		int idx2 = 0;
		while (idx1 != input1.length && idx2 != input2.length)
			if (input1[idx1] == input2[idx2]) {
				result.add(input1[idx1]);
				idx1++;
				idx2++;
			} else if (input1[idx1] > input2[idx2]) {
				idx2++;
			} else {
				idx1++;
			}
		return result;
	}

	// 1 2 3 5 6 7   1 2 7 8
}
