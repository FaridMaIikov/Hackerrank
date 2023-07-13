package hackerrank;

import java.util.Scanner;

public class FactorialWithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long start = System.currentTimeMillis();
        long factorial=findFactorial(n);
        long end = System.currentTimeMillis();
        System.out.println("Time " + (double) (end - start) / 1000);
        System.out.println(factorial);
    }

    public static long findFactorial(long num){
        int sum=1;
        for (int i = 1; i <=num; i++) {
            sum*=i;
        }
        return sum;
    }
}
