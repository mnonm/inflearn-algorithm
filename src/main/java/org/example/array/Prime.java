package org.example.array;

import java.util.Arrays;

public class Prime {
	public int solution(int input) {
		Boolean[] arr = new Boolean[input];

		arr[0] = false;
		arr[1] = false;
		for (int i = 2; i < input; i++) {
			arr[i] = true;
		}

		for (int i = 2; i < Math.sqrt(input); i++) {
			for (int j = i * i; j < input; j += i) {
				arr[j] = false;
			}
		}

		return (int)Arrays.stream(arr)
			.filter(Boolean::booleanValue)
			.count();
	}
}
