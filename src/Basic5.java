/* 
ask user to enter base and height of a triangle and calulate area of the triangle and print the same
*/
import java.util.Scanner;

public class Basic5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base of the triangle
        System.out.print("Enter the base of the triangle: ");
        double B = scanner.nextDouble();

        // Input height of the triangle
        System.out.print("Enter the height of the triangle: ");
        double H = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = 0.5 * B * H;

        // Print the area of the triangle
        System.out.println("Area of the triangle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
