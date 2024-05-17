/*
 * Ask user to enter 2 lists of 5 elements each (user should enter as comma separated string),
 *  generate lists from the strings and check if two lists entered by user are same
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class List7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the first list of 5 elements separated by commas:");
        String input1 = scanner.nextLine();

        System.out.println("Enter the second list of 5 elements separated by commas:");
        String input2 = scanner.nextLine();

        ArrayList<Integer> list1 = generateList(input1);
        ArrayList<Integer> list2 = generateList(input2);

        boolean areEqual = checkEquality(list1, list2);

        if (areEqual) {
            System.out.println("The two lists entered by the user are the same.");
        } else {
            System.out.println("The two lists entered by the user are not the same.");
        }
    }

    public static ArrayList<Integer> generateList(String input) {
        String[] elements = input.split(",");
        ArrayList<Integer> list = new ArrayList<>();
        for (String element : elements) {
            list.add(Integer.parseInt(element.trim()));
        }
        return list;
    }


    public static boolean checkEquality(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        if (list1.size() != list2.size()) {
            return false;
        }
        Object[] arr1 = list1.toArray();
        Object[] arr2 = list2.toArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}

