package LinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private static class Node {
        private int data;
        private Node next;
        private Node previous;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;

            
        }
       
    }
    private Node head;
    private Node tail;
    private int length;


    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }


    public boolean isEmpty(){
        return length == 0;
    }
   
    public void insertFirst(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            tail = newNode;
        }else{
            head.previous = newNode;
        }

        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertLast(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail= newNode;
        length++;
    }
       
    public void displayForward(){
        Node current = head;
        System.out.print("null--> ");
        while(current != null){
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.println("null");
        
    }
    public void displayBackwards(){
        Node current = tail;
        System.out.print("null<-- ");
        while(current != null){
            System.out.print(current.data + "<-- ");
            current = current.previous;
        }
        System.out.println("null");
        
    }

    public Node deleteFirst(){
        Node temp = head;
        if(head == null){
            return null;
        }
        if(head.next == null){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
            head.previous = null;
            temp.next = null;
            
           
        }
        length--;
        return head;
    }
    public Node deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException(); 
        }
        Node temp = tail;
        if(tail == head){
            tail = null;
            head = null;
        }
        else{
            tail = tail.previous;
            tail.next = null;
            temp.previous = null;
        }
        length--;
        return temp;

    }
    public static void main(String[] args) {
        
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(44);
        dll.insertLast(0);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(20);

        System.out.println("Displayed forward " );
        dll.displayForward();
        System.out.println("Displayed backwards");
        dll.displayBackwards();
        System.out.println("Length " + dll.length);
        System.out.println("isEmpty? "+dll.isEmpty());


        dll.deleteFirst();
        System.out.println("Displayed forward " );
        dll.displayForward();
        System.out.println("Displayed backwards");
        dll.displayBackwards();
        System.out.println("Length " + dll.length);
        System.out.println("isEmpty? "+dll.isEmpty());

        dll.deleteLast();
        System.out.println("Displayed forward " );
        dll.displayForward();
        System.out.println("Displayed backwards");
        dll.displayBackwards();
        System.out.println("Length " + dll.length);
        System.out.println("isEmpty? "+dll.isEmpty());




    }
}
