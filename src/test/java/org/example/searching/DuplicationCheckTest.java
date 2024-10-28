package org.example.searching;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DuplicationCheckTest {
	private DuplicationCheck duplicationCheck = new DuplicationCheck();

	@Test
	void test1() {
		// given, when
		String result = duplicationCheck.solution(new int[] {20, 25, 52, 30, 39, 33, 43, 33});

		// then
		assertThat(result).isEqualTo("D");
	}

	@Test
	void test2() {
		// given, when
		String result = duplicationCheck.solution(new int[] {20, 25, 52, 30});

		// then
		assertThat(result).isEqualTo("U");
	}
}
