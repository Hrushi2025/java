/*
 * get a number from user  - say 'n' and print every alternate number between 0 and n
 */
import java.util.Scanner;

public class Loop3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Print every alternate number between 0 and n
        System.out.println("Every alternate number between 0 and " + n + ":");
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
