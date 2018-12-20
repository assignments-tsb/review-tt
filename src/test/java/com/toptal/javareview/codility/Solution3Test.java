package com.toptal.javareview.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Solution3Test {

    @Test
    void shouldComputeTheShortestPath() {

        int N = 10;
        Solution3 solution3 = new Solution3();

        String shortestPath = solution3.solution(N);

        assertEquals("RLLR", shortestPath);
    }
}
