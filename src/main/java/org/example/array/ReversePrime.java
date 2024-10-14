package org.example.array;

import java.util.ArrayList;
import java.util.List;

public class ReversePrime {
	public List<Integer> solution(int[] input) {
		List<Integer> result = new ArrayList<>();

		for (int in : input) {
			int reversedNum = reverseNumber(in);

			if (isPrimeNumber(reversedNum)) {
				result.add(reversedNum);
			}
		}

		return result;
	}

	public boolean isPrimeNumber(int input) {
		if (input == 1) {
			return false;
		}

		if (input == 2) {
			return true;
		}

		for (int i = 2; i <= Math.sqrt(input); i++) {
			if (input % i == 0) {
				return false;
			}
		}

		return true;
	}

	public int reverseNumber(int input) {
		int ret = 0;
		while (input > 0) {
			int t = input % 10;
			ret = ret * 10 + t;
			input = input / 10;
		}

		return ret;
	}
}
