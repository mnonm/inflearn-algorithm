package org.example.stack;

import java.util.Stack;

public class MetalRod {
	public int solution(String input) {
		char[] inputCharArray = input.toCharArray();
		Stack<Character> stack = new Stack<>();

		int result = 0;
		for (int i = 0; i < inputCharArray.length; i++) {
			if (inputCharArray[i] == '(') {
				stack.push(inputCharArray[i]);
				continue;
			}

			if (inputCharArray[i] == ')') {
				stack.pop();

				if (inputCharArray[i - 1] == '(') {
					result += stack.size();
				} else {
					result += 1; // 잘린 막대기 끝 조각
				}
			}
		}

		return result;
	}
}
