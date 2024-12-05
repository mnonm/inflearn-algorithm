package org.example.graph;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PathSearchTest {
    private PathSearch pathSearch = new PathSearch();

    @Test
    void test1() {
        // given
        int[][] graph = new int[6][6];
        graph[1][2] = 1;
        graph[1][3] = 1;
        graph[1][4] = 1;
        graph[2][1] = 1;
        graph[2][3] = 1;
        graph[2][5] = 1;
        graph[3][4] = 1;
        graph[4][2] = 1;
        graph[4][5] = 1;

        int numOfVertex = 5;
        int target = 5;

        // when
        int result = pathSearch.solution(numOfVertex, target, graph);

        // then
        assertThat(result).isEqualTo(6);
    }
}