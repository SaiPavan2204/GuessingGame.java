import java.util.Scanner;

public class  Guessing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secretNumber = 45;
        int guess = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");

        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");

            if (sc.hasNextInt()) {
                guess = sc.nextInt();

                if (guess > secretNumber)
                    System.out.println("Too High!");
                else if (guess < secretNumber)
                    System.out.println("Too Low!");
                else
                    System.out.println("Correct! You guessed it.");
            } 
            else {
                System.out.println("Please enter numbers only.");
                sc.next();
            }
        }

        sc.close();
    }
}
