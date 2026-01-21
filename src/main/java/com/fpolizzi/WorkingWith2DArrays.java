package com.fpolizzi;

import java.util.Arrays;

/**
 * Created by fpolizzi on 20.01.26
 */
public class WorkingWith2DArrays {
    /**
     * Populates and prints two char 2-dimensional arrays
     */
    static void main() {

        // define a 2-dimensional board (grid, table)
        char[][] board = new char[3][3];

        // populate the board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // define and initialize a second board in one go
        char[][] boardTwo = new char[][]{
                {'X', 'X', 'X'},
                {'X', 'O', 'X'},
                {'X', 'X', 'X'}
        };

        // set single fields with values
        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';

        // print both boards
        System.out.println("Board One:");
        System.out.println(Arrays.deepToString(board));

        System.out.println("Board Two:");
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
