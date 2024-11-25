package DataStructuresAndAlogorithms;

public class DSA_Stackimplementation {
    int top;
    int cap;
    int[] stack;


    public DSA_Stackimplementation(int capacity) {
        top = -1;
        this.cap = capacity;
        stack = new int[capacity];
    }

    boolean isFull() {
        if (top == cap - 1) {

            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {

            return true;
        } else {
            return false;
        }
    }

    public int push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");


        }
        return stack[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        }
        return stack[top--];
    }

    public int peek() {
        return stack[top];

    }

    public int Scapacity() {
        return cap;
    }

    public int SizeofStack() {
        return top + 1;

    }

    public void printStack() {
        if (isEmpty()){
        System.out.println("Stack is Empty!");
        return;
    }
        for (int elements : stack) {
            System.out.println(elements);

        }
    }

    public int[] stockInArray() {
        int[] arr = new int[25];
        int i;


        while (!isEmpty()) {
            i = pop();
            arr[i] = i;
        }

        return arr;
    }

    public static void transferStack(DSA_Stackimplementation Stack1, DSA_Stackimplementation Stack2) {
        // Stack 1 is the source here and Stack 2 is the destination for copying elements.
        DSA_Stackimplementation temp = new DSA_Stackimplementation(5);
        while (!Stack1.isEmpty()) {
            temp.push(Stack1.pop());
        }
        while (!temp.isEmpty()) {
            Stack2.push(temp.pop());
        }
    }

//( Object inside method can be created.)

    public static void main(String[] args) {
DSA_Stackimplementation s1 = new DSA_Stackimplementation(5);
        System.out.println("Is it empty?" + s1.isEmpty());
        System.out.println("Inserted" + s1.push(10));
        System.out.println("Inserted" + s1.push(11));
        System.out.println("Inserted" + s1.push(12));
        System.out.println("Inserted" + s1.push(13));
        System.out.println("Inserted" + s1.push(14));
        System.out.println("Peek " + s1.peek());
        System.out.println("Poped " + s1.pop());
        System.out.println("Capacity is " + s1.Scapacity());
        System.out.println("Size of Stack is " + s1.SizeofStack());

        System.out.println();

        s1.printStack();
      DSA_Stackimplementation s2= new DSA_Stackimplementation(5);
//DSA_Stackimplementation temp = new DSA_Stackimplementation(5);
//
//        while (!s1.isEmpty()) {
//            temp.push(s1.pop());
//        }
//        while (!temp.isEmpty()) {
//            s2.push(temp.pop());
//        }
//        s2.printStack();

       transferStack(s1, s2);


        //  s1.stockInArray();
        //    System.out.println("Is it empty?"+s1.isEmpty());
    }
}
