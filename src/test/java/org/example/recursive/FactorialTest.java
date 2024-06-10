package org.example.recursive;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {
	private Factorial factorial = new Factorial();

	@Test
	void test1() {
		// given, when
		int result = factorial.solution(5);

		// then
		assertThat(result).isEqualTo(120);
	}
}
