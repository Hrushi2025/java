/*
 * get three sides of a triangle from user and check if the traingle is right angle triangle.
 */
import java.util.Scanner;

public class conditional_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        if (isRightAngleTriangle(side1, side2, side3)) {
            System.out.println("The triangle is a right-angle triangle.");
        } else {
            System.out.println("The triangle is not a right-angle triangle.");
        }
    }

    /**
     *
     * @param a 
     * @param b 
     * @param c 
     * @return 
     */
    public static boolean isRightAngleTriangle(double a, double b, double c) {

 


