import java.util.Scanner;

public class Assign1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Multiplication Table:");
        System.out.print("Enter the size of the multiplication table (1-20): ");

        int size = scanner.nextInt();

        // Validate the input size
        if (size < 1 || size > 20) {
            System.out.println("Invalid input. Size must be between 1 and 20.");
        } else {
            // Print the multiplication table
            System.out.println("Multiplication Table for size " + size + ":");
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    System.out.printf("%4d", i * j); // Adjust formatting for alignment
                }
                System.out.println(); // Move to the next row
            }
        }

        scanner.close();
    }
}

// Programmed By: Moncito Glenn N. Hernandez
// BS Information Technology 2 (SSC - Recoletos de Cavite)