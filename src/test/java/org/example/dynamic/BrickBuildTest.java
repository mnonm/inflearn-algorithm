package org.example.dynamic;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

class BrickBuildTest {

	private BrickBuild brickBuild = new BrickBuild();

	@Test
	void test1() {
		// given
		List<BrickBuild.Brick> bricks = Lists.newArrayList(
			new BrickBuild.Brick(25, 3, 4),
			new BrickBuild.Brick(4, 4, 6),
			new BrickBuild.Brick(9, 2, 3),
			new BrickBuild.Brick(16, 2, 5),
			new BrickBuild.Brick(1, 5, 2));

		// when
		int result = brickBuild.solution(bricks);

		// then
		assertThat(result).isEqualTo(10);
	}

}
