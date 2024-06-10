package org.example.stack;

import static java.util.stream.Collectors.*;

import java.util.Stack;

public class RemoveCharacterInBracket {
	public String solution(String input) {

		Stack<Character> stack = new Stack<>();
		for (char c : input.toCharArray()) {
			if (c != ')') {
				stack.push(c);
			}
			else {
				// while문 중괄호를 생략할 수가 있음
				while (stack.pop() != '(');
			}
		}

		return stack.stream()
			.map(String::valueOf)
			.collect(joining(""));
	}
}
