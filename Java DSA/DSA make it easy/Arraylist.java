import java.util.*;

public class Arraylist {

    public static void main(String[] args) {

        // Initialize a List
        List<String> groceries = new ArrayList<String>();
        groceries.add("apple");
        groceries.add("banana");
        groceries.add("carrots");
        groceries.add("olive oils");
        groceries.add("Avocado");

        // Print the length of array
        System.out.println("Number of Groceries" + groceries.size());

        // print all the groceries
        for (String item : groceries) {
            System.out.println(item + ",");
        }

        System.out.println();

        // Retrieve element in constant time
        System.out.println("Grocery items at index 3: " + groceries.get(3));

        // remove element
        groceries.remove(0);

        // check length
        System.out.println("Number of Groceries " + groceries.size());

        // print out elements again

        for (String item : groceries) {
            System.out.println(item + ",");
        }

    }
}
