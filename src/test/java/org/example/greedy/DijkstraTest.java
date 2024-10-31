package org.example.greedy;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.example.greedy.Dijkstra.Edge;
import org.junit.jupiter.api.Test;

class DijkstraTest {
	private Dijkstra dijkstra = new Dijkstra();

	@Test
	void test1() {
		// given
		Integer vertexCnt = 6;
		Integer start = 1;
		List<List<Edge>> edges = new ArrayList<>();
		edges.add(List.of(
			Edge.create(2, 12),
			Edge.create(3, 4))
		);
		edges.add(List.of(
			Edge.create(1, 2),
			Edge.create(3, 5),
			Edge.create(5, 5))
		);
		edges.add(List.of(Edge.create(4, 5)));
		edges.add(List.of(
			Edge.create(2, 2),
			Edge.create(5, 5))
		);
		edges.add(List.of(Edge.create(4, 5)));

		// when
		int[] result = dijkstra.solution(vertexCnt, start, edges);

		// then
		assertThat(result).isEqualTo(new int[] {Integer.MAX_VALUE, 0, 11, 4, 9, 14, Integer.MAX_VALUE});
	}
}
