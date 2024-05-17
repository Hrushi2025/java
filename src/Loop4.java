import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMatchsticks = 21;
        
        System.out.println("Welcome to the Matchstick Game!");
        System.out.println("There are 21 matchsticks.");
        System.out.println("Each player can pick 1 to 4 matchsticks in their turn.");
        System.out.println("The player forced to pick the last matchstick loses.");
        
        boolean userTurn = true;

        while (totalMatchsticks > 0) {
            if (userTurn) {
                System.out.print("Your turn. Pick 1-4 matchsticks: ");
                int userPick = scanner.nextInt();

                while (userPick < 1 || userPick > 4 || userPick > totalMatchsticks) {
                    System.out.print("Invalid input. Pick 1-4 matchsticks: ");
                    userPick = scanner.nextInt();
                }

                totalMatchsticks -= userPick;
                System.out.println("You picked " + userPick + " matchsticks. " + totalMatchsticks + " matchsticks remaining.");

                if (totalMatchsticks == 0) {
                    System.out.println("You picked the last matchstick. You lose!");
                    break;
                }
                
                userTurn = false;
            } else {
                int computerPick = (totalMatchsticks % 5 == 0) ? 1 : (totalMatchsticks % 5);
                
                if (computerPick == 0 || computerPick > totalMatchsticks) {
                    computerPick = 1;
                }

                totalMatchsticks -= computerPick;
                System.out.println("Computer picked " + computerPick + " matchsticks. " + totalMatchsticks + " matchsticks remaining.");

                if (totalMatchsticks == 0) {
                    System.out.println("Computer picked the last matchstick. Computer loses. You win!");
                    break;
                }

                userTurn = true;
            }
        }

        scanner.close();
    }
}

