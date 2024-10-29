package org.example.tree;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DogWeightMaxSumTest {

	private DogWeightMaxSum dogWeightMaxSum = new DogWeightMaxSum();

	@Test
	void test1() {
		// given, when
		int result = dogWeightMaxSum.solution(259, new int[] {81, 58, 42, 33, 61});

		// then
		assertThat(result).isEqualTo(242);
	}

}
