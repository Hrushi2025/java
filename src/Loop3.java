
    import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pick a number between 0 and 100 and keep it in your mind.");
        System.out.println("I will try to guess it!");
        
        int low = 0;
        int high = 100;
        boolean guessed = false;
        
        while (!guessed) {
            int guess = (low + high) / 2;
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter 'h' if my guess is too high, 'l' if it is too low, or 'c' if it is correct: ");
            char response = scanner.next().charAt(0);
            
            switch (response) {
                case 'h':
                    high = guess - 1;
                    break;
                case 'l':
                    low = guess + 1;
                    break;
                case 'c':
                    System.out.println("Great! I guessed your number " + guess + " correctly.");
                    guessed = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
                    break;
            }
        }
        
        scanner.close();
    }
}

    

