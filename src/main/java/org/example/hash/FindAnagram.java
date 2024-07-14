package org.example.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 아나그램은 Map<Character, Integer> 맵을 사용해야 한다
 * 나는 풀 때 계속 Set을 이용하는데, Set은 중복되는 문자를 다룰 수가 없다
 * 그리고 Map을 equals로 비교할 수 있다. 이 때 key, value가 모두 동일해야 같다고 나온다
 */
public class FindAnagram {
	public int solution(String input1, String input2) {
		Map<Character, Integer> input2Map = new HashMap<>();
		for (Character c : input2.toCharArray()) {
			input2Map.put(c, input2Map.getOrDefault(c, 0) + 1);
		}

		char[] input1Arr = input1.toCharArray();
		Map<Character, Integer> input1Map = new HashMap<>();
		int result = 0;

		for (int i = 0; i < input2.length(); i++) {
			input1Map.put(input1Arr[i], input1Map.getOrDefault(input1Arr[i], 0) + 1);
		}

		if (input1Map.equals(input2Map)) {
			result++;
		}

		for(int i = 0; i < input1Arr.length - input2.length(); i++) {
			if (input1Map.get(input1Arr[i]) == 1) {
				input1Map.remove(input1Arr[i]);
			}
			else {
				input1Map.put(input1Arr[i], input1Map.getOrDefault(input1Arr[i], 0) - 1);
			}
			input1Map.put(input1Arr[i + input2.length()], input1Map.getOrDefault(input1Arr[i + input2.length()], 0) + 1);
			if (input1Map.equals(input2Map)) {
				result++;
			}
		}

		return result;
	}
}
