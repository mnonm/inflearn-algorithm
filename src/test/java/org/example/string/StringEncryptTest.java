package org.example.string;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringEncryptTest {
	private StringEncrypt stringEncrypt = new StringEncrypt();

	@Test
	void test1() {
		// given
		String result = stringEncrypt.solution(4, "#****###**#####**#####**##**");

		// when, then
		assertThat(result).isEqualTo("COOL");
	}

}
