/*
 * ask user to enter number check if number is 0 or less than 0 or greater than 0
 */
    import java.util.Scanner;

public class  conditional_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("The number is zero.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is positive.");
        }

        scanner.close();
    }
}


