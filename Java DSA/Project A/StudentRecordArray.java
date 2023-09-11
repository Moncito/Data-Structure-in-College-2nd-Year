import java.util.Scanner;

public class StudentRecordArray {

    public static void main(String[] rgs) {

        Scanner scanner = new Scanner(System.in);
        // Declaring Variables

        int maxSize = 100;
        String[] names = new String[maxSize];
        int[] ages = new int[maxSize];
        double[] grades = new double[maxSize];
        int count = 0;

        // While Looping for repetition

        while (true) {

            System.out.println("1. Add Student Record:");
            System.out.println("2. Display Student:");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                if (count <= maxSize) {
                    System.out.println("Enter Student Name:(ex. Juan_Dela_Cruz)");
                    names[count] = scanner.next();

                    System.out.println("Enter Student Age:");
                    ages[count] = Integer.parseInt(scanner.next());

                    System.out.println("Enter Student Grade:");
                    grades[count] = Double.parseDouble(scanner.next());

                    count++;

                    System.out.println("Record Encoded Successfully");
                } else {
                    System.out.println("Maximum Limit Reached");
                }
            }

            else if (choice == 2) {
                System.out.println("Students Record: ");
                for (int i = 0; i < count; i++) {
                    System.out.println("Names: " + names[i] + " Age: " + ages[i] + " Grade: " + grades[i]);
                }
            } else if (choice == 3) {
                System.out.println("Exiting... You've been exit the program");

            }
        }
    }
}

// Developed By: Moncito Glenn N. Hernandez & Jean Paula Valencia
// BS Information Technology 2 (SSC - Recoletos de Cavite)