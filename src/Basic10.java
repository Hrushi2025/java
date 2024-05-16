/* 
 * ask user to enter two numbers and print square of the two numbers
*/
import java.util.Scanner;

    public class Basic10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
    
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
    
            double square1 = num1 * num1;
            double square2 = num2 * num2;
    
            System.out.println("Square of the first number: " + square1);
            System.out.println("Square of the second number: " + square2);
            scanner.close();
        }
    }
    
    

