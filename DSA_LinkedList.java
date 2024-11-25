package DataStructuresAndAlogorithms;


class LL{
   Node head;
   private int size;
   public  LL(){
       this.size=0;
   }
    class Node{
        String data;
        Node next;
        public  Node(String data){
        this.data=data;
        this.next=null;
        size++;
        }
    }
    public void addFirst(String data){// add first
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){// add last
    Node newNode=new Node(data);
        if (head==null) {
            head = newNode;
            return;
        }
        Node currNode= head;
        while(currNode.next !=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        }
        public void printList(){// Print list
        if (head==null){// base case
            System.out.println("list is empty");
            return;
        }
            Node currNode= head;
            while(currNode !=null){
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
            }
            System.out.println("null");

        }
        public void deleteFirst(){// delete first 
        if (head==null) {// base code
            System.out.println("List is Empty!");
            return;
        }
        size--;
        head=head.next;
        }
        public void deleteLast(){// delete last
            if (head==null) {// base case
                System.out.println("List is Empty!");
                return;
            }
            size--;
            if (head.next==null){
                head=null;
                return;
            }
            Node secondLast=head;
            Node lastNode=head.next;
            while (lastNode.next!=null){
                lastNode=lastNode.next;
                secondLast=secondLast.next;
            }
            secondLast.next=null;
        }
        public int getSize(){// getsize
       return size;
        }
       
public void reverseIterate(){ // Reverse linked list using Iterative approach.
       if(head==null || head.next==null){
           return;
       }
       Node prevNode=head;
       Node currNode=head.next;
       while(currNode !=null){// reverse
           Node nextNode=currNode.next;
           currNode.next=prevNode;
           // update.
           prevNode=currNode;
           currNode=nextNode;
       }
       head.next=null;
       head=prevNode;
}
    public Node  reverseRecursive(Node head){// Reverse linked list using Recursive approach.
        if(head==null || head.next==null){// Base Case
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
public static Node getMid(Node head){// Find Middle of a Linkedlist.
    if (head ==null|| head.next==null) {
        return head;  
    }
    Node slow=head;
    Node fast=head.next;
    while (fast!=null  && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;   
    }
    return slow;
}

public static Node removeNthFromEnd(Node head, int n){// Remove Node from Nth position.
    if (head.next==null) {// Base Case.
        return null;    
    }
    // size 
    int size=0;
    Node curr=head;
    while (curr!=null) {
        curr=curr.next;
        size++;
    }
    if (size==n) {// optional
        return head.next;
    }
    int indexToSearch=size-n-1;//  (-1;) for just to print Nth Node
    Node prev=head;// curr for just to print Nth Node
    int i=1;
    while (i<indexToSearch) {
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return head;
}
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("kid ");
        list.addFirst("good");

        list.printList();

        list.addLast("mAAd ");
        list.addLast("city");
        list.printList();

        list.addFirst(" Kendrick lamar -");
        list.printList();
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println( list.getSize());
        list.reverseIterate();
        list.printList();
        list.head=list.reverseRecursive(list.head);
        list.printList();
        Node midNode = getMid(list.head);
        System.out.println("Mid Node: " + midNode.data);
        Node deletenth=removeNthFromEnd(list.head, 0);
        list.printList();

    }
}
