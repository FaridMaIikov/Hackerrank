package hackerrank;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int findVowels = getFindVowels(word);
        System.out.println(findVowels);

    }

    public static int getFindVowels(String word) {
        word = word.toLowerCase();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                count++;
            }
        }
        return count;
    }
}
