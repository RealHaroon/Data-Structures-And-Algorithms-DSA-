package DataStructuresAndAlogorithms;
import java.util.ArrayList;
import java.util.Collections;


public class DSA_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();


        // Add elements.
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        // Print elements.
        System.out.println(list);
        // get elements.
        int getelemet=list.get(1);
        System.out.println(getelemet);
        System.out.println(list.get(1));
        // Add elements in between.
        list.add(0,5);
        System.out.println(list);   
        // set elements.
        list.set(2, 6);
        System.out.println(list);
        // Remove/Delete element.
        list.remove(2);
        System.out.println(list);
        // Size.
        int size=list.size();
        System.out.println(size);
  
        // Sorting.
        Collections.sort(list);
        System.out.println(list);

              // Loops.
              for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
            for (Integer elements : list) {
                System.out.println(elements);
                
            }
            int i=0;
            while (i<list.size()) {
                System.out.println(list.get(i));
                i++;
                
            }
            int j=0;
            do{
                System.out.println(list.get(j));
                j++;
            }while(j<list.size());
    }
    
}
