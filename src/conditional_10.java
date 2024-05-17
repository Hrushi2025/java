/*
 * get a character from user and check if the character is number or vowel or consonent
 */
import java.util.Scanner;

public class conditional_10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println("The entered character is a number.");
        } else if (isVowel(ch)) {
            System.out.println("The entered character is a vowel.");
        } else {
            System.out.println("The entered character is a consonant.");
        }

        scanner.close();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
