import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number of Students:");
        int numStudents = scanner.nextInt();
        double[] scores = new double[numStudents];
        int totalScore = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the Score for Student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            totalScore += scores[i];
        }

        double averageScore = (double) totalScore / numStudents;
        System.out.println("Average Score: " + averageScore);

        int aboveAveragecount = 0;
        for (int i = 0; i < numStudents; i++) {
            if (scores[i] > averageScore) {
                aboveAveragecount++;
            }
        }

        System.out.println("Number of Students above Average: " + aboveAveragecount);
        scanner.close();
    }
}

// Programmed By Moncito Glenn N. Hernandez & Jean Paula Valencia
// BS Information Technology 2 (SSC - Recoletos de Cavite)