/*
 * get three sides of a triangle from user and check if that is a valid triangle
 */
import java.util.Scanner;

public class conditional7 {
    

    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Enter the first side of the triangle:");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the second side of the triangle:");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the third side of the triangle:");
        double side3 = scanner.nextDouble();


        if (isValidTriangle(side1, side2, side3)) {
            System.out.println("The sides form a valid triangle.");
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }

        scanner.close();
    }
}

