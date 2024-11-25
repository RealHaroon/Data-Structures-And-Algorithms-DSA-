package DataStructuresAndAlogorithms;

public class DSA_CopyingData {
    public static void copyContentofArray(int []src, int []des){// Copying Content From source to destination.

        for(int i=0;i<src.length;i++){
        des[i]=src[i];
     }
     for (int element : des) {
     System.out.print(" " +element);
    }
     }
     public static void main(String[] args) {
        int [] arr1={1,3,4,6};
        int []arr2=new int[arr1.length];
        copyContentofArray(arr1,arr2);
        
     }
     
    
}
