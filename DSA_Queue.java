package DataStructuresAndAlogorithms;

class myQueue{
    int []queue;
    int cap;
    int rear=-1;
    int front=-1;

    public myQueue(int capacity){
        
        this.cap=capacity;
        queue=new int[capacity];
    }

    boolean isEmpty(){
        if (front==-1) {
            return true;
            
        }else {
            return false;
        }

    }
    boolean isFull(){
        if (rear==cap-1) {

            return true;
        }else{
            return false;
        }

    }
    public void enQueue(int insert){
        if (isFull()) {
            System.out.println("Queue is full :)");
        }
        else if (isEmpty()){
            front=0;
            rear=0;
            
        }else{
            rear=rear+1;
    

    }
          queue[rear]=insert;


}
    public int deQueue(){
        if (isEmpty()) {
            System.out.println("Queue is Empty :)");
            
        }
        int data=queue[front];
       if (front==rear) {
           front=-1;
           rear=-1;
    
            
        }else{
           front=front+1;
        }
        return data;

    
    }

    public int Peek(){
       
        return queue[front];

    }

    public int Qcapacity(){
        return cap;
    }

    public int SizeOfQueue(){
        if (isEmpty()) {
            return 0;
        }
       else if (front <= rear) {
            return ((rear - front) + 1);
            
        }else{
            return (queue.length - front + rear + 1);
        }
    }
    public void Qclear(){
         front=-1;
         rear=-1;

    }
public void printQueue(){

        if (isEmpty()){
            System.out.println("Queue is Empty!");
            return;
        }
    for (int elements:queue) {
        System.out.println(elements);

    }
}

}

public class DSA_Queue {
    public static void main(String[] args) {
        myQueue Q=new myQueue(6);
        
        System.out.println(Q.isEmpty());
        System.out.println(Q.isFull());
        Q.enQueue(3);
        Q.enQueue(4);
        Q.enQueue(5);
        Q.enQueue(6);
        Q.enQueue(7);
        Q.enQueue(8);
       

        System.out.println(Q.isEmpty());
        System.out.println(Q.isFull());

       
        System.out.println(Q.Peek());
      System.out.println(Q.deQueue());
      System.out.println(Q.Peek());
      System.out.println(Q.Qcapacity());
      System.out.println(Q.SizeOfQueue());
      Q.Qclear();
      System.out.println(Q.isFull());
      System.out.println(Q.isEmpty());
        


    }
    
}
