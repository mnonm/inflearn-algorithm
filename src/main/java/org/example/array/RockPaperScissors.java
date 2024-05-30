package org.example.array;

import java.util.ArrayList;
import java.util.List;

public class RockPaperScissors {
	public List<String> solution(int[] a, int[] b) {
		List<String> result = new ArrayList<>();
		int size = a.length;

		for (int i = 0; i < size; i++) {
			if (a[i] == b[i]) {
				result.add("D");
			} else if (a[i] > b[i]) {
				if (a[i] - b[i] == 2) {
					result.add("B");
				} else {
					result.add("A");
				}
			} else {
				if (b[i] - a[i] == 2) {
					result.add("A");
				} else {
					result.add("B");
				}
			}
		}

		return result;
	}
}
