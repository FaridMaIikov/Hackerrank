package hackerrank;

public class Loop3 {
    public static void main(String[] args) {

        for (int i = 1000; i < 10000; i++) {
            int firstTwoDigit = i / 100;
            int lastTwodigit = i % 100;
            if (firstTwoDigit == lastTwodigit) {
                System.out.println(i);
            }
        }
    }
}
