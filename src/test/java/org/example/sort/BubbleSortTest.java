package org.example.sort;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {
	private BubbleSort bubbleSort = new BubbleSort();

	@Test
	void test1() {
		// given, when
		int[] result = bubbleSort.solution(new int[] {13, 5, 11, 7, 23, 15});

		// then
		assertThat(result).isEqualTo(new int[] {5, 7, 11, 13, 15, 23});
	}

}
