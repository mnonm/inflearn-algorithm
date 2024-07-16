package org.example.stack;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PostfixCalculatorTest {
	private PostfixCalculator postfixCalculator = new PostfixCalculator();

	@Test
	void test1() {
		// given, when
		int result = postfixCalculator.solution("352+*9-");

		// then
		assertThat(result).isEqualTo(12);

	}
}
