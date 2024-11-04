package org.example.dynamic;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoinExchangeTest {
	private CoinExchange coinExchange = new CoinExchange();

	@Test
	void test1() {
		// given
		int targetExchange = 15;
		Integer[] coins = new Integer[] {1, 2, 5};

		// when
		int result = coinExchange.solution(coins, targetExchange);

		// then
		assertThat(result).isEqualTo(3);
	}

	@Test
	void test2() {
		// given
		int targetExchange = 129;
		Integer[] coins = new Integer[] {1, 8, 20, 25, 50};

		// when
		int result = coinExchange.solution(coins, targetExchange);

		// then
		assertThat(result).isEqualTo(5);
	}
}
