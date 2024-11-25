package DataStructuresAndAlogorithms;

public class DSA_MergeSort {
    // Time Compexity O(nlogn)

    public static void divide(int arr[], int si, int ei) {// Dividing an Array into small sub-Arrays
        if (si >= ei) {// base case
            return;
        }
        
        //O(logn)
        int mid = si + (ei - si) / 2; // (si+ei)/2 
        divide(arr, si, mid);// for the first sub Array
        divide(arr, mid + 1, ei);// for the second sub Array
        conquer(arr, si, mid, ei); // calling Conquer
    }

    public static void conquer(int[] arr,  int si,int mid, int ei) {
        int []merged= new int[ei-si+1]; // Size of merged array should be ei-si+1

        int idx1 = si; // counter/tracker  of first sub Array 
        int idx2 = mid + 1;//counter / tracker of second sub Array
        int x = 0;// counter / tracker for merged Array

        // O(n)
        while (idx1 <= mid && idx2 <= ei) { // } Sorting 
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        // only one condition will be true in below cases
        // case 1   
        while (idx1 <= mid) {//  copying & sorting
            merged[x++] = arr[idx1++];
        }
        // case 2
        while (idx2 <= ei) {// copying & sorting
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};// data
        int n = arr.length;
        divide(arr, 0, n - 1);
       

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
