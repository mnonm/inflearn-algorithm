package org.example.dynamic;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestIncreaseSequenceTest {
	private LongestIncreaseSequence longestIncreaseSequence = new LongestIncreaseSequence();

	@Test
	void test1() {
		// given
		int[] input = {5, 3, 7, 8, 6, 2, 9, 4};

		// when
		int result = longestIncreaseSequence.solution(input);

		// then
		assertThat(result).isEqualTo(4);
	}

	@Test
	void test2() {
		// given
		int[] input = {5, 2, 18, 3, 4, 7, 10, 9, 11, 8, 15};

		// when
		int result = longestIncreaseSequence.solution(input);

		// then
		assertThat(result).isEqualTo(7);
	}

}
