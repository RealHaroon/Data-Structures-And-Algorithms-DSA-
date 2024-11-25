package DataStructuresAndAlogorithms;

public class DSA_SelectionSorting {

    public static void selectionSort(int[] arr) {
    for(int i=0;i<arr.length-1;i++){
        int minIndex=i;
        // Find the minimum element in the unsorted portion of the array
        for(int j=i+1;j<arr.length;j++){
            if (arr[minIndex]>arr[j]) { // (use < for desending order.)
                minIndex=j;
                
            }
        // Swap the found minimum element with the element at startIndex
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    }

    public static void selectionSortRecursive(int[] arr, int startIndex) {
        // Base case
        if (startIndex >= arr.length - 1) {
            return;
        }
      // Recursively call selectionSort for the next index
        selectionSortRecursive(arr, startIndex + 1);
        // Find the minimum element in the unsorted portion of the array
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        // Swap the found minimum element with the element at startIndex
        int temp = arr[minIndex];
        arr[minIndex] = arr[startIndex];
        arr[startIndex] = temp;
    }
// Time complexity= O(n^2).

    public static void printArray(int[] arr) {
        for (int elements : arr) {
            System.out.print(elements+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {66, 25, 12, 22, 11}; //Unsorted Array.
        selectionSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
        System.out.println();
        selectionSortRecursive(arr, 0);
        printArray(arr);
           }
}

