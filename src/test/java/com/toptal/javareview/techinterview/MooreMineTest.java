package com.toptal.javareview.techinterview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MooreMineTest {

    @Test
    void shouldCountMines() {
        String[] board = new String[] {
                "xoo",
                "ooo",
                "xxo"
        };

        MooreMine mooreMine = new MooreMine();
        String[] results = mooreMine.countMines(board);


        assertEquals(results[0], "x10");
        assertEquals(results[1], "331");
        assertEquals(results[2], "xx1");
    }
}
