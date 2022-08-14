package ss10_generic_stack_queue.codegym;

public class Solution {
    public static class Node {
        public int data;
        public Node front;
    }

    public static class Queue {
        public Node front;
        public Node rear;
    }

    public static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null) {
            q.front = temp;
        } else {
            q.rear.front = temp;
        }
        q.rear = temp;
        q.rear.front = q.front;
    }

    public static int deQueue(Queue q) {
        if (q.front == null) {
            return Integer.MAX_VALUE;
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.front;
            q.rear.front = q.front;
        }
        return value;
    }

    public static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.println("Elenment in Circular Queue air: ");
        while (temp.front != q.front) {
            System.out.printf("%d", temp.data);
            temp = temp.front;
        }
        System.out.printf("%d", temp.data);
    }

}
