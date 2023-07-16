package hackerrank;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println((a.concat(b).length()));



        int result1 = 0;

        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            char char1=a.charAt(i);
            char char2=b.charAt(i);
            if ( char1< char2) {
                result1 = -1;
                break;
            } else if (a.charAt(i) > b.charAt(i)) {
                result1 = 1;
                break;
            }
        }

        if (result1 > 0) {
            System.out.println("Yes");
        } else System.out.println("No");


        String c = (a.concat(" " + b));
        String[] words = c.split(" ");

        StringBuilder word1 = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                String firsletter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1);
                word1.append(firsletter).append(restOfWord).append(" ");
            }
        }
        String result = word1.toString().trim();
        System.out.println(result);



    }
}
