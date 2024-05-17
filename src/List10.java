public class List10 {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 86, 34, 2, 3, 4, 7, 33, 44, 66, 88, 34, 32, 11, 22};

        // Print the original list
        System.out.println("Original list:");
        printArray(a);

        // Sort the list using Bubble Sort
        bubbleSort(a);

        // Print the sorted list
        System.out.println("Sorted list:");
        printArray(a);
    }

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) break;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
