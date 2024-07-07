package org.example.tree;

import org.junit.jupiter.api.Test;

class SubsetTest {
	private Subset subset = new Subset();

	@Test
	void test1() {
		subset.solution(3);
	}

	@Test
	void test2() {
		subset.solution(5);
	}
}
