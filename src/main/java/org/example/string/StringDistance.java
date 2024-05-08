 package org.example.string;

import java.util.ArrayList;
import java.util.List;

public class StringDistance {
	public List<Integer> solution(String string, char target) {
		List<Integer> targetIdxList = new ArrayList<>();
		int targetIdx = string.indexOf(target);
		if (targetIdx == -1) {
			throw new IllegalArgumentException("target이 존재하지 않습니다.");
		}

		while (targetIdx != -1) {
			targetIdxList.add(targetIdx);
			targetIdx = string.indexOf(target, targetIdx + 1);
		}

		List<Integer> answerList = new ArrayList<>();
		char[] stringArray = string.toCharArray();
		for (int i = 0; i < stringArray.length; i++) {
			int minDistance = 1000;
			for (Integer integer : targetIdxList) {
				if (stringArray[i] == target) {
					minDistance = 0;
					break;
				}

				int distance = Math.abs(i - integer);
				if (minDistance > distance) {
					minDistance = distance;
				}
			}
			answerList.add(minDistance);
		}

		return answerList;
	}

	public int[] solution2(String string, char target) {
		int length = string.length();
		char[] stringArray = string.toCharArray();
		int[] answer = new int[length];

		int distance = 1000;
		for (int i = 0; i < length; i++) {
			if (stringArray[i] == target) {
				answer[i] = 0;
				distance = 0;
			}
			else {
				distance++;
				answer[i] = distance;
			}
		}

		distance = 1000;
		for (int i = length - 1; i >= 0; i--) {
			if (stringArray[i] == target) {
				distance = 0;
			}
			else {
				distance++;
				answer[i] = Math.min(answer[i], distance);
			}
		}

		return answer;
	}
}
