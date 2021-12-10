package com.teachmeskills.lesson_4.task_5;

import java.util.Arrays;
import java.util.Random;

/**
 * Create a two-dimensional array of integers.
 * Sort the elements in the rows of the two-dimensional array in ascending order.
 */

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Matrix:");
        int[][] matrix = createRandomMatrix(5, 5);
        printMatrix(matrix);
        System.out.println("Matrix with row elements sorted in ascending order:");
        sortRows(matrix);
        printMatrix(matrix);
    }

    private static int[][] createRandomMatrix(int numberOfRows, int numberOfColumns) {
        Random generator = new Random();
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < numberOfRows; row++) {
            for (int column = 0; column < numberOfColumns; column++) {
                matrix[row][column] = generator.nextInt(10);
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static void sortRows(int[][] matrix) {
        for (int[] row : matrix) {
            Arrays.sort(row);
        }
    }
}