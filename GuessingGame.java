import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(100) + 1; 
        int guess;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");

        while (true) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > secretNumber) {
                System.out.println("Too High! Try again.");
            }
            else if (guess < secretNumber) {
                System.out.println("Too Low! Try again.");
            }
            else {
                System.out.println("Correct! You guessed the number.");
                break;
            }
        }

        sc.close();
    }
}