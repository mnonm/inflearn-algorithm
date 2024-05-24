package org.example.hash;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClassLeaderTest {
	private ClassLeader classLeader = new ClassLeader();

	@Test
	void test1() {
		// given, when
		String result = classLeader.solution(15, "BACBACCACCBDEDE");

		// then
		assertThat(result).isEqualTo("C");
	}
}
