package org.example.hash;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindAnagramTest {
	private FindAnagram findAnagram = new FindAnagram();

	@Test
	void test1() {
		// given, when
		int result = findAnagram.solution("bacaAacba", "abc");

		// then
		assertThat(result).isEqualTo(3);
	}

}
