/* 
 * ask user to enter distance in km and convert it to miles and print the output
*/
import java.util.Scanner;
public class Basic8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance: ");
        double distance = scanner.nextDouble();
        System.out.print("Enter the hours: ");
        double hours = scanner.nextDouble();
        double speed = distance / hours;
        System.out.println("Your speed is " + speed);
        scanner.close();
    }
}

