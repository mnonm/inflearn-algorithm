package org.example.dynamic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BrickBuild {

	public int solution(List<Brick> bricks) {
		Collections.sort(bricks);

		// idx에 해당하는 벽돌이 가장 위에 있을 때, 최대 높이
		int[] dy = new int[bricks.size()];
		dy[0] = bricks.get(0).getHeight();

		for (int i = 1; i < bricks.size(); i++) {
			int max = bricks.get(i).getHeight();
			for (int j = i - 1; j >= 0; j--) {
				if (bricks.get(i).getArea() < bricks.get(j).getArea() &&
					bricks.get(i).getWeight() < bricks.get(j).getWeight()) {
					max = Math.max(max, dy[j] + bricks.get(i).getHeight());
				}
			}
			dy[i] = max;
		}

		return Arrays.stream(dy)
			.max()
			.getAsInt();
	}

	static class Brick implements Comparable<Brick> {
		private int area;
		private int height;
		private int weight;

		@Override
		public int compareTo(Brick other) {
			return other.area - this.area;
		}

		public Brick(int area, int height, int weight) {
			this.area = area;
			this.height = height;
			this.weight = weight;
		}

		public int getArea() {
			return area;
		}

		public int getHeight() {
			return height;
		}

		public int getWeight() {
			return weight;
		}
	}

}
