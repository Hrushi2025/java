public class List1 {
    public static void main(String[] args) {
        int[] a = {12, 3, 34, 45, 88, 23, 45, 63, 3, 4, 69, 99};
        
// Initialize max with the first element of the array
        int max = a[0];
        
// Iterate through the array starting from the second element
        for (int i = 1; i < a.length; i++) {
// Compare each element with max, update max if the current element is greater
            if (a[i] > max) {
                max = a[i];
            }
        }
        
        System.out.println("The maximum value in the list is: " + max);
    }
}

