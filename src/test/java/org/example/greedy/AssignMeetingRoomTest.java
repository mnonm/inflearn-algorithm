package org.example.greedy;

import static org.assertj.core.api.Assertions.*;

import org.example.greedy.AssignMeetingRoom.Time;
import org.junit.jupiter.api.Test;

class AssignMeetingRoomTest {
	private AssignMeetingRoom amr = new AssignMeetingRoom();

	@Test
	void test1() {
		// given
		Time[] times = {new Time(1, 4), new Time(2, 3), new Time(3, 5), new Time(4, 6), new Time(5, 7)};

		// when
		int result = amr.solution(times);

		// then
		assertThat(result).isEqualTo(3);
	}

	@Test
	void test2() {
		// given
		Time[] times = {new Time(3, 3), new Time(1, 3), new Time(2, 3)};

		// when
		int result = amr.solution(times);

		// then
		assertThat(result).isEqualTo(2);
	}

	@Test
	void test3() {
		// given
		Time[] times = {new Time(3, 3), new Time(1, 3), new Time(2, 3), new Time(4, 6), new Time(5, 7)};

		// when
		int result = amr.solution(times);

		// then
		assertThat(result).isEqualTo(3);
	}

	@Test
	void test4() {
		// given
		Time[] times = {new Time(1, 4), new Time(2, 3), new Time(3, 5), new Time(4, 6), new Time(5, 7)};

		// when
		int result = amr.solution2(times);

		// then
		assertThat(result).isEqualTo(3);
	}

	@Test
	void test5() {
		// given
		Time[] times = {new Time(3, 3), new Time(1, 3), new Time(2, 3)};

		// when
		int result = amr.solution2(times);

		// then
		assertThat(result).isEqualTo(2);
	}

	@Test
	void test6() {
		// given
		Time[] times = {new Time(3, 3), new Time(1, 3), new Time(2, 3), new Time(4, 6), new Time(5, 7)};

		// when
		int result = amr.solution2(times);

		// then
		assertThat(result).isEqualTo(3);
	}
}
