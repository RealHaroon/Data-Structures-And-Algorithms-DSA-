package DataStructuresAndAlogorithms;

public class DSA_QuickSort {
    //  Time Complexity  in worst case:  O(n^2) , on average O(nlogn)
    // (Worst case ouccur when Pivot is always samllest or the largest element.)

    public static int partition(int []arr, int low , int high){// Partition of Array 
        int pivot=arr[high]; // Pivot is High ( last element )
        int i=low-1; // 'i' is the tracker/ counter to find how many space in needed to put elements that are < than pivot
        for(int j=low;j<high;j++){
            if (arr[j]<pivot) {
                i++;
                // swaping and sorting for those element which is < pivot
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        i++;// getting space for the right place of pivot
        // swaping to put pivot on the right place
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i; // pivot index / highest idx

    }
    public static void quickSort(int[] arr, int low, int high){
        if (low<high) {
            int pidx=partition(arr,low,high);
            quickSort(arr, low, pidx-1);// for the first-half of Array 
            quickSort(arr, pidx+1, high);// for the second-half of Array
            
        }
    }

    public static void main(String[] args) {
        int []arr={6, 3, 9, 5, 2, 8};// data
        int n=arr.length;
        quickSort(arr, 0, n-1);
   // print
    for (int elements : arr) {
        System.out.print(elements);
        
    }
        
 }
    
}
