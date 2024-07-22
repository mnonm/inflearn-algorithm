package org.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class FindCow {
	public int solution(int s, int e) {
		int target = e - s;

		if (target > 0) {
			int plusCnt = target / 5 + target % 5;
			int cnt = target / 5 + 1;
			int minusCnt = cnt * 5 - target + cnt;
			return Math.min(minusCnt, plusCnt);
		}

		return target * (-1);
	}

	public int solution2(int s, int e) {
		return bfs(s, e);
	}

	private int bfs(int s, int e) {
		Queue<Integer> q = new LinkedList<>();
		int[] distance = {1, -1, 5};
		int[] check = new int[10001];

		q.add(s);
		check[s] = 1;
		int l = 0;
		while (!q.isEmpty()) {
			int size = q.size();
			l++;
			for (int i = 0; i < size; i++) {

				int x = q.poll();

				for (int j = 0; j < 3; j++) {
					int nx = x;
					nx += distance[j];

					if (nx == e) {
						return l;
					}

					if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
						q.offer(nx);
						check[nx] = 1;
					}
				}
			}
		}
		return 0;
	}
}
