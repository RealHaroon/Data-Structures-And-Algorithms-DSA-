package stack;

// Array-based stack that doubles its capacity when full
// and halves it when only a quarter is in use.
class ResizeableStack {
    private int[] object;
    private int top;       // index of the next free slot
    private int stackSize; // current capacity

    public ResizeableStack() {
        this(2);
    }

    public ResizeableStack(int initialCapacity) {
        stackSize = Math.max(1, initialCapacity);
        object = new int[stackSize];
        top = 0;
    }

    private void resize(int newCapacity) {
        int[] copy = new int[newCapacity];
        for (int i = 0; i < top; i++) {
            copy[i] = object[i];
        }
        object = copy;
        stackSize = newCapacity;
    }

    public void push(int data) {
        if (top == stackSize) {
            resize(stackSize * 2);
        }
        object[top++] = data;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        int data = object[--top];
        if (top > 0 && top <= stackSize / 4) {
            resize(stackSize / 2);
        }
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return object[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public int capacity() {
        return stackSize;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.print(object[i] + " ");
        }
        System.out.println();
    }
}

public class DSA_StackimplementationResizeable {
    public static void main(String[] args) {
        ResizeableStack stack = new ResizeableStack();
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
            System.out.println("Pushed " + i + " -> size " + stack.size() + ", capacity " + stack.capacity());
        }
        stack.printStack();
        System.out.println("Peek: " + stack.peek());
        while (stack.size() > 1) {
            int popped = stack.pop();
            System.out.println("Popped " + popped + " -> size " + stack.size() + ", capacity " + stack.capacity());
        }
        stack.printStack();
    }
}
