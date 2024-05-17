/*
 * get number from user and check if number is 
 * odd or even, multiply number by 2 is number is even and 
 * calculate square of the number if number is odd
 */

    import java.util.Scanner;

public class conditional_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {

            int result = number * 2;
            System.out.println("The number is even. Twice the number is: " + result);
        } else {
            int result = number * number;
            System.out.println("The number is odd. The square of the number is: " + result);
        }

        scanner.close();
    }
}

