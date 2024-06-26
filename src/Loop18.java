/*
get a number from user and check if the number is perfect square.
 */
import java.util.Scanner;

public class Loop18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
        
        scanner.close();
    }
    
    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false; 
        }
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt == num);
    }
}

