package Exercise_4;

public class Exercise_4 {
    int[] arr;
    int front, rear, size, capacity;

    public Exercise_4(int c) {
        capacity = c;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // enqueue
    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;

        display();
    }

    // dequeue
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int removed = arr[front];
        front = (front + 1) % capacity;
        size--;

        display();
        return removed;
    }

    // display
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    // test scenario
    public static void main(String[] args) {
        Exercise_4 q = new Exercise_4(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(50);

        q.dequeue();

        q.enqueue(40);
        q.enqueue(60);

        q.dequeue();
    }
}
