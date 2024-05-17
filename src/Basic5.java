/* 
ask user to enter base and height of a triangle and calulate area of the triangle and print the same
*/
import java.util.Scanner;

public class Basic5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double B = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double H = scanner.nextDouble();

        double area = 0.5 * B * H;

        System.out.println("Area of the triangle is: " + area);
        
        scanner.close();
    }
}
