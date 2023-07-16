package hackerrank;

import java.util.Scanner;

public class PentagonalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] pentagonalNumbers = getPentagonalNumbers(input);

        for (int nums : pentagonalNumbers) {
            System.out.println(nums);
        }

    }


    public static int[] getPentagonalNumbers(int input) {
        int[] numbers = new int[input];

        for (int i = 1; i <= input; i++) {
            int b = (int) (3 * (Math.pow(i, 2)) - i) / 2;
            numbers[i - 1] = b;
        }
        return numbers;
    }
}
