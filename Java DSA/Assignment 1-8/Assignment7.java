import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        double grade;

        System.out.println("Enter Student Name: ");
        name = scanner.nextLine();

        System.out.println("Enter Grade: ");
        grade = scanner.nextDouble();

        if (grade >= 70) {
            System.out.println("Remarked as: Passed!");
        } else if (grade == 0) {
            System.out.println("Remarked as: Dropped");
        } else if (grade <= 70)
            System.out.println("Remarked as: Failed");

        scanner.close();
    }

}

// Programmed by: Moncito Glenn N. Hernandez
// BS Information Technology 2 (SSC - Recoletos de Cavite)