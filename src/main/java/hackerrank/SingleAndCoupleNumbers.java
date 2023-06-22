package hackerrank;

import java.util.Scanner;

public class SingleAndCoupleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        getCoupleNumber(num);
    }

    public static void getCoupleNumber(String num) {
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (ch % 2 != 0) {
                System.out.println("False");
                break;
            }
        }
    }
}
