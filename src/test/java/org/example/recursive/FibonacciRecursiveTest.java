package org.example.recursive;

import org.junit.jupiter.api.Test;

class FibonacciRecursiveTest {
	private FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();

	@Test
	void test1() {
		fibonacciRecursive.solution(5);
	}

	@Test
	void test2() {
		fibonacciRecursive.solution(45);
	}

}
