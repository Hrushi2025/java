/*
 * use same hard coded list as given in assignment 3, find total of all numbers in the list
 */
import java.util.ArrayList;

public class List4 {
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

// Calculate the total sum of all numbers in the list
        int total = 0;
        for (int num : a) {
            total += num;
        }

// Print the total sum
        System.out.println("The total sum of all numbers in the list is: " + total);
    }
}

