package org.example.hash;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {
	private Anagram anagram = new Anagram();

	@Test
	void test1() {
		// given, when
		boolean result = anagram.solution("AbaAeCe", "baeeACA");

		// then
		assertThat(result).isTrue();
	}

	@Test
	void test2() {
		// given, when
		boolean result = anagram.solution("Zz", "Zz");

		// then
		assertThat(result).isTrue();
	}

	@Test
	void test3() {
		// given, when
		boolean result = anagram.solution2("AbaAeCe", "baeeACA");

		// then
		assertThat(result).isTrue();
	}

	@Test
	void test4() {
		// given, when
		boolean result = anagram.solution2("Zz", "Zz");

		// then
		assertThat(result).isTrue();
	}
}
