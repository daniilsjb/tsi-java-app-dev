package lv.tsi.exercise_3;

import java.util.Arrays;
import java.util.Random;

class OneDimensionalArray {

    public static void main(String[] args) {
        var matrix = createRandomArray(3);

        System.out.println("Matrix:");
        for (double[] row : matrix) {
            System.out.println("  " + Arrays.toString(row));
        }

        System.out.println();

        System.out.println("Min: " + min(matrix));
        System.out.println("Max: " + max(matrix));
        System.out.println("Avg: " + average(matrix));
    }

    public static double[][] createRandomArray(int size) {
        var result = new double[size][size];
        var random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = random.nextDouble(100.0);
            }
        }
        return result;
    }

    public static double min(double[][] matrix) {
        double min = matrix[0][0];
        for (double[] row : matrix) {
            for (double number : row) {
                if (number < min) {
                    min = number;
                }
            }
        }
        return min;
    }

    public static double max(double[][] matrix) {
        double max = matrix[0][0];
        for (double[] row : matrix) {
            for (double number : row) {
                if (number > max) {
                    max = number;
                }
            }
        }
        return max;
    }

    public static double average(double[][] matrix) {
        double sum = 0.0;
        for (double[] row : matrix) {
            for (double number : row) {
                sum += number;
            }
        }
        return sum / (matrix.length * matrix.length);
    }
}
