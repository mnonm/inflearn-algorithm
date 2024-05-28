package org.example.dynamic;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StairUpTest {
	private StairUp stairUp = new StairUp();

	@Test
	void test1() {
		// given, when
		int result = stairUp.solution(4);

		// then
		assertThat(result).isEqualTo(5);
	}

	@Test
	void test2() {
		// given, when
		int result = stairUp.solution(7);

		// then
		assertThat(result).isEqualTo(21);
	}

	@Test
	void test3() {
		// given, when
		int result = stairUp.solution2(4);

		// then
		assertThat(result).isEqualTo(5);
	}

	@Test
	void test4() {
		// given, when
		int result = stairUp.solution2(7);

		// then
		assertThat(result).isEqualTo(21);
	}
}
