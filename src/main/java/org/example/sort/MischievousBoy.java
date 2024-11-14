package org.example.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MischievousBoy {
    public List<Integer> solution(int[] heights) {
        int[] sortedHeights = Arrays.stream(heights)
            .sorted()
            .toArray();

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeights[i]) {
                result.add(i + 1);
                if (result.size() == 2) {
                    return result;
                }
            }
        }

        return result;
    }
}
