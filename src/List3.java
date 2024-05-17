import java.util.ArrayList;
import java.util.Scanner;

public class List3 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(3);
        a.add(34);
        a.add(45);
        a.add(88);
        a.add(23);
        a.add(45);
        a.add(63);
        a.add(3);
        a.add(4);
        a.add(69);
        a.add(99);

// Getting two numbers from the user and storing them in a second list
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> secondList = new ArrayList<>();
        System.out.println("Enter two numbers:");
        for (int i = 0; i < 2; i++) {
            int num = scanner.nextInt();
            secondList.add(num);
        }

// Check if second list is a subset of the first list
        boolean isSubset = true;
        for (int num : secondList) {
            if (!a.contains(num)) {
                isSubset = false;
                break;
            }
        }

// Print the output
        if (isSubset) {
            System.out.println("The second list is a subset of the first list.");
        } else {
            System.out.println("The second list is not a subset of the first list.");
        }
    }
}

