/*
 * Given 21 Matchsticks and 2 users, A and B (computer and user respectively). 
 * Users can pick matchsticks not more than four at a time.
 *  The one who is forced to pick the last matchstick loses.
 */
    import java.util.Scanner;

public class Loop5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of matchsticks available
        int matchsticks = 21;

        // Main game loop
        while (matchsticks > 0) {
            // User's turn
            System.out.print("User's turn: ");
            int userChoice = getUserChoice(scanner);
            matchsticks -= userChoice;
            if (matchsticks <= 0) {
                System.out.println("User wins!");
                break;
            }

            // Computer's turn
            int computerChoice = getComputerChoice(matchsticks);
            System.out.println("Computer chooses " + computerChoice + " matchsticks.");
            matchsticks -= computerChoice;
            if (matchsticks <= 0) {
                System.out.println("Computer wins!");
                break;
            }
        }
    }

    // Method to get user's choice
    public static int getUserChoice(Scanner scanner) {
        int choice;
        do {
            System.out.print("Enter number of matchsticks to pick (1-4): ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 4);
        return choice;
    }

    // Method to get computer's choice
    public static int getComputerChoice(int matchsticks) {
        // The computer's strategy is to leave a multiple of 5 for the user
        // So if the remaining matchsticks modulo 5 is not zero, it will pick the remainder
        // Otherwise, it picks any number from 1 to 4
        int remainder = matchsticks % 5;
        return (remainder != 0) ? remainder : (int) (Math.random() * 4) + 1;
    }
}

    

