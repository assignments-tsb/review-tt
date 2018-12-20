package com.toptal.javareview.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Solution2Test {

    @Test
    void shouldWork() {

        String[] T = new String[5];
        String[] R = new String[5];

        T[0] = "test1a";    R[0] = "Wrong answer";
        T[2] = "test1b";    R[2] = "Runtime error";
        T[3] = "test1c";    R[3] = "OK";
        T[1] = "test2";     R[1] = "OK";
        T[4] = "test3";     R[4] = "Time limit exceeded";

        Solution2 solution2 = new Solution2();
        int score = solution2.solution(T, R);

        assertEquals(33, score);
    }
}
