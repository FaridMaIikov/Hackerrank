package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class ReversArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));


        reversArray(array);

    }

    public static void reversArray(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
            } else System.out.print(array[i] + ", ");

        }
        System.out.print("]");
    }
}
