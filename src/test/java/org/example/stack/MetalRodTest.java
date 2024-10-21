package org.example.stack;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MetalRodTest {
	MetalRod metalRod = new MetalRod();

	@Test
	void test1() {
		// given
		String input = "()(((()())(())()))(())";

		// when
		int result = metalRod.solution(input);

		// then
		assertThat(result).isEqualTo(17);
	}

	@Test
	void test2() {
		// given
		String input = "(((()(()()))(())()))(()())";

		// when
		int result = metalRod.solution(input);

		// then
		assertThat(result).isEqualTo(24);
	}
}
