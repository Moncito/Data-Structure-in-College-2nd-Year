public class Array3 {

    public static void main(String[] args) {
        int[] numbers = { 2, -9, 0, 5, 12, 25, 22, 9, 8, 12 };
        int sum = 0;
        Double average;

        // Access all Elements using for each loop
        // add each elements in sum

        for (int number : numbers) {
            sum += number;
        }

        // Get Total Number in the Elements

        int arrayLength = numbers.length;

        // Calculate the Average
        // Convert int to Double

        average = ((double) sum / (double) arrayLength);

        System.out.println("Sum:" + sum);
        System.out.println("Average: " + average);

    }

}
