package com.teachmeskills.lesson_4.task_2;

import java.util.Arrays;
import java.util.Random;

/**
 * Multiplying Two Matrices Create two 3x3 arrays of integers (two matrices).
 * Write a program to multiply two matrices.
 * first array: {{1,0,0,0}, {0,1,0,0}, {0,0,0,0}}
 * second array: {{1,2,3}, {1,1 , 1}, {0,0,0}, {2,1,0}}
 * Expected result: 1 2 3 1 1 1 0 0 0
 */

public class Task2 {
    public static void main(String[] args) {
        int[][] firstRandomMatrix = createRandomMatrix(3, 7);
        int[][] secondRandomMatrix = createRandomMatrix(7, 5);
        testMultiplyMatrices(firstRandomMatrix, secondRandomMatrix);

        int[][] firstMatrix = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] secondMatrix = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        testMultiplyMatrices(firstMatrix, secondMatrix);
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

    private static void testMultiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        System.out.println("First matrix:");
        printMatrix(firstMatrix);
        System.out.println("Second matrix:");
        printMatrix(secondMatrix);
        System.out.println("Matrix multiplication result:");
        try {
            int[][] matrix = multiplyMatrices(firstMatrix, secondMatrix);
            printMatrix(matrix);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int numberOfRows = firstMatrix.length;
        int numberOfColumns = secondMatrix[0].length;
        if (!isMatrixMultiplyPossible(firstMatrix[0].length, secondMatrix.length)) {
            throw new ArithmeticException("Matrix multiplication is not possible!");
        }
        int upperLimit = secondMatrix.length;
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < numberOfRows; row++) {
            for (int column = 0; column < numberOfColumns; column++) {
                for (int counter = 0; counter < upperLimit; counter++) {
                    matrix[row][column] += firstMatrix[row][counter] * secondMatrix[counter][column];
                }
            }
        }
        return matrix;
    }

    private static boolean isMatrixMultiplyPossible(int matrixColumnLength, int anotherMatrixRowLength) {
        return matrixColumnLength == anotherMatrixRowLength;
    }
}