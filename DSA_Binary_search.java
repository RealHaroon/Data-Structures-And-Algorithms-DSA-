package DataStructuresAndAlogorithms;



public class DSA_Binary_search {  //! Its Mendatory to Sort data before applying Binary Seacrch algorithm.
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

    public static int BinarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2; // * Mid element
            if (numbers[mid] == key)
                return mid;
            if (numbers[mid] < key) // * Will search in left half
                start = mid + 1; //! +1 Because its searching via index
            else
                end = mid - 1; //! -1 Beacause Key is already Bigger than mid
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10}; //! Array must be sorted otherwise the algorithm won't work.
        int key = 8;
        
        if (!isSorted(numbers)) {//! Checking If data is sorted or not
            System.out.println("Array is not sorted.");
            return;
        }
        System.out.println("Index for the Key is " + BinarySearch(numbers, key));
    }
}


