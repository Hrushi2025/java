/*
 * ask user to enter name, age and address and let user know if user can do voting
 */
import java.util.Scanner;

public class conditional_2 {
    

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter your address: ");
            String address = scanner.nextLine();
    
            if (age >= 18) {
                System.out.println("Congratulations, " + name + "! You are eligible to vote.");
            } else {
                System.out.println("Sorry, " + name + ". You are not eligible to vote yet.");
            }
    
            scanner.close();
        }
    }
    
    

