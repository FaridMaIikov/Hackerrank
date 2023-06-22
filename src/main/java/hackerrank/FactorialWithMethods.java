package hackerrank;

import java.util.Scanner;

public class FactorialWithMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input= sc.nextInt();
        int factorial=findFactorial(7);
        System.out.println(factorial);
    }

    public static int findFactorial(int num){
        int sum=1;
        for (int i = 0; i <=num; i++) {
            sum*=i;
        }
        return sum;
    }
}
