package org.example.string;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class StringDistanceTest {
	private StringDistance stringDistance = new StringDistance();

	@Test
	void test1() {
		// given, when
		List<Integer> result = stringDistance.solution("teachermode", 'e');

		// then
		assertThat(result).isEqualTo(List.of(1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 0));
	}

	@Test
	void test2() {
		// given, when
		int[] result = stringDistance.solution2("teachermode", 'e');

		// then
		assertThat(result).isEqualTo(new int[] {1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 0});
	}
}
