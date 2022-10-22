package lv.tsi.exercise_5;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {

    public static void main(String[] args) {
        print(createRandomArray(3));
    }

    public static void print(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            System.out.println("  " + Arrays.toString(row));
        }

        System.out.println();

        System.out.println("Avg. per row:");
        for (int[] row : matrix) {
            System.out.println("  " + Arrays.toString(row) + ": " + average(row));
        }

        System.out.println();

        System.out.println("Avg. per col:");
        for (int i = 0; i < matrix.length; i++) {
            var col = new int[matrix.length];
            for (int j = 0; j < matrix.length; j++) {
                col[j] = matrix[j][i];
            }
            System.out.println("  " + Arrays.toString(col) + ": " + average(col));
        }
    }

    public static int[][] createRandomArray(int size) {
        var result = new int[size][size];
        var random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = random.nextInt(100);
            }
        }
        return result;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return (double)sum / array.length;
    }
}
