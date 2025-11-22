package excercise_3;
import java.util.Scanner;
import java.util.Arrays;

public class Excercise_3 {

    public static boolean isSortedIterative(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedRecursive(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }
        return isSortedRecursive(arr, 0);
    }

    private static boolean isSortedRecursive(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSortedRecursive(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Excercise 3: Array Sort Checker ---");
        

        System.out.print("Enter all integers separated by spaces: ");
        

        String line = scanner.nextLine();
        scanner.close();
        

        String[] parts = line.trim().split("\\s+");
        

        if (parts.length == 1 && parts[0].isEmpty()) {
            System.out.println("Input Array: []");
            System.out.println("Sorted"); // Empty array is considered sorted
            return;
        }

        int[] inputArray;
        try {
            inputArray = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                inputArray[i] = Integer.parseInt(parts[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter only integers separated by spaces.");
            return;
        }
        
        System.out.println("\nInput Array: " + Arrays.toString(inputArray));


        boolean isSorted = isSortedIterative(inputArray);
        
        System.out.println(isSorted ? "Sorted" : "Not Sorted");
        
        System.out.println("\n(Recursive Check: " + (isSortedRecursive(inputArray) ? "Sorted" : "Not Sorted") + ")");
    }
}