import java.util.Scanner;

public class conditional_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter name and surname
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        // Concatenate name and surname
        String fullName = name + " " + surname;

        // Check if the name starts with 'b' and print accordingly
        if (name.toLowerCase().startsWith("b")) {
            System.out.println("Name and surname in lower case: " + fullName.toLowerCase());
        } else {
            // Convert the first character of the name to upper case (title case)
            String titleCaseName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            System.out.println("Name in title case and surname in lower case: " + titleCaseName + " " + surname.toLowerCase());
        }

        scanner.close();
    }
}
