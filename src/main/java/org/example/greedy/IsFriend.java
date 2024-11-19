package org.example.greedy;

import java.util.Scanner;

/**
 * Union & Find 알고리즘
 */
public class IsFriend {

    static int[] unf;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfStudent = in.nextInt();
        int numOfFriendPair = in.nextInt();

        unf = new int[numOfStudent + 1];
        for (int i = 1; i <= numOfStudent; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < numOfFriendPair; i++) {
            union(in.nextInt(), in.nextInt());
        }

        int a = in.nextInt();
        int b = in.nextInt();

        String result = find(a) == find(b) ? "YES" : "NO";
        System.out.println(result);
    }

    static void union(int a, int b) {
        int findA = find(a);
        int findB = find(b);

        if (findA != findB) {
            unf[findA] = findB;
        }
    }

    static int find(int v) {
        if (unf[v] == v) {
            return v;
        } else {
            return unf[v] = find(unf[v]);
        }
    }
}
