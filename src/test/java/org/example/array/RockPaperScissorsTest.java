package org.example.array;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {
	private RockPaperScissors rps = new RockPaperScissors();

	@Test
	void test1() {
		// given, when
		List<String> result = rps.solution(new int[] {2, 3, 3, 1, 3}, new int[] {1, 1, 2, 2, 3});

		// then
		assertThat(result).isEqualTo(Arrays.asList("A", "B", "A", "B", "D"));
	}
}
