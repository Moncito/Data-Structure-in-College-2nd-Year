import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        // Initialize an array to store the elements
        int[] arr = new int[arraySize];

        // Get the elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Print the elements in reverse order
        System.out.println("Elements in reverse order:");
        for (int i = arraySize - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        scanner.close();
    }
}

// Programmed By: Moncito Glenn N. Hernandez
// BS Information Technology 2 (SSC - Recoletos de Cavite)