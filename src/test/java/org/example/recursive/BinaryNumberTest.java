package org.example.recursive;

import org.junit.jupiter.api.Test;

class BinaryNumberTest {
	private BinaryNumber binaryNumber = new BinaryNumber();

	@Test
	void test1() {
		binaryNumber.dfs(11);
	}

}
