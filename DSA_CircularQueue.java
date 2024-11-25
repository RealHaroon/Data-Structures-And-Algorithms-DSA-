package DataStructuresAndAlogorithms;


class myCircularQueue{
    static  int []queue;
    static int cap;
    static int rear=-1;
    static int front=-1;
   
    public myCircularQueue(int capacity){
        
        this.cap=capacity;
        queue=new int[capacity];
    }

    boolean isEmpty(){
        if (front==-1 && rear==-1) {
            return true;
            
        }else {
            return false;
        }

    }
    boolean isFull(){
        if ((rear+1)%cap==front) {

            return true;
        }else{
            return false;
        }

    }
    public void enQueue(int insert){
        if (isFull()) {
            System.out.println("Queue is full :)");
            return;
        }
        if (front==-1) {
            front=0;
            
        }
        rear=(rear+1)%cap;
    
          queue[rear]=insert;
          System.out.println("Inserted : "+insert);


}
    public int deQueue(){
        if (isEmpty()) {
            System.out.println("Queue is Empty :)");
            
        }
        int result=queue[front];
       if (front==rear) {
           front=-1;
           rear=-1;
       }else{
        front=(front+1)%cap;
       }
        return result;

    
    }

    public int Peek(){
       
        return queue[front];

    }
public void display(){

    if (isEmpty()){
        System.out.println("Queue is Empty!");
        return;
    }
    for (int elements : queue) {
        System.out.println(elements);
        
    }
}
    public int getcapacity(){
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


}

public class DSA_CircularQueue {
    public static void main(String[] args) {
        myCircularQueue cq=new myCircularQueue(5);
        System.out.println("Is it Empty?"+cq.isEmpty());
        System.out.println("Is it Full?"+cq.isFull());
        cq.enQueue(3);
        cq.enQueue(4);
        cq.enQueue(5);
        cq.enQueue(6);
        cq.enQueue(7);
        cq.display();
        System.out.println("Capacity is  "+cq.getcapacity());
        System.out.println("Size is "+cq.SizeOfQueue());
        System.out.println("Removed"+cq.deQueue());
        cq.enQueue(8);
        System.out.println("Peek is : "+cq.Peek());
        System.out.println("Removed : "+cq.deQueue());
        cq.enQueue(9);
        System.out.println("Peek is :"+cq.Peek());
        cq.display();
       System.out.println("Is it empty?"+cq.isEmpty());
        System.out.println("Is it full?"+cq.isFull());
        cq.Qclear();
        System.out.println("Is it empty?"+cq.isEmpty());
        

        

    }

}
