package org.example.sort;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelectionSortTest {
	private SelectionSort selectionSort = new SelectionSort();

	@Test
	void test1() {
		// given, when
		int[] result = selectionSort.solution(new int[] {13, 5, 11, 7, 23, 15});

		// then
		assertThat(result).isEqualTo(new int[] {5, 7, 11, 13, 15, 23});
	}
}
