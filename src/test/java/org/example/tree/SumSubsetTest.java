package org.example.tree;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumSubsetTest {
	private SumSubset sumSubset = new SumSubset();

	@Test
	void test1() {
		// given
		int[] arr = new int[] {1, 3, 5, 6, 7, 10};

		// when
		boolean result = sumSubset.solution(0, 0, arr);

		// then
		assertThat(result).isTrue();
	}

	@Test
	void test2() {
		// given
		int[] arr = new int[] {3, 6, 13, 11, 7, 16, 34, 23, 12};

		// when
		boolean result = sumSubset.solution(0, 0, arr);

		// then
		assertThat(result).isFalse();
	}
}
