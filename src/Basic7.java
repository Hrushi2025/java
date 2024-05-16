/* 
ask user to enter distance in km and convert it to miles and print the output
*/
import java.util.Scanner;

public class Basic7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = scanner.nextDouble();
        double miles = km * 0.621371;
        System.out.println(km + " kilometers are " + miles + " miles");
        scanner.close();
    }
}
