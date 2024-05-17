import java.util.Scanner;

public class Loop6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the digit to check: ");
        int digit = scanner.nextInt();
        
        String numberStr = String.valueOf(number);
        char digitChar = String.valueOf(digit).charAt(0);
        
        int count = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            if (numberStr.charAt(i) == digitChar) {
                count++;
            }
        }
        
        System.out.println("The digit " + digit + " occurs " + count + " times in the number " + number + ".");
        
        scanner.close();
    }
}

