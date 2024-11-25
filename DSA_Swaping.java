package DataStructuresAndAlogorithms;


public class DSA_Swaping {
   public static  void swapingArray (int [] arr){
       int len=arr.length;
       int n=Math.floorDiv(len,2);
       int temp;

       for (int i=0;i<n;i++) {
           temp = arr[i];
           arr[i] = arr[len - i - 1];
           arr[len - i - 1] = temp;
       }


    }
    public static void printArray(int [] arr){
        for (int elements: arr) {
            System.out.println(elements);

        }
    }

    public static void main(String[] args) {
        int []arr={2,4,6,8,10}; // Orignal Array.
        swapingArray(arr);
        System.out.println("Swapped Array");
        printArray(arr);

    }
}
