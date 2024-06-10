package LinkedList;

public class SinglyLinkedList {

    Node head;

    private static class Node {
        private int data;// generic type can also be a string or anything
        private Node next;

        // create a constructor to be able to access this class
        public Node(int data) {
            this.data = data;
            this.next = null;// all the nodes have a next of null
        }
    }

    // Print the elemtents in the LinkedList
    public void display() {

        Node current = head;
        while (current != null) {
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public int countLinkedList() {
        if (head == null) {
            return 0;
        } else {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            newNode = head;
        } else {
            Node current = head;
            while (null != current.next) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insert(int value, int position) {
        Node newNode = new Node(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            Node temp = current.next;
            newNode.next = temp;
            current.next = newNode;
        }
    }

    public void deleteFirst() {
        Node temp = head.next;
        head.next = null;
        head = temp;
    }

    public Node deleteLast() {
        if (head == null || head.next == null) {
            return head;
        } else {
            Node current = head;
            Node temp = null;
            while (current.next != null) {
                temp = current;
                current = current.next;
            }
            temp.next = null;
            return current;
        }
    }

    public void delete(int position) {
        Node current = head;
        Node previous = head;
        Node after = head;
        if (position == 1) {
            current = head.next;
            head.next = null;
            head = current;
        }

        else {
            for (int i = 1; i < position; i++) {
                previous = current;
                current = current.next;
                after = current.next;
            }
            current.next = null;
            previous.next = after;
        }

    }

    public boolean find(int searchkey) {
        if (head == null) {
            return false;
        }
        Node current = head;
        while (current != null) {
            if (current.data == searchkey) {
                return true;
            }
            current = current.next;
        }
        return false;

    }

    public void reverseSinglyLinkedList() {
        if (head == null) {
            System.out.print(head);
        } else {
            Node current = head;
            Node previous = null;
            Node rev = null;

            while (current != null) {
                rev = current.next;
                current.next = previous;
                previous = current;
                current = rev;
            }
            head = previous;
        }
    }

    public void getFromLast(int position) {
        if (head == null) {
            System.out.println("There are no elements");
        }
        Node mainNode = head;
        Node refNode = head;
        int count = 0;
        int goal = 0;
        while (mainNode != null) {
            mainNode = mainNode.next;
            count++;
        }
        while (goal != count - position) {
            refNode = refNode.next;
            goal++;
        }
        System.out.println(refNode.data);
    }

    public void removeDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void insertSorted(int value) {
      
        Node current = head;
        Node temp = head;
        Node newNode = new Node(value);
       
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        temp.next = newNode;
        newNode.next = current;
    }
    public void deleteSorted(int value){
        Node current = head;
        Node temp = null;
        while(current != null && current.data <value){
            temp = current;
            current = current.next;
        }
        temp.next = current.next;
        current.next = null;
        System.out.println(current);
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        // all of these will be pointing to null in the beginnning.

        sll.head = new Node(10);
        Node second = new Node(1);
        Node third = new Node(8);
        Node fourth = new Node(11);

        // Now we will connect them together to form a chain
        sll.head.next = second; // 10--> 1
        second.next = third; // 10--> 1--> 8
        third.next = fourth; // 10--> 1--> 8--> 11--> null
        System.out.println("The first Linked List is ");
        sll.display();
        System.out.println();
        // Inserting at the beginning of the linkedList
        System.out.println("The List after inserting first: ");
        sll.insertFirst(4);
        sll.insertFirst(5);
        sll.insertFirst(9);
        sll.display();
        System.out.println("The size of the Linked List is: " + sll.countLinkedList());
        // inserting to the end of the LinkedList
        System.out.println();
        sll.insertLast(0);
        sll.insertLast(44);
        sll.insertLast(44);
        sll.insertLast(44);
        sll.insertLast(25);
        sll.insertLast(25);
        sll.display();
        System.out.println("The size of the Linked List is: " + sll.countLinkedList());
        System.out.println();

        sll.insert(17, 4);
        sll.display();
        System.out.println("After inserting to the middle of the LinkedList " + sll.countLinkedList());
        System.out.println();

        // sll.deleteFirst();
        sll.display();
        System.out.println("After deleting the first element " + sll.countLinkedList());
        System.out.println();

        // sll.deleteLast();
        sll.display();
        System.out.println("After deleting the last element " + sll.countLinkedList());
        System.out.println();

        // sll.delete(4);
        // sll.delete(7);
        // sll.delete(6);
        sll.display();
        System.out.println("After deleting an element at a given position " + sll.countLinkedList());

        System.out.println();

        if (sll.find(8)) {
            System.out.println("Search Key found");
        } else {
            System.out.println("Search key not found");
        }
        System.out.println();
        sll.reverseSinglyLinkedList();
        sll.display();

        System.out.println(sll.countLinkedList());
        System.out.println();
        sll.getFromLast(5);
        System.out.println();
        sll.insertSorted(26);
        sll.insertSorted(50);
        sll.insertSorted(27);
        sll.removeDuplicates();
        sll.display();
        sll.deleteSorted(26);
        sll.deleteSorted(44);
        sll.display();
    }
}
