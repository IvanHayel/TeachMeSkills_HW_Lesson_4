package com.teachmeskills.lesson_4.task_3;

import java.util.Arrays;
import java.util.Random;

/**
 * Create a two-dimensional array of integers.
 * Print the sum of matrix elements to the console.
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Matrix:");
        int[][] matrix = createRandomMatrix(3, 4);
        printMatrix(matrix);
        int sumOfMatrixElements = getSumOfMatrixElements(matrix);
        System.out.printf("Sum of matrix elements = %d.\n", sumOfMatrixElements);
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

    private static int getSumOfMatrixElements(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int item : row) {
                sum += item;
            }
        }
        return sum;
    }
}