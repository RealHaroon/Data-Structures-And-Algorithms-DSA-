package DataStructuresAndAlogorithms;


public class DSA_Average {
    public static void main(String[] args) {
      
        int[] studentMarks={45,36,48,32,41,46,21,44,25,23};
        int total=0;
       
        for(int i=0;i<studentMarks.length;i++) {
            total += studentMarks[i];
            
       
        }
        double average=total/studentMarks.length;
        System.out.println("Average is "+average);
         
        }

}
