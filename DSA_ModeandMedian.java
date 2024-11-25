
package DataStructuresAndAlogorithms;
import java.util.Arrays;

public class DSA_ModeandMedian{

   
    public static double calculateMedian(int[] array) {
        
        Arrays.sort(array); //! Its Mendatory to sort data to find median
        
        
        double length = array.length;
        if (length % 2 == 0) { //! for even lenght
           // return (length / 2 - 1) + (length / 2) / 2.0;
            return (array[(int)(length / 2) - 1] + array[(int)(length / 2)]) / 2.0 ;
        } else { //! For odd lenght
            
            return array[array.length /2]; //! Will return the mid element of data after sorting.
        }
    }

    public static int calculateMode(int[] array) {
        int mode = 0;
        int maxFrequency = 0;
        
        for (int i = 0; i < array.length; i++) {
            int frequency = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frequency++;
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = array[i];
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        int[] array = {7,8,6,2,9}; 

        double median = calculateMedian(array);
        System.out.println("Median: " + median);

        int mode = calculateMode(array);
        System.out.println("Mode: " + mode);
    }
}


