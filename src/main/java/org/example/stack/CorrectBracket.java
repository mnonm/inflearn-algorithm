package org.example.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class CorrectBracket {
	public String solution(String input) {
		Stack<Character> stacks = new Stack<>();

		for (char c : input.toCharArray()) {
			if (c == '(') {
				stacks.push(c);
				continue;
			}

			try {
				Character pop = stacks.pop();
				if (pop != '(') {
					return "NO";
				}
			} catch (EmptyStackException e) {
				return "NO";
			}

		}
		return stacks.isEmpty() ? "YES" : "NO";
	}
}
