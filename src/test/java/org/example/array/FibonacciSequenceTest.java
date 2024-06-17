package org.example.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciSequenceTest {
	private FibonacciSequence fibonacciSequence = new FibonacciSequence();

	@Test
	void test1() {
		// given, when
		int[] result = fibonacciSequence.solution(10);

		// then
		assertThat(result).isEqualTo(new int[] {1, 1, 2, 3, 5, 8, 13, 21, 34, 55});
	}

}
