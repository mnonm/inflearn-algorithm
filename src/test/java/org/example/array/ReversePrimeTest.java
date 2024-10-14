package org.example.array;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ReversePrimeTest {

	private ReversePrime reversePrime = new ReversePrime();

	@Test
	void test1() {
		// given
		int[] input = {32, 55, 62, 20, 250, 370, 200, 300, 100};

		// when
		List<Integer> result = reversePrime.solution(input);

		// then
		assertThat(result).isEqualTo(List.of(23, 2, 73, 2, 3));
	}

	@Test
	void test2() {
		boolean result = reversePrime.isPrimeNumber(121);

		assertThat(result).isFalse();
	}
}
