
/*

 * Get a number from user and check if number is twin prime number
 */
import java.util.Scanner;

public class Loop6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isPrime(number) && (isPrime(number - 2) || isPrime(number + 2))) {
            System.out.println(number + " is a twin prime number.");
        } else {
            System.out.println(number + " is not a twin prime number.");
        }
        
        scanner.close();
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

