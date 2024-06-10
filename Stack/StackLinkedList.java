package Stack;

import java.util.EmptyStackException;

public class StackLinkedList {

    private Node top;
    private int length;

    private static class Node {
        private Node next;
        private int data;

        public Node(int data) {
            this.next = null;
            this.data = data;
        }
    }

    public StackLinkedList() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public int pop() {
        Node temp = top;
        if (top == null) {
            throw new EmptyStackException();
        } else {
            top = top.next;
            temp.next = null;
        }
        length--;
        return temp.data;

    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;

        }
        System.out.print("null");
    }

    public int peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(22);
        stack.push(21);
        stack.push(30);
        stack.display();
        System.out.println();
        System.out.println("We popped "+stack.pop());
        System.out.println("Peek is " + stack.peek());
        stack.display();
    }
}
