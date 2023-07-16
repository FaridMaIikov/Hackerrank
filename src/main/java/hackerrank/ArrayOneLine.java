package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

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
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                array[i][j]= sc.nextInt();
            }
        }
        printMatrix(array);
    }
}
