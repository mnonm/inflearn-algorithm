package org.example.greedy;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

class SsireumTest {
	private Ssireum ssireum = new Ssireum();

	@Test
	void test1() {
		// given
		List<Ssireum.Player> players = Lists.newArrayList(
			Ssireum.Player.create(172, 67),
			Ssireum.Player.create(183, 65),
			Ssireum.Player.create(180, 70),
			Ssireum.Player.create(170, 72),
			Ssireum.Player.create(181, 60)
		);

		// when
		int result = ssireum.solution(players);

		// then
		assertThat(result).isEqualTo(3);
	}

	@Test
	void test2() {
		// given
		List<Ssireum.Player> players = Lists.newArrayList(
			Ssireum.Player.create(192, 117),
			Ssireum.Player.create(190, 110),
			Ssireum.Player.create(184, 98),
			Ssireum.Player.create(212, 91),
			Ssireum.Player.create(177, 89),
			Ssireum.Player.create(218, 78),
			Ssireum.Player.create(152, 106),
			Ssireum.Player.create(182, 64),
			Ssireum.Player.create(193, 88),
			Ssireum.Player.create(198, 71),
			Ssireum.Player.create(216, 111),
			Ssireum.Player.create(155, 101),
			Ssireum.Player.create(181, 92),
			Ssireum.Player.create(173, 77),
			Ssireum.Player.create(215, 97)
		);

		// when
		int result = ssireum.solution(players);

		// then
		assertThat(result).isEqualTo(3);
	}
}
