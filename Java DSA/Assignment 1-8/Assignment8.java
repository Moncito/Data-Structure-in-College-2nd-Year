import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice1;

        while (true) {

            System.out.println("Welcome to Algebra Formulation: \n" + "1. Quadratic Equation \n"
                    + "2. Distance Equation \n" + "3. Slope Intercept Form of a Line \n" + "4. Exit");
            choice1 = scanner.nextInt();

            if (choice1 == 1) {
                System.out.println("You've Choose Quadratic Equation! \n" + "Enter the Value of a: ");
                double answerA = scanner.nextDouble();

                System.out.println("Enter The Value of b:");
                double answerB = scanner.nextDouble();

                System.out.println("Enter The Value of C: ");
                double answerC = scanner.nextDouble();

                // Calculate the discriminant
                double discriminant = answerB * answerB - 4 * answerA * answerC;

                if (discriminant > 0) {
                    // Two real and distinct roots
                    double root1 = (-answerB + Math.sqrt(discriminant)) / (2 * answerA);
                    double root2 = (-answerB - Math.sqrt(discriminant)) / (2 * answerA);

                    System.out.println("Root 1: " + root1);
                    System.out.println("Root 2: " + root2);
                } else if (discriminant == 0) {
                    // one real root (Double Root)
                    double root = -answerB / (2 * answerA);
                    System.out.println("Double Root: " + root);
                } else {
                    // Complex rooting
                    double realPart = -answerB / (2 * answerA);
                    double imaginaryPart = Math.sqrt(-discriminant) / (2 * answerA);

                    System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i ");
                    System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i ");
                }

            } else if (choice1 == 2) {
                System.out.println(
                        "You've Choose Distance Equation \n" + " Enter the x-coordinate of the first point (x1):");
                double x1 = scanner.nextDouble();

                System.out.println("Enter the y-coordinate of the first point (y1):");
                double y1 = scanner.nextDouble();

                System.out.println("Enter the x-coordinate of the second point (x2):");
                double x2 = scanner.nextDouble();

                System.out.println("Enter the x-coordinate of the second point (y2):");
                double y2 = scanner.nextDouble();

                double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                System.out.println("Distance Between the Two Points: " + distance);

            } else if (choice1 == 3) {
                System.out.println("You've Choose Slope Intercept Form Equation! " + "Enter the Slope (m):");
                double m = scanner.nextDouble();

                System.out.println("Enter the Y Intercept: ");
                double b = scanner.nextDouble();

                System.out.println("Equation in Slope Intercept form: y = " + m + " x + " + b);

            } else if (choice1 == 4) {
                System.out.println("Exiting the program.");
                break;

            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        // Close the scanner after the loop is done
        scanner.close();
    }
}

// Programmed by: Moncito Glenn N. Hernandez
// BS Information Technology 2 (SSC - Recoletos de Cavite)