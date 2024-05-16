package org.example.array;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

class BiggerNumberTest {
	private BiggerNumber biggerNumber = new BiggerNumber();

	@Test
	void test1() {
		// given, when
		List<Integer> result = biggerNumber.solution(6, new int[] {7, 3, 9, 5, 6, 12});

		// then
		assertThat(result).isEqualTo(Lists.newArrayList(7, 9, 6, 12));
	}

	@Test
	void test2() {
		// given, when
		List<Integer> result = biggerNumber.solution(3, new int[] {1, 2, 3});

		// then
		assertThat(result).isEqualTo(Lists.newArrayList(1, 2, 3));
	}

	@Test
	void test3() {
		// given, when
		List<Integer> result = biggerNumber.solution(3, new int[] {3, 2, 1});

		// then
		assertThat(result).isEqualTo(Lists.newArrayList(3));
	}

}
