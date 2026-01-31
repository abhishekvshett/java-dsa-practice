// Queue using array
// Time: O(1) operations

public class QueueUsingArray {

    int front = 0;
    int rear = -1;
    int size;
    int[] queue;

    QueueUsingArray(int size) {
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = value;
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front++];
    }
}
