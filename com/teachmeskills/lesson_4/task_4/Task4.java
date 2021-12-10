package com.teachmeskills.lesson_4.task_4;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.min;

/**
 * Create a two-dimensional array.
 * Print the diagonals of the matrix to the console.
 */

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Matrix:");
        int[][] matrix = createRandomMatrix(5, 5);
        printMatrix(matrix);
        System.out.print("Elements of the main diagonal of the matrix: ");
        printMainDiagonalElements(matrix);
        System.out.print("Elements of the side diagonal of the matrix: ");
        printSideDiagonalElements(matrix);
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

    private static void printMainDiagonalElements(int[][] matrix) {
        int diagonalLength = min(matrix.length, matrix[0].length);
        for (int counter = 0; counter < diagonalLength; counter++) {
            System.out.print(matrix[counter][counter] + " ");
        }
        System.out.println();
    }

    private static void printSideDiagonalElements(int[][] matrix) {
        int diagonalLength = min(matrix.length, matrix[0].length);
        for (int counter = 0; counter < diagonalLength; counter++) {
            System.out.print(matrix[counter][diagonalLength - counter - 1] + " ");
        }
        System.out.println();
    }
}