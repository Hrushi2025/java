/*
 * get 10 numbers from user and print their tables
 */

import java.util.Scanner;

public class Loop25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Enter 10 numbers:");

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
