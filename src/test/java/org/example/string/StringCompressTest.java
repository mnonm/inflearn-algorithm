package org.example.string;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCompressTest {
	private StringCompress stringCompress = new StringCompress();

	@Test
	void test1() {
		// given, when
		String result = stringCompress.solution("KKHSSSSSSSE");

		// then
		assertThat(result).isEqualTo("K2HS7E");
	}

	@Test
	void test2() {
		// given, when
		String result = stringCompress.solution("KSTTTSEEKFKKKDJJGG");

		// then
		assertThat(result).isEqualTo("KST3SE2KFK3DJ2G2");
	}
}
