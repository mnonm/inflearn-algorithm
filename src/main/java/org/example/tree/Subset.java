package org.example.tree;

public class Subset {
	public void solution(int n) {
		int[] check = new int[n + 1];
		dfs(n, 1, check);
	}

	private void dfs(int n, int depth, int[] check) {
		if (depth == n + 1) {
			String tmp = "";
			for (int i = 1; i < check.length; i++) {
				if (check[i] == 1) {
					tmp += i + " ";
				}
			}

			if (!tmp.isEmpty()) {
				System.out.println(tmp);
			}

			return;
		}

		check[depth] = 1;
		dfs(n, depth + 1, check);

		check[depth] = 0;
		dfs(n, depth + 1, check);
	}
}
