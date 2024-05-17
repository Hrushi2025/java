/*
 * ask user to enter a string and check if the string is a palindrome
 */
import java.util.Scanner;

public class List6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();


        boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str) {

        str = str.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

