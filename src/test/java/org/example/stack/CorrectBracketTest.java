package org.example.stack;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CorrectBracketTest {
	private CorrectBracket correctBracket = new CorrectBracket();

	@Test
	void test1() {
		// given, when
		String solution = correctBracket.solution(")");

		// then
		assertThat(solution).isEqualTo("NO");
	}

	@Test
	void test2() {
		// given, when
		String solution = correctBracket.solution("()");

		// then
		assertThat(solution).isEqualTo("YES");
	}

	@Test
	void test3() {
		// given, when
		String solution = correctBracket.solution("())");

		// then
		assertThat(solution).isEqualTo("NO");
	}

	@Test
	void test4() {
		// given, when
		String solution = correctBracket.solution("()(");

		// then
		assertThat(solution).isEqualTo("NO");
	}

	@Test
	void test5() {
		// given, when
		String solution = correctBracket.solution("(()())()");

		// then
		assertThat(solution).isEqualTo("YES");
	}

	@Test
	void test6() {
		// given, when
		String solution = correctBracket.solution("(()(()))(()");

		// then
		assertThat(solution).isEqualTo("NO");
	}
}
