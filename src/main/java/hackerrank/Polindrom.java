package hackerrank;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word= sc.nextLine();
        String reversed="";

        for (int i = word.length()-1; i >=0 ; i--) {
            if(word.length()>0){
                reversed+=word.charAt(i);
            }
        }
        System.out.println(word.equals(reversed)?word+"-is polindrom":word+"-isnt polindrom");
        //equalsIgnoreCase istifade ede bilerik
    }
}
