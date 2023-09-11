public class Array {

    public static void main(String[] args) {

        // Initialize Groceries
        String[] groceries = { "apple", "banana", "carrots", "Olive oil", "avocado" };

        // Print the lenght of the array
        System.out.println("Number of Groceries: " + groceries.length);

        // print all the groceries

        for (String item : groceries) {
            System.out.println(item + ",");
        }
        System.out.println();

        // retrieve element in constant time
        System.out.println("Grocery Items at index 3: " + groceries[3]);

        // remove element

        groceries[3] = null;

        // check Length
        System.out.println("Number of Groceries: " + groceries.length);

        // print out elements again
        for (String item : groceries) {
            System.out.println(item + ",");
        }
    }
}
