public class sorting2 {

    // This is Bubble Sorting
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer Loop for the number of pass
        for (int i = 0; i < n - 1; i++) {

            // Inner Loop for each pass
            for (int j = 0; j < n - i - 1; j++) {

                // Compare Adjustment Elements
                if (arr[j] > arr[j + 1]) {

                    // Swap if they are wrong in order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {

        int[] arr = { 62, 34, 25, 12, 22, 11, 90 };

        System.out.println("\nOriginal Array:");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        bubbleSort(arr);

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }

}

// Programmed By Moncito Glenn N. Hernandez & Jean Paula Valencia
// BS Information Technology 2 (SSC - Recoletos de Cavite)
