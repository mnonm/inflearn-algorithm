package org.example.graph;

public class PathSearch {

    // 1에서 5로 갈 수 있다면 graph[1][5] = 1
    int[][] graph;
    // start 지점에서 5를 방문했다면 isVisit[5] = 1
    int[] isVisit;

    int numOfVertex = 0;
    int target = 0;
    int result = 0;

    public int solution(int numOfVertex, int target, int[][] graph) {
        this.graph = graph;
        this.isVisit = new int[graph.length];
        this.isVisit[1] = 1;

        this.numOfVertex = numOfVertex;
        this.target = target;

        dfs(1);
        return result;
    }

    public void dfs(int v) {
        if (v == target) {
            result++;
        } else {
            for (int i = 1; i <= numOfVertex; i++) {
                if (graph[v][i] == 1 && isVisit[i] == 0) {
                    isVisit[i] = 1;
                    dfs(i);
                    isVisit[i] = 0;
                }
            }
        }
    }

}
