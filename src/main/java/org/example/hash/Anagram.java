package org.example.hash;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public boolean solution(String input1, String input2) {

		int[] input1Cnt = calculateAlphabetCount(input1);
		int[] input2Cnt = calculateAlphabetCount(input2);

		for (int i = 0; i < 52; i++) {
			if (input1Cnt[i] != input2Cnt[i]) {
				return false;
			}
		}

		return true;
	}

	private static int[] calculateAlphabetCount(String input) {
		int[] inputCnt = new int[52];
		for (char c : input.toCharArray()) {
			int idx = c;
			if (idx >= 97) {
				idx = idx - 97;
			} else {
				idx = idx - 65;
			}
			inputCnt[idx]++;
		}

		return inputCnt;
	}

	public boolean solution2(String input1, String input2) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : input1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (char c : input2.toCharArray()) {
			if (!map.containsKey(c) || map.get(c) == 0) {
				return false;
			}

			map.put(c, map.get(c) - 1);
		}

		return true;
	}
}
