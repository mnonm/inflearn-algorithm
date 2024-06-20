package org.example.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ClawMachineGame {
	public int solution(int[][] board, int[] moves) {
		Map<Integer, Stack<Integer>> stackMap = new HashMap<>();

		for (int i = board.length - 1; i >= 0; i--) {
			for (int j = 0; j < board.length; j++) {
				Stack<Integer> stack = stackMap.getOrDefault(j, new Stack<>());
				if (board[i][j] == 0) {
					continue;
				}
				stack.push(board[i][j]);

				stackMap.put(j, stack);
			}
		}

		int result = 0;
		Stack<Integer> resultStack = new Stack<>();
		for (int move : moves) {
			Stack<Integer> stack = stackMap.get(move - 1);

			if (stack.isEmpty()) {
				continue;
			}

			Integer doll = stack.pop();

			if (resultStack.isEmpty()) {
				resultStack.push(doll);
				continue;
			}

			if (resultStack.peek().equals(doll)) {
				result += 2;
				resultStack.pop();
				continue;
			}

			resultStack.push(doll);
		}

		return result;
	}
}
