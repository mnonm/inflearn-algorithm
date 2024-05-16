package org.example.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 큰 수 출력하기
 */
public class BiggerNumber {
	public List<Integer> solution(int cnt, int[] arrays) {
		List<Integer> output = new ArrayList<>();

		for (int i = 0; i < arrays.length; i++) {
			if (i == 0) {
				output.add(arrays[0]);
				continue;
			}

			if (arrays[i] > arrays[i - 1]) {
				output.add(arrays[i]);
			}
		}

		return output;
	}
}
