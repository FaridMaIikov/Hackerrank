package hackerrank;

import java.util.Scanner;

public class MethodOfSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt();


        if (start > word.length() || end > word.length()) System.out.println("Invalid index!");
        else if (word.length() > 0) {
            String restOfWord = word.substring(start, end);
            System.out.println(restOfWord);
        } else System.out.println("Enter word again!");
    }
}
