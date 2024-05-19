package org.example.twopointer;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoArrayMergeTest {

	private TwoArrayMerge twoArrayMerge = new TwoArrayMerge();

	@Test
	void test1() {
		// given, when
		int[] result = twoArrayMerge.solution(3, new int[] {1, 3, 5}, 5, new int[] {2, 3, 6, 7, 9});

		// then
		assertThat(result).isEqualTo(new int[] {1, 2, 3, 3, 5, 6, 7, 9});
	}

	@Test
	void test2() {
		// given, when
		int[] result = twoArrayMerge.solution(0, new int[] {}, 5, new int[] {2, 3, 6, 7, 9});

		// then
		assertThat(result).isEqualTo(new int[] {2, 3, 6, 7, 9});
	}

	@Test
	void test3() {
		// given, when
		int[] result = twoArrayMerge.solution(3, new int[] {1, 3, 5}, 0, new int[] {});

		// then
		assertThat(result).isEqualTo(new int[] {1, 3, 5});
	}

	@Test
	void test4() {
		// given, when
		int[] result = twoArrayMerge.solution2(3, new int[] {1, 3, 5}, 5, new int[] {2, 3, 6, 7, 9});

		// then
		assertThat(result).isEqualTo(new int[] {1, 2, 3, 3, 5, 6, 7, 9});
	}

	@Test
	void test5() {
		// given, when
		int[] result = twoArrayMerge.solution2(0, new int[] {}, 5, new int[] {2, 3, 6, 7, 9});

		// then
		assertThat(result).isEqualTo(new int[] {2, 3, 6, 7, 9});
	}

	@Test
	void test6() {
		// given, when
		int[] result = twoArrayMerge.solution2(3, new int[] {1, 3, 5}, 0, new int[] {});

		// then
		assertThat(result).isEqualTo(new int[] {1, 3, 5});
	}
}
