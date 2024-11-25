package DataStructuresAndAlogorithms;
import java.util.HashMap;

class Node {
    int data;
    Node next;

    // constructor
    Node(int d) {
        this.data = d;
        this.next = null;
    }

    protected void finalize() {
        System.out.println("Memory is free for node with data " + this.data);
    }
}

public class DSA_CircularLinkedList {

    public static void insertNode(Node tail, int element, int d) {
        // empty list
        if (tail == null) {
            Node newNode = new Node(d);
            tail = newNode;
            newNode.next = newNode;
        } else {
            // non-empty list
            // assuming that the element is present in the list
            Node curr = tail;

            while (curr.data != element) {
                curr = curr.next;
            }

            // element found -> curr is representing element wala node
            Node temp = new Node(d);
            temp.next = curr.next;
            curr.next = temp;
        }
    }

    public static void print(Node tail) {
        Node temp = tail;

        // empty list
        if (tail == null) {
            System.out.println("List is Empty");
            return;
        }

        do {
            System.out.print(tail.data + " ");
            tail = tail.next;
        } while (tail != temp);

        System.out.println();
    }

    public static void deleteNode(Node tail, int value) {
        // empty list
        if (tail == null) {
            System.out.println("List is empty, please check again");
            return;
        } else {
            // non-empty
            // assuming that "value" is present in the Linked List
            Node prev = tail;
            Node curr = prev.next;

            while (curr.data != value) {
                prev = curr;
                curr = curr.next;
            }

            prev.next = curr.next;

            // 1 Node Linked List
            if (curr == prev) {
                tail = null;
            }

            // >=2 Node linked list
            else if (tail == curr) {
                tail = prev;
            }

            curr.next = null;
            curr = null;
        }
    }

    public static boolean isCircularList(Node head) {
        // empty list
        if (head == null) {
            return true;
        }

        Node temp = head.next;
        while (temp != null && temp != head) {
            temp = temp.next;
        }

        return temp == head;
    }

    public static boolean detectLoop(Node head) {
        if (head == null)
            return false;

        HashMap<Node, Boolean> visited = new HashMap<>();

        Node temp = head;

        while (temp != null) {
            // cycle is present
            if (visited.containsKey(temp)) {
                return true;
            }

            visited.put(temp, true);
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {

        Node tail = null;

        // insertNode(tail, 5, 3);
        // print(tail);

        // insertNode(tail, 3, 5);
        // print(tail);

        /*
         * insertNode(tail, 5, 7);
         * print(tail);
         * 
         * insertNode(tail, 7, 9);
         * print(tail);
         * 
         * insertNode(tail, 5, 6);
         * print(tail);
         * 
         * insertNode(tail, 9, 10);
         * print(tail);
         * 
         * insertNode(tail, 3, 4);
         * print(tail);
         * 
         * 
         * deleteNode(tail, 5);
         * print(tail);
         */

        if (isCircularList(tail)) {
            System.out.println("Linked List is Circular in nature");
        } else {
            System.out.println("Linked List is not Circular");
        }
    }
}

