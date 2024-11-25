package DataStructuresAndAlogorithms;

public class DSA_MinandMax {
    public static void main(String[] args) {
        int[]array = {44, 622, 550,1,22,76};
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;

    for (int elements : array) {
        System.out.print(elements + " ");
        if (elements > max ) {
            max = elements;
        }
            if (elements<min) {
                min = elements;
            }
        }


    
    System.out.println();

System.out.println("The Biggest integer in an array is : "+max);
System.out.println("The Smallest integer in an array is : "+min);
    }

}
