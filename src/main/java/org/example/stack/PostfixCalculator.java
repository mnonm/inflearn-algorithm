package org.example.stack;

import java.util.Stack;

public class PostfixCalculator {
	public int solution(String input) {
		Stack<Integer> stack = new Stack<>();

		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				stack.push(Character.getNumericValue(c));
			} else {
				Integer first = stack.pop();
				Integer second = stack.pop();

				switch (c) {
					case '*':
						stack.push(first * second);
						break;
					case '+':
						stack.push(first + second);
						break;
					case '-':
						stack.push(second - first);
						break;
					case '/':
						stack.push(second/first);
						break;
				}
			}

		}

		return stack.pop();
	}
}
