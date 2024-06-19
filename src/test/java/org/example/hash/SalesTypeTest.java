package org.example.hash;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

class SalesTypeTest {
	private SalesType salesType = new SalesType();

	@Test
	void test1() {
		// given, when
		List<Integer> result = salesType.solution(new int[] {20, 12, 20, 10, 23, 17, 10}, 4);

		// then
		assertThat(result).isEqualTo(Lists.newArrayList(3, 4, 4, 3));
	}
}
