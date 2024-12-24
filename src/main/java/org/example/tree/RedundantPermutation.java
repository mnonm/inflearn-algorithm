package org.example.tree;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 중복순열
 * n까지 숫자중 중복을 허용하여 m개를 뽑았을 때 모든 케이스
 */
public class RedundantPermutation {
    private int n;
    private int m;
    private int dy[];

    public void solution(int n, int m) {
        this.n = n;
        this.m = m;
        this.dy = new int[m];

        dfs(0);
    }

    private void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(dy[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            dy[depth] = i;
            dfs(depth + 1);
        }
    }

    public static void main(String[] args) {
        RedundantPermutation rp = new RedundantPermutation();
        rp.solution(3, 2);
    }
}
