package DataStructuresAndAlogorithms;

class ListNode {// Creating a linked list using ListNode
    int data;
    ListNode next;
    
    ListNode(int data) {// Constructor
        this.data = data;
        this.next = null;
    }
}

public class DSA_MergeSort_LinkedList {
    
    public static ListNode mergeSort(ListNode head) {// head is LL
        if (head == null || head.next == null) {// Base case
            return head;
        }
        ListNode mid = getMid(head); // Find Mid of the LL
        
        // Dividing LL in to halfs

        ListNode left = head; // Left half
        ListNode right = mid.next;// Right half
        mid.next = null;
        
        left = mergeSort(left); // Sorting left
        right = mergeSort(right); // Sorting right
        
        return merge(left, right);// Merging left & right
    }
    
    public static ListNode getMid(ListNode head) {// Finding Mid of LL using Slow and Faster pointer technique.
        ListNode slow = head;// Slow pointer moves one step at a time
        ListNode fast = head.next;// Fast pointer moves two steps at a time
        
        while (fast != null && fast.next != null) {
            // When the fast pointer reaches the end, slow pointer will be at the middle.
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow; // returning middle.
    }
    
    public static ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1);// creating an empty LL 
        ListNode current = dummy;// Resulting Node
        
        while (left != null && right != null) {// Merging and Sorting
            if (left.data <= right.data) {
                current.next = left;
                left = left.next;
            } else {// if(right.data<=left.data)
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        
        if (left != null) {
            current.next = left;
        } else {// if(right != null)
            current.next = right;
        }
        
        return dummy.next;// Returnin the sorted head
    }

    public static void printList(ListNode head) {// Printing LL
        ListNode current = head;
        while (current != null) {// via while loop
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // head is LL
        //                Data:
        ListNode head = new ListNode(6);
        head.next = new ListNode(3);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(8);

        System.out.println("Original List:");
        printList(head);
        
        head = mergeSort(head);// Applying MergeSort algorithm on LinkedList
        
        System.out.println("Sorted List:");
        printList(head);
    }
}
