package org.example.recursive;

public class Factorial {
	public int solution(int input) {
		return dfs(input);
	}

	public int dfs(int input) {
		if (input == 1) {
			return 1;
		}

		return input * dfs(input - 1);
	}
}
