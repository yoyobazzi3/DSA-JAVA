package LinkedList;

public class LeetCode2 {
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

    public void firstL() {
        Node first = new Node(7);
        Node second = new Node(4);
        Node third = new Node(9);
        head = first;
        head.next = second;
        second.next = third;
    }

    public void secondL() {
        Node first = new Node(5);
        Node second = new Node(6);

        head = first;
        head.next = second;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "--> ");
            current = current.next;

        }
        System.out.print("null");
    }

    public Node add(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;
        int carry = 0;
        while (a != null || b != null) {
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = x + y + carry;
            carry = sum / 10;

            tail.next = new Node(sum % 10);
            tail = tail.next;
            if(a!= null){a = a.next;}
            if(b!= null){b = b.next;}
        }
        if (carry > 0) {
            tail.next = new Node(carry);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        LeetCode2 sll1 = new LeetCode2();
        sll1.firstL();
        sll1.display();

        System.out.println();
        LeetCode2 sll2 = new LeetCode2();
        sll2.secondL();
        sll2.display();
System.out.println();
        LeetCode2 result = new LeetCode2();
        result.head = sll1.add(sll1.head, sll2.head);
        System.out.print("Result List: ");
        result.display();
    }
}
