/*
 * get three sides of a triangle from user and check if that is a valid triangle
 */

 import java.util.Scanner;

 public class conditional_8{
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the length of the first side: ");
         double side1 = scanner.nextDouble();
 
         System.out.print("Enter the length of the second side: ");
         double side2 = scanner.nextDouble();
 
         System.out.print("Enter the length of the third side: ");
         double side3 = scanner.nextDouble();
 
        
         if (isValidTriangle(side1, side2, side3)) {
             System.out.println("Yes, the given sides form a valid triangle.");
         } else {
             System.out.println("No, the given sides do not form a valid triangle.");
         }
 
         scanner.close();
     }
 
     public static boolean isValidTriangle(double side1, double side2, double side3) {
         
         return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
     }
 }
 