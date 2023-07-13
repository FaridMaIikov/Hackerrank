package hackerrank;

import java.util.Scanner;

public class FactorialWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long start = System.currentTimeMillis();
        long f = factorial(n);
        long end = System.currentTimeMillis();
        System.out.println("Time " + (double) (end - start) / 1000);
        System.out.println(f);
    }

    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        } else return (n * factorial(n - 1));
    }
}
