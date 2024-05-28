package org.example.greedy;

import static java.util.Comparator.*;

import java.util.List;

public class Ssireum {

	public int solution(List<Player> players) {

		players.sort(comparing(Player::getHeight).reversed());
		int cnt = 0;
		Integer max = Integer.MIN_VALUE;
		for (int i = 0; i < players.size(); i++) {
			if (max.compareTo(players.get(i).getWeight()) < 0) {
				max = players.get(i).getWeight();
				cnt++;
			}
		}

		return cnt;
	}

	static class Player {
		private Integer height;
		private Integer weight;

		private Player(Integer height, Integer weight) {
			this.height = height;
			this.weight = weight;
		}

		public static Player create(Integer height, Integer weight) {
			return new Player(height, weight);
		}

		public Integer getHeight() {
			return height;
		}

		public Integer getWeight() {
			return weight;
		}

		@Override
		public String toString() {
			return "Player{" +
				"height=" + height +
				", weight=" + weight +
				'}';
		}
	}
}
