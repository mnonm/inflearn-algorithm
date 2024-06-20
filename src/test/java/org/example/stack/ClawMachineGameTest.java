package org.example.stack;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClawMachineGameTest {
	private ClawMachineGame clawMachineGame = new ClawMachineGame();

	@Test
	void test1() {
		// given
		int[][] board = {
			{0, 0, 0, 0, 0},
			{0, 0, 1, 0, 3},
			{0, 2, 5, 0, 1},
			{4, 2, 4, 4, 2},
			{3, 5, 1, 3, 1}
		};

		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

		// when
		int result = clawMachineGame.solution(board, moves);

		// then
		assertThat(result).isEqualTo(4);
	}

	@Test
	void test2() {
		// given
		int[][] board = {
			{0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 3, 1},
			{0, 2, 5, 0, 1, 1},
			{4, 2, 4, 4, 2, 3},
			{3, 5, 1, 3, 1, 3},
			{4, 2, 4, 4, 2, 3}
		};

		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4, 3, 4};

		// when
		int result = clawMachineGame.solution(board, moves);

		// then
		assertThat(result).isEqualTo(6);
	}

}
