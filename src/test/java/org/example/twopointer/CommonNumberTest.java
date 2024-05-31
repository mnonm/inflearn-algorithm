package org.example.twopointer;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class CommonNumberTest {
	private CommonNumber commonNumber = new CommonNumber();

	@Test
	void test1() {
		// given, when
		List<Integer> result = commonNumber.solution(new int[] {1, 3, 9, 5, 2}, new int[] {3, 2, 5, 7, 8});

		// then
		assertThat(result).isEqualTo(Arrays.asList(2, 3, 5));
	}

	@Test
	void test2() {
		// given, when
		List<Integer> result = commonNumber.solution2(new int[] {1, 3, 9, 5, 2}, new int[] {3, 2, 5, 7, 8});

		// then
		assertThat(result).isEqualTo(Arrays.asList(2, 3, 5));
	}
}
