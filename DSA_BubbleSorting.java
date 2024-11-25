package DataStructuresAndAlogorithms;

public class DSA_BubbleSorting {


public static void bubbleSorting(int[]arr){
    // performing BubbleSorting.
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if (arr[j]>arr[j+1]) {//(use < for desending order.)
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                
            }
        }
    }
}

public static void bubbleSortRecursiveHelper(int[] arr, int n) {
    // Base case
    if (n == 1) {
        return;
    }
    // calling method for  n-1 elements
    bubbleSortRecursiveHelper(arr, n - 1);
    // Performing BubbleSorting
    for (int i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) { // Use < for descending order
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
public static void printArray(int []arr){
    for (int elements : arr) {
        System.out.print(elements+" ");
        
    }
}
// Time complexity= O(n^2).

public static void main(String[] args) {
    int[]arr={4,1,5,3,2}; // Unsorted Array.

    bubbleSorting(arr);
    printArray(arr);
    System.out.println();
    bubbleSortRecursiveHelper(arr, arr.length);
    printArray(arr);
    

}
}
    

