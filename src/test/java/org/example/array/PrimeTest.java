package org.example.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeTest {
	private Prime prime = new Prime();

	@Test
	void test1() {
		// given, when
		int result = prime.solution(20);

		// then
		assertThat(result).isEqualTo(8);
	}
}
