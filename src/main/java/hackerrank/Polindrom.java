package hackerrank;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word= sc.nextLine();
        StringBuilder reversed = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        System.out.println(word.contentEquals(reversed) ? word + "-is polindrom" : word + "-isnt polindrom");
    }
}
