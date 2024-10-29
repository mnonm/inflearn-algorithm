package org.example.tree;

public class DogWeightMaxSum {

	public int solution(int limitWeight, int[] weights) {
		return dfs(0, limitWeight, 0, weights);
	}

	private int dfs(int idx, int limitWeight, int maxWeight, int[] weights) {
		if (idx > weights.length - 1) {
			return maxWeight;
		}

		int result1 = 0;
		if (maxWeight + weights[idx] <= limitWeight) {
			result1 = dfs(idx + 1, limitWeight, maxWeight + weights[idx], weights);
		}

		int result2 = dfs(idx + 1, limitWeight, maxWeight, weights);

		return Math.max(result1, result2);
	}
}
