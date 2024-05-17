/*
ask user to enter 10 numbers store them in list and print list,
 count the number of times 10 is present in the list and
 print the result
 */
import java.util.ArrayList;
import java.util.Scanner;

public class List2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

// Prompt the user to enter 10 numbers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

// Print the list
        System.out.println("The list of numbers entered:");
        System.out.println(numbers);

// Count the number of times 10 is present in the list
        int count = 0;
        for (int num : numbers) {
            if (num == 10) {
                count++;
            }
        }

// Print the count
        System.out.println("The number 10 appears " + count + " times in the list.");
    }
}
