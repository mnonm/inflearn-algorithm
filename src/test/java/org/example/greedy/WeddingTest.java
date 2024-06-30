package org.example.greedy;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WeddingTest {
	private Wedding wedding = new Wedding();

	@Test
	void test1() {
		// given
		Wedding.TimeState[] timeStates = {
			Wedding.TimeState.createStart(14), Wedding.TimeState.createEnd(18),
			Wedding.TimeState.createStart(12), Wedding.TimeState.createEnd(15),
			Wedding.TimeState.createStart(15), Wedding.TimeState.createEnd(20),
			Wedding.TimeState.createStart(20), Wedding.TimeState.createEnd(30),
			Wedding.TimeState.createStart(5), Wedding.TimeState.createEnd(14),
		};

		// when
		int result = wedding.solution(timeStates);

		// then
		assertThat(result).isEqualTo(2);
	}

	@Test
	void test2() {

		// given
		Wedding.TimeState[] timeStates = {
			Wedding.TimeState.createStart(17), Wedding.TimeState.createEnd(28),
			Wedding.TimeState.createStart(6), Wedding.TimeState.createEnd(30),
			Wedding.TimeState.createStart(1), Wedding.TimeState.createEnd(27),
			Wedding.TimeState.createStart(19), Wedding.TimeState.createEnd(38),
			Wedding.TimeState.createStart(4), Wedding.TimeState.createEnd(46),
			Wedding.TimeState.createStart(23), Wedding.TimeState.createEnd(30),
			Wedding.TimeState.createStart(35), Wedding.TimeState.createEnd(43),
			Wedding.TimeState.createStart(26), Wedding.TimeState.createEnd(45),
			Wedding.TimeState.createStart(21), Wedding.TimeState.createEnd(31),
			Wedding.TimeState.createStart(11), Wedding.TimeState.createEnd(44),
		};

		// when
		int result = wedding.solution(timeStates);

		// then
		assertThat(result).isEqualTo(9);
	}

	@Test
	void test3() {

		// given
		Wedding.TimeState[] timeStates = {
			Wedding.TimeState.createStart(17), Wedding.TimeState.createEnd(28),
			Wedding.TimeState.createStart(6), Wedding.TimeState.createEnd(30),
			Wedding.TimeState.createStart(1), Wedding.TimeState.createEnd(27),
			Wedding.TimeState.createStart(23), Wedding.TimeState.createEnd(30),
		};

		// when
		int result = wedding.solution(timeStates);

		// then
		assertThat(result).isEqualTo(4);
	}
}
