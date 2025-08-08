// 🔹 Problem Statement :
// Goal: Build a generic Stack class MyStack<T> using an array (fixed-size), and support the following methods:

// push(T value) – insert at the top
// pop() – remove and return the top element
// peek() – just return the top element
// isEmpty() – return true if the stack has no elements
// isFull() – return true if stack has reached max capacity
// Bonus: Add size() method and handle exceptions properly

// ---------------------------------------------------------------------------------

public class MyStack<T> {
    private int top;
    private int capacity;
    private T[] stack;

    @SuppressWarnings("unchecked")
    public MyStack(int capacity) {
        this.capacity = capacity;
        this.stack = (T[]) new Object[capacity];
        this.top = -1;
    }

    public void push(T value) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        }
        return stack[top--];
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        stack.printStack();

        System.out.println("Size: " + stack.size());
    }
}