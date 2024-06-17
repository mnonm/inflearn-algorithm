package org.example.dynamic;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StoneBridgeTest {
	private StoneBridge stoneBridge = new StoneBridge();

	@Test
	void test1() {
		// given, when
		int result = stoneBridge.solution(7);

		// then
		assertThat(result).isEqualTo(34);
	}
}
