package org.example.string;

public class StringCompress {
	public String solution(String input) {
		char[] charArray = (input + " ").toCharArray();
		String answer = "";

		int count = 1;
		for (int i = 0; i < charArray.length - 1; i++) {
			if (charArray[i] == charArray[i + 1]) {
				count++;
			} else {
				answer += charArray[i];
				if (count > 1) {
					answer += count;
				}
				count = 1;
			}
		}

		return answer;
	}
}
