package com.teachmeskills.lesson_4.task_1;

import java.util.Arrays;

/**
 * Checkerboard.
 * Create a program for coloring a checkerboard using a loop.
 * Create a two-dimensional array of 8x8 Strings.
 * Use loops to set the loop elements to B (Black) or W (White).
 */

public class Task1 {
    private static final String BLACK = "B";
    private static final String WHITE = "W";

    public static void main(String[] args) {
        String[][] checkerboard = createCheckerboard();
        printCheckerboard(checkerboard);
    }

    private static String[][] createCheckerboard() {
        String[][] checkerboard = new String[8][8];
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                checkerboard[row][column] = isEven(row) == isEven(column) ? WHITE : BLACK;
            }
        }
        return checkerboard;
    }

    private static boolean isEven(int value) {
        return value % 2 == 0;
    }

    private static void printCheckerboard(String[][] checkerboard) {
        for (String[] row : checkerboard) {
            System.out.println(Arrays.toString(row));
        }
    }
}