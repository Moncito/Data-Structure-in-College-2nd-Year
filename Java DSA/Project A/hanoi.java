import java.util.Stack;
import java.util.Scanner;

public class hanoi {

    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from the stack to reverse the string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        // Declaring Variables
        String original, reversed;

        // Using Scanner For System Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Word/ Words you want to Reverse:");
        original = scanner.nextLine();

        reversed = reverseString(original);

        // Print
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}

// Developed By: Moncito Glenn N. Hernandez & Jean Paula C. Valencia 
// BS Information Technology 2 (SSC - Recoletos de Cavite)