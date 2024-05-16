/*
 * ask user to enter three numbers, print a string as concatenated string 
 * (continaining three numbers separated by underscore) as output
 */
import java.util.Scanner;

    public class Basic9{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
    
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
    
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();

            String concatenatedString = num1 + "_" + num2 + "_" + num3;
            System.out.println("Concatenated string: " + concatenatedString);
            scanner.close();
        }
    }
    
    

