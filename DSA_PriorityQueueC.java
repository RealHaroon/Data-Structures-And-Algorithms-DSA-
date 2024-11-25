package DataStructuresAndAlogorithms;
import java.util.PriorityQueue;


public class DSA_PriorityQueueC {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(4);
        pq.add(3);
        pq.add(5);
        pq.add(1);
        pq.add(2);
                System.out.println(pq);
                System.out.println(pq.peek());
                System.out.println(pq.poll());
                System.out.println(pq);
                System.out.println(pq.peek());
                System.out.println(pq.poll());
                System.out.println(pq.poll());
               // System.out.println(pq.peek());
                System.out.println(pq.poll());
                System.out.println(pq.removeAll(pq));
                System.out.println(pq);
    }

}
