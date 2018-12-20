package com.toptal.javareview.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Solution1Test {

    @Test
    void shouldReplaceLetters() {

        Solution1 solution = new Solution1();
        String actual = solution.solution("AxxAABBCC");

        assertEquals("Axx", actual);
    }
}
