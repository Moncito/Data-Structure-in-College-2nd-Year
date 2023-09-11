public class Assignment5 {

    public static void main(String[] args) {

        int year = 2016;
        boolean isLeapYear;

        // divisible by 4

        isLeapYear = (year % 4 == 0);

        // divisible by 5

        isLeapYear = isLeapYear && (year % 100 != 0);

        // divisible by 4 and not 100 unless divisible by 400

        isLeapYear = isLeapYear || (year % 400 == 0);

        System.out.println("Is " + year + " a Leap Year");
        System.out.println(isLeapYear);

    }

}

// Programmed by: Moncito Glenn N. Hernandez
// BS Information Technology 2 (SSC - Recoletos de Cavite)