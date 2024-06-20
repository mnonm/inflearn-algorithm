package org.example.sort;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InsertSortTest {
	private InsertSort insertSort = new InsertSort();

	@Test
	void test1() {
		// given, when
		int[] result = insertSort.solution(new int[] {11, 7, 5, 6, 10, 9});

		// then
		assertThat(result).isEqualTo(new int[] {5, 6, 7, 9, 10, 11});
	}
}
