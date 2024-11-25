package DataStructuresAndAlogorithms;
import java.util.LinkedList;
import java.util.Queue;
public class DSA_BinaryTree {
static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;

    }
}
//                            Building a Tree.
static class BinaryTree{
    static int idx=-1;
    
    public static Node buildTree(int[]nodes){
      idx++;
     if (nodes[idx]==-1){
    return null;
}
     Node newNode=new Node(nodes[idx]);
     newNode.left=buildTree(nodes);
     newNode.right=buildTree(nodes);
     return newNode;
    }
}

public static void preOrder(Node root){ // PreOrder traversal (Root, left subtree, right subtree)
    if (root==null){
        return;
    }
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
}
public static void inOrder(Node root){ // InOrder traversal (left subtree, root , right subtree)
    if (root==null){
        return;
    }
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
}
public static void postOrder(Node root){ // PostOrder traversal ( left subtree, right subtree, root)
    if (root==null){
        return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data+" ");

}
public static void levelOrder(Node root){// LeveOrder traversal ( Travel by the levels of Nodes via BFS).
    if (root==null){
return;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);
    while (!q.isEmpty()){
        Node currNode=q.remove();
        if (currNode == null){
            System.out.println();
            if (q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{
            System.out.print(currNode.data+" ");
            if (currNode.left!= null){
                q.add(currNode.left);
            }
            if (currNode.right!= null){
                q.add(currNode.right);
            }
        }
    }
}
public static int countOfNodes(Node root){// Count of Binary tree.
    if (root==null){
        return 0;
    }
    int leftNodes=countOfNodes(root.left);
    int rightNodes=countOfNodes(root.right);
    return leftNodes+rightNodes+1;

}
    public static int sumOfNodes(Node root) {// Sum of Binary tree.
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum+ rightSum + root.data;
    }
     public static int height(Node root){ // Height of tree with respect to levels of tree.
    if (root==null){
        return 0;
    }
    int leftHeight=height(root.left);
    int rightHeight=height(root.right);

    int myHeight=Math.max(leftHeight,rightHeight)+1;
    return myHeight;
     }
     //                 *Diameter of tree*
    // No of nodes in the longest path between any 2 nodes called Diameter of tree.

     public static int diameter(Node root){// <-- Approach 1 (Time complexity 0(n^2))
    if (root==null){
        return 0;
    }
    int diam1=diameter(root.left);
    int diam2=diameter(root.right);
    int diam3=height(root.left)+height(root.right)+1;

    return Math.max(diam3,Math.max(diam1,diam2));

}
static class TreeInfo{
    int ht;
    int diam;
    TreeInfo(int ht, int diam){
        this.ht=ht;
        this.diam=diam;
    }
}
public static TreeInfo diameter2(Node root){// <-- Approach 2 (Time complexity 0(n))
    if (root==null){
       return new TreeInfo(0,0);
    }
    TreeInfo left = diameter2(root.left);
    TreeInfo right= diameter2(root.right);
     int myHeight= Math.max(left.ht, right.ht)+1;

     int diam1= left.diam;
     int diam2= right.diam;
     int diam3= left.ht+right.ht+1;
     int myDiam=Math.max(Math.max(diam1,diam2),diam3);
     TreeInfo myInfo=new TreeInfo(myHeight,myDiam);
     return myInfo;

}

// Time complexity of Binary tree is O(n)
    public static void main(String[] args) {
        int []nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=BinaryTree.buildTree(nodes);
        System.out.println(root.data);
        preOrder(root);
        inOrder(root);
        postOrder(root);
        levelOrder(root);
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
    }

}
