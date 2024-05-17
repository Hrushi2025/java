import java.util.Scanner;

public class conditional_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        String fullName = name + " " + surname;

        if (name.toLowerCase().startsWith("b")) {
            System.out.println("Name and surname in lower case: " + fullName.toLowerCase());
        } else {
            
            String titleCaseName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            System.out.println("Name in title case and surname in lower case: " + titleCaseName + " " + surname.toLowerCase());
        }

        scanner.close();
    }
}
