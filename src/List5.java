
    
import java.util.Scanner;

public class List5 {
    public static void main(String[] args) {
// Prompt the user to enter a string
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = Scanner.nextLine();

// Prompt the user to enter a character
        System.out.println("Enter a character:");
        char targetChar = Scanner.next().charAt(0);

// Count the number of occurrences of the character in the string
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                count++;
            }
        }
// Print the number of occurrences
        System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");
    }
}

