package LinkedList;

public class CircularSinglyLinkedList {
    private Node last;
    private int length;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularLinkedList() {
        Node first = new Node(10);
        Node second = new Node(30);
        Node third = new Node(33);
        Node fourth = new Node(29);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        last = fourth;

    }

    public void display() {
        if (last == null) {
            return;
        }
        Node first = last.next;
        while (first != last) {
            System.out.print(first.data + "--> ");
            first = first.next;
        }
        System.out.print(first.data + " ");

    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if (last == null) {
            last = newNode;
        } else {
            newNode.next = last.next;
        }
        last.next = newNode;

        length++;
    }
    public void insertLast(int value){
        Node newNode = new Node(value);
        if(last == null){
            last = newNode;
            last.next = last;
        } else{
           newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
            length++;
    }
    

    public static void main(String[] args) {
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();

        cll.createCircularLinkedList();
        cll.insertFirst(55);
        cll.insertLast(333);
        cll.display();

    }
}
