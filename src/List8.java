/*
 * write a function to get maximum element of list and second highest element in a list 
 */
import java.util.ArrayList;

public class List8 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(3);
        myList.add(34);
        myList.add(45);
        myList.add(88);
        myList.add(23);
        myList.add(45);
        myList.add(63);
        myList.add(3);
        myList.add(4);
        myList.add(69);
        myList.add(99);

        int maxElement = getMaxElement(myList);
        System.out.println("Maximum element in the list: " + maxElement);

        int secondHighestElement = getSecondHighestElement(myList);
        System.out.println("Second highest element in the list: " + secondHighestElement);
    }

    public static int getMaxElement(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int getSecondHighestElement(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
