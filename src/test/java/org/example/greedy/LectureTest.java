package org.example.greedy;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

class LectureTest {
	private Lecture lecture = new Lecture();

	@Test
	void test1() {
		// given
		List<Lecture.PayWithDay> payWithDays = Lists.newArrayList(
			Lecture.PayWithDay.create(50, 2),
			Lecture.PayWithDay.create(20, 1),
			Lecture.PayWithDay.create(40, 2),
			Lecture.PayWithDay.create(60, 3),
			Lecture.PayWithDay.create(30, 3),
			Lecture.PayWithDay.create(30, 1)
		);

		// when
		int result = lecture.solution(payWithDays);

		// then
		assertThat(result).isEqualTo(150);
	}

}
