package hackerrank;

import java.math.BigDecimal;
import java.util.Scanner;

public class FactorialWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long start = System.currentTimeMillis();
        BigDecimal f = factorial(n);
        long end = System.currentTimeMillis();
        System.out.println("Time " + (double) (end - start) / 1000);
        System.out.println(f);
    }

    public static BigDecimal factorial(long n) {
        if (n == 0) {
            return BigDecimal.ONE;
        } else {
            BigDecimal result = BigDecimal.valueOf(n);
            return result.multiply(factorial(n - 1));
        }
    }
}