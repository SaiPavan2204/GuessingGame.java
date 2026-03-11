import java.util.Scanner;

public class FactorialRecursion {

    // Recursive method
    public static long factorial(int n) {

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Factorial Calculator (Recursion) ===");
        System.out.print("Enter a number: ");

        int number = sc.nextInt();

        long result = factorial(number);

        if(result != -1)
        {
            System.out.println("Factorial of " + number + " is: " + result);
        }

        sc.close();
    }
}