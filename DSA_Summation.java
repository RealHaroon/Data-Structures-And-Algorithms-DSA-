package DataStructuresAndAlogorithms;
import java.util.Arrays;

public class DSA_Summation {
// This Method is based on Varargs concept in java.
    static int add(int...ar){ // <-Varargs
        int sum=0;
        for (int elements:ar){
            sum =sum+elements;
           System.out.print(elements+" ");
           
        }
        System.out.println();
        System.out.println("Sum is :"+sum);
  
        return sum;
    }
    public static void main(String[] args) {
      
       add(44,55,66,77,88);
        
    }

}

