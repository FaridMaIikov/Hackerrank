package hackerrank;

import java.math.BigDecimal;
import java.util.Scanner;

public class FactorialWithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        long start = System.currentTimeMillis();
        BigDecimal factorial = findFactorial(n);
        long end = System.currentTimeMillis();
        System.out.println("Time " + (double) (end - start) / 1000);
        System.out.println(factorial);
    }

    public static BigDecimal findFactorial(Long num) {
        BigDecimal factorial = BigDecimal.ONE;
        for (long i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i));
        }
        return factorial;
    }
}