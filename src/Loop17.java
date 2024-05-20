/*
 * Get a number from user, write a program to 
 * calculate factorial of the number using for loop and while loop
 */
import java.util.Scanner;

public class Loop17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate factorial using for loop
        long factorialForLoop = calculateFactorialForLoop(number);
        System.out.println("Factorial of " + number + " using for loop is: " + factorialForLoop);

        // Calculate factorial using while loop
        long factorialWhileLoop = calculateFactorialWhileLoop(number);
        System.out.println("Factorial of " + number + " using while loop is: " + factorialWhileLoop);
    }

    /**
     * Calculates the factorial of a number using a for loop.
     *
     * @param n the number to calculate the factorial of
     * @return the factorial of the number
     */
    public static long calculateFactorialForLoop(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Calculates the factorial of a number using a while loop.
     *
     * @param n the number to calculate the factorial of
     * @return the factorial of the number
     */
    public static long calculateFactorialWhileLoop(int n) {
        long factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        return factorial;
    }
}

