package org.example.hash;

import java.util.HashMap;
import java.util.Map;

public class ClassLeader {
	public String solution(int cnt, String input) {
		Map<String, Integer> map = new HashMap<>();

		for (String s : input.split("")) {
			Integer count = map.getOrDefault(s, 0);
			map.put(s, ++count);
		}

		return map.entrySet()
			.stream()
			.max(Map.Entry.comparingByValue())
			.map(Map.Entry::getKey)
			.orElseThrow();
	}
}
