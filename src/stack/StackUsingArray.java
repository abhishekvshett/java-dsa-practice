package stack;

// Stack using array
// Time: O(1) per operation

public class StackUsingArray {

    int top = -1;
    int size;
    int[] stack;

    public StackUsingArray(int size) {
        this.size = size;
        stack = new int[size];
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (top == -1)
            return -1;
        return stack[top];
    }
}
