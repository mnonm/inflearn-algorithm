package org.example.string;

public class StringEncrypt {

	public String solution(int çnt, String input) {
		final int MAX_LENGTH = 7;

		// *를 변환할 때는 escape 문자여서 \\를 앞에 붙여야 한다.
		String translatedStr = input.replaceAll("#", "1")
									.replaceAll("\\*", "0");

		char[] chars = new char[çnt];
		for (int i = 0; i < çnt; i++) {
			// substring from, end를 호출해서 원본 스트링을 두고 계속 잘라간다.
			String subStr = translatedStr.substring(i * MAX_LENGTH, i * MAX_LENGTH + MAX_LENGTH);
			// 이진수 문자열을 십진수로 변환
			int decimal = Integer.parseInt(subStr, 2);
			// 십진수를 아스키코드에 해당하는 문자로 변환
			chars[i] = (char) decimal;
		}

		return String.valueOf(chars);
	}
}
