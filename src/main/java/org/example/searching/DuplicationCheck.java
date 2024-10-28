package org.example.searching;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicationCheck {
	public String solution(int[] input) {
		Set<Integer> set = new HashSet<>();

		for (int number : input) {
			if (set.contains(number)) {
				return "D";
			}

			set.add(number);
		}

		return "U";
	}

	/**
	 * 시간 초과로 실패
	 */
	public String failedSolution(int[] input) {
		int size = input.length;

		Set<Integer> set = Arrays.stream(input)
			.boxed()
			.collect(toSet());

		return set.size() == size ? "U" : "D";
	}
}
