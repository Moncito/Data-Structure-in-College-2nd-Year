public class sorting1 {

    // This sorting is called Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Outer Loops Iterate Each elements

        for (int i = 0; i < n; i++) {
            int minIndex = 0;

            // Inner Loo[p finds the minimun Element in the Unsorted Part

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the Minimun Element with The first Unsorted Element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 65, 15, 12, 22, 11 };
        System.out.println("Original array: ");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        selectionSort(arr);

        System.out.println("\n Sorted Array");
        for (int num : arr) {
            System.out.println(num + " ");
        }

    }

}

// Programmed by Moncito Glenn N. Hernandez and Jean Paula Valencia
// BS Information Technology 2 (SSC - Recoletos de Cavite)