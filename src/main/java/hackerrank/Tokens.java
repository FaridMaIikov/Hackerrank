package hackerrank;

import java.util.Scanner;

public class Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        s=ignoreNonLetters(s);
        if(s.length()==0){
            System.out.println(0);
            return;
        }


        String[] words=s.split("[^a-zA-Z]+");

        System.out.println(words.length);

        for (String word : words) {
            System.out.println(word);
        }

        scan.close();
    }

    public static String ignoreNonLetters(String s1){
        int i;
        for ( i = 0; i < s1.length(); i++) {
            if(Character.isLetter(s1.charAt(i))){
                break;
            }
        }
        return s1.substring(i);
    }
}
