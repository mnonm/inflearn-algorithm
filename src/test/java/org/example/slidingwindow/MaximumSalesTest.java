package org.example.slidingwindow;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumSalesTest {
	private MaximumSales maximumSales = new MaximumSales();

	@Test
	void test1() {
		// given, when
		int result = maximumSales.solution(new int[] {12, 15, 11, 20, 25, 10, 20, 19, 13, 15}, 3);

		// then
		assertThat(result).isEqualTo(56);
	}

	@Test
	void test2() {
		// given, when
		int result = maximumSales.solution(new int[] {12, 15, 11, 20, 25, 10, 20, 19, 13, 15}, 4);

		// then
		assertThat(result).isEqualTo(75);
	}
}
