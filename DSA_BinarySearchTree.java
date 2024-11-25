package DataStructuresAndAlogorithms;

import java.util.ArrayList;

public class DSA_BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root, int key){// Inserting 
        if (root==null) {
            root=new Node(key);
            return root;
            
        }
        if (root.data >key) {
            // Left subtree
           root.left= insert(root.left, key);
            
        }else{
            // right subtree
            root.right=insert(root.right, key);
        }
        return root;
    }
    public static void inOrder(Node root){// inOrder traversal
        if (root==null) {
            return;   
        }
        inOrder(root.left);
        System.out.print(" ");
        System.out.print(root.data);
        inOrder(root.right);
    }

    public static boolean search(Node root, int key){// search in BST
        if (root==null) {
            return false;
            
        }// case 1
        if (root.data > key) {// left subtree
            return search(root.left,key);
            
        }// case 2
        else if (root.data== key) {// root
            return true;
            
        }else{// case 3
            // right subtree
            return search(root.right, key);



        }
    }
     public static Node delete(Node root, int key){ // deletion/ removing
        if (root.data> key) {
            root.left=delete(root.left, key);
            
        }else if (root.data<key) {
            root.right=delete(root.right, key);
            
        }else{// if (root.data == key)
            // case 1
        if (root.left==null&&root.right==null) {
            return null;
            
        }
        // case 2 
        if (root.left==null) {
            return root.right;
            
        }else if (root.right==null) {
            return root.left;
            }
            //  case 3
            Node IS=inOrderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(  root.right, IS.data);
        }
        return root;
       
     }
     public static Node inOrderSuccessor(Node root){// To find a InOrder Successor.
        
        while (root.left!=null) {
            root=root.left;
            
        }
        return root;

     }
      
     public static void printInRange(Node root, int X, int Y){ // Print Nodes in range of two Nodes (X & Y)
        if (root==null) {  // base case
            return   ;
        }

        if (root.data>= X&& root.data<=Y) {// case 1
            printInRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printInRange(root.right, X, Y);
            
        }else if (root.data>=Y) { // case 2
            printInRange(root.left, X, Y);
            
        }else{ // case 3
            printInRange(root.right, X, Y);
        }
     }
 
     public static void printPath( ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
        System.out.print(path.get(i)+" ->");
    }
    System.out.println();
     }

     public static void printRootToLeaf(Node root, ArrayList<Integer>path){// Print Nodes root to leaf via paths
        if (root==null) {
            return;
            
        }
     path.add(root.data);
     
        if (root.left==null&&root.right==null) {// leafs
            printPath(path);
            
        }else{// Non leafs
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);

        }
       
        path.remove(path.size()-1);

     }

// TIme complexity of Binary search tree is  O(H) H= height
    public static void main(String[] args) {// TIme complexity O(H) H= height
        int values[]={8,5,3,1,4,6,10,11,14};// Nodes/Data
        Node root=null;

        for(int i=0;i<values.length;i++){// using loop for inserting  data inside the tree
            root=insert(root, values[i]);
        }

     inOrder(root);   // inOrder 
     System.out.println();

    //  if (search(root, 2)) {// search
    //     System.out.println("found");
        
    //  }else
    //  System.out.println("not found");
   // delete(root, 4);// deletion/ removing Node.
   // inOrder(root);
    //System.out.println();
    printInRange(root, 3, 12);
    printRootToLeaf(root, new ArrayList<>());




   
    }
    //                     tree
    //                     (8)
    //              (5)          (10)
    //          (3)   (6)            (11)
   //         (1) (4)                   (14)
    
}
