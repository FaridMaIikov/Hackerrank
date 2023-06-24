package hackerrank;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        getMiddleCharacter(word);

    }

    public static void getMiddleCharacter(String str) {
        int length = str.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            char middleChar = str.charAt(middle - 1);
            System.out.println("Middle character: " + middleChar);
        } else {
            char middleChar1 = str.charAt(middle);
            char middleChar2 = str.charAt(middle + 1);
            System.out.println("Middle character: " + middleChar1 + middleChar2);
        }
    }
}
