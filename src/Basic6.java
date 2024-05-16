/* 
ask user to enter radius and length of a cylinder and calculate volume of the cylinder and print the same.
*/
import java.util.Scanner;
public class Basic6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Volume of cylinder");
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();
    
            double volume = 3.14 * radius * radius * length;
            System.out.println("Volume of cylinder: " + volume);
    
    
        scanner.close();
        }
    }
    
   

