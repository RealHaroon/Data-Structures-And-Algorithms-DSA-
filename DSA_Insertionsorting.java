package DataStructuresAndAlogorithms;

public class DSA_Insertionsorting {
    public static void insertionSorting(int [] arr){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
        // Move elements of arr[0..n-1], that are greater than last, to one position ahead of their current position
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
    public static void insertionSortRecursive(int[] arr,int n) {
        // Base case
        if (n <= 1) {
            return;
        }
        // Sort  n-1 elements
        insertionSortRecursive(arr,n-1);
        // Insert the nth element in its correct position
        int last = arr[n - 1];
        int j = n - 2;

        // Move elements of arr[0..n-1], that are greater than last, to one position ahead of their current position
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        // Place last element at its correct position
        arr[j + 1] = last;
    }
    public static void printArray(int []arr){
        for (int elements : arr) {
            System.out.print(elements+" ");
            
        }
    }
// Time complexity= O(n^2).

    public static void main(String[] args) {
        int []arr={9,8,5,4,1}; // Unsorted Array.
        insertionSorting(arr);
        printArray(arr);
        System.out.println();
        insertionSortRecursive(arr,arr.length);
        printArray(arr);
    }
}
