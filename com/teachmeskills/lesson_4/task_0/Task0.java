package com.teachmeskills.lesson_4.task_0;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Create a three-dimensional array of integers.
 * Using loops "go through" the entire array and increase each element by the specified number.
 * Let the number by which each element will be increased is set from the console.
 */

public class Task0 {
    public static void main(String[] args) {
        System.out.print("Enter the number to increase: ");
        int increaseValue = enterNumber();
        int[][][] threeDimensionalArray = new int[5][4][3];
        fillArray(threeDimensionalArray);
        System.out.println("Array before increasing:");
        printArray(threeDimensionalArray);
        System.out.printf("Array after increasing by %d:\n", increaseValue);
        increaseArray(threeDimensionalArray, increaseValue);
        printArray(threeDimensionalArray);
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void fillArray(int[][][] array) {
        Random generator = new Random();
        for (int row = 0; row < array.length; row++) {
            for (int plane = 0; plane < array[row].length; plane++) {
                for (int column = 0; column < array[row][plane].length; column++) {
                    array[row][plane][column] = generator.nextInt(100) + 100;
                }
            }
        }
    }

    private static void printArray(int[][][] threeDimensionalArray) {
        for (int[][] row : threeDimensionalArray) {
            for (int[] plane : row) {
                System.out.printf("%20s", Arrays.toString(plane));
            }
            System.out.println();
        }
    }

    private static void increaseArray(int[][][] array, int increaseValue) {
        for (int row = 0; row < array.length; row++) {
            for (int plane = 0; plane < array[row].length; plane++) {
                for (int column = 0; column < array[row][plane].length; column++) {
                    array[row][plane][column] += increaseValue;
                }
            }
        }
    }
}