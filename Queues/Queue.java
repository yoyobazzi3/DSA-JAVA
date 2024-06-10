package Queues;

import java.util.NoSuchElementException;

public class Queue {
    private Node front;
    private Node rear;
    private int length;

    private static class Node {
        private Node next;
        private int data;// can be of any type

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // public Queue() {
    // this.front = null;
    // this.rear = null;
    // length = 0;
    // }
    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return length;
    }

    public void offer(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public int poll() {
        Node temp = front;
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            front = front.next;
            temp.next = null;
        }
        length--;
        return temp.data;
    }

    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.offer(0);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println("After adding elements to the queue ");
        queue.display();
        System.out.println();

        queue.poll();
        queue.poll();
        System.out.println("After removing the last element in the first ");
        queue.display();
        System.out.println();


        System.out.println(queue.isEmpty());

    }

}
