package hackerrank;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        System.out.println("Welcome to game!");
        System.out.print("Enter name:");
        String name = sc.nextLine();
        System.out.println("Let's start the game " + name);

        while (true) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.print("Enter between 0 and 100:");
            int number = sc.nextInt();

            if (number == randomNumber) {
                System.out.println("Congratulations, you guessed right " + name + "! Random number is-" + randomNumber);
                break;
            }
            if (number > 100 || number < 0) {
                System.out.println("Enter between 0 and 100! Random number is-" + randomNumber);
            } else if (number > randomNumber) {
                System.out.println("Your number is big,please try again! Random number is-" + randomNumber);
            } else System.out.println("Your number is small,please try again! Random number is-" + randomNumber);

        }


    }
}
