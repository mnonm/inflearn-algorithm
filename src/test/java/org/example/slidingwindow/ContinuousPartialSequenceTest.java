package org.example.slidingwindow;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContinuousPartialSequenceTest {
	private ContinuousPartialSequence continuousPartialSequence = new ContinuousPartialSequence();

	@Test
	void test1() {
		// given
		int[] arr = new int[] {1, 2, 1, 3, 1, 1, 1, 2};
		int target = 6;

		// when
		int result = continuousPartialSequence.solution(arr, target);

		// then
		assertThat(result).isEqualTo(3);
	}

	@Test
	void test2() {
		// given
		int[] arr = new int[] {1, 2, 1, 3, 1, 1, 1, 2};
		int target = 1;

		// when
		int result = continuousPartialSequence.solution(arr, target);

		// then
		assertThat(result).isEqualTo(5);
	}

	@Test
	void test3() {
		// given
		int[] arr = new int[] {1, 2, 1, 3, 1, 1, 1, 2};
		int target = 2;

		// when
		int result = continuousPartialSequence.solution(arr, target);

		// then
		assertThat(result).isEqualTo(4);
	}
}
