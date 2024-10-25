package org.example.hash;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BigNumberTest {

	private BigNumber bigNumber = new BigNumber();

	@Test
	void test1() {
		// given
		int[] array = new int[] {13, 15, 34, 23, 45, 65, 33, 11, 26, 42};
		int nThBigNumber = 3;

		// when
		int result = bigNumber.solution(array.length, nThBigNumber, array);

		// then
		assertThat(result).isEqualTo(143);
	}

	@Test
	void test2() {
		// given
		int[] array = new int[] {};
		int nThBigNumber = 3;

		// when
		int result = bigNumber.solution(array.length, nThBigNumber, array);

		// then
		assertThat(result).isEqualTo(-1);
	}

}
