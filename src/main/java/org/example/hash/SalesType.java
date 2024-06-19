package org.example.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 이 문제의 핵심은 해시맵을 사용하는 것.
 * 그리고 입력 받은 값을 map의 key로 사용하고 key의 size를 재는것
 * 맵이 아니 리스트를 이용해서 remove를 하니까 시간 초과 (O^2)
 */
public class SalesType {
	public List<Integer> solution(int[] salesRecord, int days) {
		List<Integer> results = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < days; i++) {
			map.put(salesRecord[i], map.getOrDefault(salesRecord[i], 0) + 1);
		}
		results.add(map.keySet().size());

		for (int i = days; i < salesRecord.length; i++) {
			map.put(salesRecord[i - days], map.get(salesRecord[i - days]) - 1);
			map.put(salesRecord[i], map.getOrDefault(salesRecord[i], 0) + 1);
			if (map.get(salesRecord[i - days]).equals(0)) {
				map.remove(salesRecord[i - days]);
			}

			results.add(map.keySet().size());
		}

		return results;
	}
}
