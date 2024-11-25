package DataStructuresAndAlogorithms;
import java.util.Scanner;

public class DSA_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int passCount=0;
        System.out.println("Enter the class size");
        int classSize=sc.nextInt();
        int i;
        
              for(i=0;i<classSize;i++){
    System.out.println("Enter the marks of student");
        int studentMarks=sc.nextInt();

       if (studentMarks>50) {
        

      passCount=passCount+1;
     
    }else{
    
     i=i+1;
}

}  
System.out.println("Number of Pass Students : "+passCount);

            }
    }


