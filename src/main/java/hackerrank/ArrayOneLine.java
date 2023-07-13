package hackerrank;

import java.util.Arrays;

public class ArrayOneLine {
    public static void printMatrix(int[][] array) {
        int n = array.length;
        int[] elements = new int[n * n];

        for (int i = 0; i < n * n; i++) {
            elements[i] = array[i / n][i % n];
            System.out.print(elements[i]+" ");
        }


    }

    public static void main(String[] args) {
        int[][] array = {{1, 6, 3},
                          {4, 5, 6},
                          {7, 4, 9}};
        printMatrix(array);
    }
}
