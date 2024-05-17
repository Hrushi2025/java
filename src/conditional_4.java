/*
 * ask user to enter number if number is in 1s then print one, 
 * if number is in 10s then print ten if number is in 100s then print hundred 
 * if number is in 1000 print thousand. (try to implement this using if-elif-else
 */

    import java.util.Scanner;

public class conditional_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 9) {
            System.out.println("The number is in ones place: one");
        } else if (number >= 10 && number <= 99) {
            System.out.println("The number is in tens place: ten");
        } else if (number >= 100 && number <= 999) {
            System.out.println("The number is in hundreds place: hundred");
        } else if (number >= 1000) {
            System.out.println("The number is in thousands place: thousand");
        } else {
            System.out.println("Invalid number.");
        }

        scanner.close();
    }
}

    

