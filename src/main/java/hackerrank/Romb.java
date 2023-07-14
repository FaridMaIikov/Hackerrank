package hackerrank;

import java.util.Scanner;

public class Romb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDiamondPattern(n);
    }

    public static void printDiamondPattern(int n) {

        for (int i = 1; i <= n; i++) {
            printRow(n, i);
        }


        for (int i = n - 1; i >= 1; i--) {
            printRow(n, i);
        }
    }

    public static void printRow(int n, int row) {
        for (int i = 1; i <= n - row; i++) {
            System.out.print(" ");
        }

        for (int i = 1; i <= 2 * row - 1; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
