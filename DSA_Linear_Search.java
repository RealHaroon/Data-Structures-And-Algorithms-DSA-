package DataStructuresAndAlogorithms;

public class DSA_Linear_Search {
    public static int LinearSearch(int numbers[],int key){

        for (int elements:numbers) {
            if (key == numbers[elements])
                key = elements;
            return elements;
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={3,4,5,2,6,10};
        int key=5;
        System.out.println("index of the key"+key+ " is "+LinearSearch(numbers,key));
    }
}
