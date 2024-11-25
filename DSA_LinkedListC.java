package DataStructuresAndAlogorithms;
import java.util.LinkedList;
public class DSA_LinkedListC {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<String>();

        list.addFirst("good");
        list.addFirst("kid");

        System.out.println(list);

        list.addLast("mAAd ");
        list.addLast("city");
        System.out.println(list);

        list.addFirst(" Kendrick lamar -");
        System.out.println(list);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i)+"->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
        System.out.println( list.size());
    }
}
