package org.example.greedy;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dijkstra {

	public int[] solution(Integer vertexCnt, Integer start, List<List<Edge>> edges) {
		// start에서 각 vertex까지 가는 최소 거리
		int[] distances = new int[vertexCnt + 1];
		// 최소 거리를 구하므로 최대 값으로 초기화
		Arrays.fill(distances, Integer.MAX_VALUE);
		// 시작점 ~ 시작점은 거리가 0
		distances[start] = 0;

		Queue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(Edge.create(start, 0));

		while (!pQ.isEmpty()) {
			Integer startVertex = pQ.poll().getVertex();
			// edges는 0부터 시작
			List<Edge> nextEdges = edges.get(startVertex - 1);
			for (Edge edge : nextEdges) {
				Integer nextVertex = edge.getVertex();

				// 다음 vertex까지 최소값보다 간선 가중치가 크면 비교할 필요가 없다
				if (distances[nextVertex] < edge.getWeight()) {
					continue;
				}

				// 다음 vertex까지 가는 가중치 + 시작점까지의 거리가 더 작으면 변경
				if (distances[nextVertex] > edge.getWeight() + distances[startVertex]) {
					distances[nextVertex] = edge.getWeight() + distances[startVertex];
					// 다음 정점까지의 최소 거리를 Queue에 넣어준다
					pQ.offer(Edge.create(nextVertex, distances[nextVertex]));
				}
			}
		}

		return distances;
	}

	public static class Edge implements Comparable<Edge> {
		private Integer vertex;
		private Integer weight;

		public Edge(Integer vertex, Integer weight) {
			this.vertex = vertex;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge o) {
			return this.weight - o.weight;
		}

		public static Edge create(Integer vertex, Integer weight) {
			return new Edge(vertex, weight);
		}

		public Integer getVertex() {
			return vertex;
		}

		public Integer getWeight() {
			return weight;
		}
	}
}
