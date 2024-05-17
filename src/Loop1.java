/*
 * get a list a = [2,3,4,55,33,4,55,343,66,77,88,99] and write 
 * a program to browse over this list and print previous number and 
 * current number
 */
    import java.util.Arrays;
import java.util.List;

public class Loop1{
    public static void main(String[] args) {
        // Define the list
        List<Integer> numbers = Arrays.asList(2, 3, 4, 55, 33, 4, 55, 343, 66, 77, 88, 99);

        // Iterate over the list and print the previous number and current number
        for (int i = 1; i < numbers.size(); i++) {
            int previousNumber = numbers.get(i - 1);
            int currentNumber = numbers.get(i);
            System.out.println("Previous number: " + previousNumber + ", Current number: " + currentNumber);
        }
    }
}

    

