package org.example.searching;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeastRecentlyUsedTest {
	private LeastRecentlyUsed lru = new LeastRecentlyUsed();

	@Test
	void test1() {
		// given, when
		int[] result = lru.solution(5, new int[] {1, 2, 3, 2, 6, 2, 3, 5, 7});

		// then
		assertThat(result).isEqualTo(new int[] {7, 5, 3, 2, 6});
	}

}
