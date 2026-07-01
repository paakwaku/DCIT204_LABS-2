import java.util.Scanner;

/**
 * PairSum.java
 * DCIT 204 - Lab 2
 *
 * This program searches an array (entered interactively by the user)
 * for a unique pair of numbers whose sum equals a user-specified target,
 * using the Brute Force (Nested Loop) algorithm.
 *
 * Time Complexity: O(n^2) - because every element is compared against
 * every other element using two nested loops.
 */
public class PairSum {

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

        // Step 4: Get the target sum
        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        // Step 5: Brute Force (Nested Loop) Pair Search
        boolean found = false;

        for (int i = 0; i < numbers.length && !found; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    // Step 6: Display the result
                    System.out.println("\n----- RESULT -----");
                    System.out.println("Pair Found!");
                    System.out.println("Index 1 : " + i + " -> Value: " + numbers[i]);
                    System.out.println("Index 2 : " + j + " -> Value: " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + target);
                    System.out.println("------------------");
                    found = true;
                    break;
                }
            }
        }

        // Step 7: Handle the case where no pair is found
        if (!found) {
            System.out.println("\nNo pair of numbers in the array sums to " + target + ".");
        }

        scanner.close();
    }
}
