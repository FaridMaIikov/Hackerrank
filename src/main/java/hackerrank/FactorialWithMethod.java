package hackerrank;

public class FactorialWithMethod {
    public static void main(String[] args) {
        int f=factorial(6);
        System.out.println(f);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else return (n * factorial(n - 1));
    }
}
