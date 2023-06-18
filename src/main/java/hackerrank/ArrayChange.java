package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(myArray));

        while (true) {
            System.out.print("Enter number 1-4 and exit:");
            sc.nextLine();
            String userInput = sc.nextLine();

            if (userInput.equals("exit")) {
                System.out.println("Program end.");
                break;
            }


            String[] parts = userInput.split("-");
            if (parts.length != 2) {
                System.out.println("Invalid input format. Please try again.");
                continue;
            }

            int index = Integer.parseInt(parts[0]);
            int element = Integer.parseInt(parts[1]);

            if (index < 0 || index > myArray.length) {
                System.out.println("Invalid index. Please try again.");
                continue;
            }

            int[] newArray = new int[myArray.length + 1];

            System.arraycopy(myArray, 0, newArray, 0, index);
            newArray[index] = element;
            System.arraycopy(myArray, index, newArray, index + 1, myArray.length - index);
            myArray = newArray;

            System.out.println(Arrays.toString(myArray));


        }
    }
}
