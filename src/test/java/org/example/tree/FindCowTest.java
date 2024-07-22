package org.example.tree;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindCowTest {
	private FindCow findCow = new FindCow();

	@Test
	void test1() {
		// given, when
		int result = findCow.solution(5, 14);

		// then
		assertThat(result).isEqualTo(3);
	}

	@Test
	void test2() {
		// given, when
		int result = findCow.solution(8, 3);

		// then
		assertThat(result).isEqualTo(5);
	}

	@Test
	void bfsTest1() {
		// given, when
		int result = findCow.solution2(5, 14);

		// then
		assertThat(result).isEqualTo(3);
	}

	@Test
	void bfsTest2() {
		// given, when
		int result = findCow.solution2(8, 3);

		// then
		assertThat(result).isEqualTo(5);
	}

}
