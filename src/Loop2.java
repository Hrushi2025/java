/*
 * Get a number from user, write a program to calculate factorial of the number using for loop and while loop
 */
import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        // Prompt the user to enter a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Calculate factorial using a for loop
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the factorial
        System.out.println("Factorial of " + number + " using a for loop is: " + factorial);
    }
}

