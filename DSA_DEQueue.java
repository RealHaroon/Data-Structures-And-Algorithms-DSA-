package DataStructuresAndAlogorithms;

public  class DSA_DEQueue {
    int rear;
    int front;
    int capacity;
    int[]queue;
    DSA_DEQueue(int capacity){
        this.capacity=capacity;
        queue=new int[capacity];
        this.front=-1;
        this.rear=-1;
    }
    boolean isEmpty(){
        if (front==-1)
            return true;
        else
            return false;
    }
    boolean isFull(){
        if ((front==0 && rear==capacity-1)||front==rear+1)
            return true;
        else
            return false;
    }
    void add_Front(int data){
        if (isFull()) {
            System.out.println("Queue is full can not add element.");
            return;
        }
        if (front==-1) {
            front=0;
            rear=0;
        }
        else if (front==0) {
            front=capacity-1;
        }
        else
            front=front-1;
        queue[front]=data;
        System.out.println("Add front element is:"+data);
    }
    void add_Rear(int data){
        if (isFull()) {
            System.out.println("Queue is full can not add element.");
        }
        if (front==-1) {
            front=0;
            rear=0;
        }
        else if (rear==capacity-1) {
            rear=0;
        }
        else
            rear=rear+1;
        queue[rear]=data;
        System.out.println("Add rear element is:"+data);
    }
    int remove_Front(){
        if (isEmpty()) {
            System.out.println("Queue is Empty can not dequeue.");
        }
        int data=queue[front];
        if (front==rear) {
            front=-1;
            rear=-1;
        }
        else if (front==capacity-1) {
            front=0;
        }
        else
            front=front+1;
        return data;
    }
    int remove_Rear(){
        if (isEmpty()) {
            System.out.println("Queue is empty can not dequeue");
        }
        int data=queue[rear];
        if (front==rear) {
            front=-1;
            rear=-1;
        }
        else if (rear==0) {
            rear=capacity-1;
        }
        else
            rear=rear-1;
        return data;
    }
    int peekFront(){
        if (isEmpty()) {
            System.out.println("Queue underflow error");
        }
        return queue[front];
    }
    int peekRear(){
        if (isEmpty()) {
            System.out.println("Queue underflow error");
        }
        return queue[rear];
    }
    void display (){
        if (isEmpty()) {
            System.out.println("DEQueue is Empty.");
            return;
        }
        System.out.println("DEQueue (Front to rear): ");
        int current=front;
        while (true) {
            System.out.println(queue[current]+" ");
            if (current==rear) {
                break;
            }
            current=(current+1)%capacity;
        }
        System.out.println();
    }
    int get_size(){
        if (isEmpty()) {
            System.out.println("The queue is Empty:");
        }
        return capacity-1;
    }
    int get_capaciy(){
        return capacity;
    }
    public void clear(){
        rear=-1;
        front=0;
        capacity=0;
        System.out.println("Queue cleared.");
    }
    public static void main(String[] args) {
        DSA_DEQueue dq=new DSA_DEQueue(6);
        System.out.println(dq.isEmpty());
        System.out.println(dq.isFull());
        dq.add_Front(1);
        dq.add_Front(2);
        dq.add_Front(3);
        dq.add_Rear(4);
        dq.add_Rear(5);
        dq.add_Rear(6);
        dq.display();
        System.out.println(" Capacity of Queue is:"+dq.get_capaciy());
        System.out.println("Removed rear :"+dq.remove_Rear());
        System.out.println("Peek rear is : "+dq.peekRear());
        System.out.println("Removed rear :"+dq.remove_Rear());
        System.out.println("Removed front : "+ dq.remove_Front());
        System.out.println("Peek front is : "+dq.peekFront());
        dq.display();
        dq.clear();

    }
}



