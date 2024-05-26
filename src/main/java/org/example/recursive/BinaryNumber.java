package org.example.recursive;

public class BinaryNumber {
	public void dfs(int num) {
		if (num == 0)
			return;

		dfs(num / 2);
		System.out.print(num % 2 + " ");
	}
}
