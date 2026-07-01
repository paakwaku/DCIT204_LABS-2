import java.util.Scanner;

/**
 * FindMax.java
 * DCIT 204 - Lab 2
 *
 * This program finds the maximum value in an array and the index
 * at which it occurs, using values entered interactively by the user.
 */
public class FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Step 2: Create the array
        int[] numbers = new int[size];

        // Step 3: Collect array elements from the user
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Step 4: Find the maximum value and its index (Linear Search)
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        // Step 5: Display the results
        System.out.println("\n----- RESULTS -----");
        System.out.println("Array Entered      : " + arrayToString(numbers));
        System.out.println("Maximum Value       : " + maxValue);
        System.out.println("Index of Max Value  : " + maxIndex);
        System.out.println("--------------------");

        scanner.close();
    }

    // Helper method to display the array in a readable format
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
