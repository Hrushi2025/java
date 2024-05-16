/*
 * get number from user and check if number is 
 * odd or even, multiply number by 2 is number is even and 
 * calculate square of the number if number is odd
 */

    import java.util.Scanner;

public class conditional_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is odd or even
        if (number % 2 == 0) {
            // If the number is even, multiply it by 2
            int result = number * 2;
            System.out.println("The number is even. Twice the number is: " + result);
        } else {
            // If the number is odd, calculate its square
            int result = number * number;
            System.out.println("The number is odd. The square of the number is: " + result);
        }

        scanner.close();
    }
}

