package com.toptal.javareview.techinterview;

public class MooreMine {

    /**
     * You are given a NxM matrix. Every element in the matrix represents a position on a minesweeper game board.
     * An element can either be "O", meaning that it's empty, or "X", meaning that the position contains a mine.
     *
     * Your task is to devise a function that, given the input matrix defined above,
     * prints a transformed matrix in which every empty cell is replaced by the number of mines in the Moore neighborhood of that specific cell.
     * Your function should print to the console and the print output should be formatted so that each row in the matrix represents a single line.
     *
     * For example:
     *
     * X O O      X 1 0
     * O O O  ->  3 3 1
     * X X O      X X 1
     *
     *
     * The Moore neighborhood is defined by the eight cells surrounding the cell, the four directly next to it and four diagonal to it.
     *
     * The input is a an array of strings, with each element representing a row in the matrix.
     *
     * @param board
     * @return
     */
    String[] countMines(String[] board) {
        int N = board[0].length();
        int M = board.length;

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (board[i].charAt(j) == '0') {
                    int mines = 0;

                    //up
                    if (i>0) {
                        if (board[i-1].charAt(j) == 'x') mines++;
                        if (j>0 && board[i-1].charAt(j-1) == 'x') mines++;
                        if (j<M && board[i-1].charAt(j+1) == 'x') mines++;
                    }
                    //down
                    if (i<M) {
                        if (board[i+1].charAt(j) == 'x') mines++;
                        if (j>0 && board[i+1].charAt(j-1) == 'x') mines++;
                        if (j<M && board[i+1].charAt(j+1) == 'x') mines++;
                    }

                    //left
                    if (j>0 && board[i].charAt(j+1) == 'x') mines++;

                    //right
                    if (j<M && board[i].charAt(j-1) == 'x') mines++;

                    board[i] = setCharAt(board[i], j, mines);
                }
            }
        }

        return board;
    }

    private String setCharAt(String s, int index, int newChar) {

        StringBuilder builder = new StringBuilder(s);
        //builder.setCharAt(index, newChar);

        return s;
    }
}
