package recursion;

public class RecursionPractice {
   public static void printNumb(int n) { // Printing Numbers using Recursive Method
      if (n == 11) {
         return;
      }
      System.out.println(n);
      printNumb(n + 1);
   }

   public static void main(String[] args) {
      int n = 0;
      printNumb(n); // prints 0 to 10
   }
}
