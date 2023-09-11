public class sorting3 {

    public static void insertionSort(int[]arr){

    // This Sorting is called Insertion Sort
    
    int n = arr.length;
    
    for (int i = 0; i < n; i++) {
        int key = arr[i]; // Current Element to be compared

        int j = i - 1;

        // Move elements of arr, that are greater than key to one position ahead of their Current Position

        while (j >= 0 && arr[j] > key){
            arr[j + 1] = arr[j];
            j = j - 1;
        }

        arr[j + 1] = key; // Place current element at its correct Position

    }
}

    public static void main(String[] args) {
        
        int [] arr = {64, 32, 25, 12, 22, 11, 90};

            System.out.println("\n Original List:");
            for (int num : arr){
                System.out.println(num + " ");
            }

            insertionSort(arr);
            
            System.out.println("\nSorted List: ");
            for (int num : arr){
                System.out.println(num + " ");
            }

    }
}

// Programmed By Moncito Glenn N. Hernandez & Jean Paula Valencia
// BS Information Technology 2 (SSC - Recoletos de Cavite)