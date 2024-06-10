package LinkedList;

public class SortTwoSinglyLinkedLists {

    private Node head;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void singlyLinkedList1() {
        Node first = new Node(1);
        Node second = new Node(3);
        Node third = new Node(6);

        head = first;  // Corrected this line
        first.next = second;
        second.next = third;
    }

    public void singlyLinkedList2() {
        Node first = new Node(2);
        Node second = new Node(4);
        Node third = new Node(5);

        head = first;
        first.next = second;
        second.next = third;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    } 
    public static Node merge(Node a, Node b){
        Node dummy = new Node(0);
        Node temp = dummy;
        while(a!= null && b != null){
        if(a.data<=b.data){
            temp.next = a;
            a = a.next;
        } else{
            temp.next = b;
            b = b.next;
        }
        temp = temp.next;
    }

    if(a == null){
        temp.next = b;
    }else{
        temp.next = a;
    }
        return dummy.next;
    
    }
    public void addTwoSinglyLinkedLists(){
        
    }
    public static void main(String[] args) {
        SortTwoSinglyLinkedLists sll1 = new SortTwoSinglyLinkedLists(); 
        sll1.singlyLinkedList1();
        sll1.display();
        System.out.println();
        SortTwoSinglyLinkedLists sll2 = new SortTwoSinglyLinkedLists();
        sll2.singlyLinkedList2();
        sll2.display();
        System.out.println();
        SortTwoSinglyLinkedLists sort = new SortTwoSinglyLinkedLists();
        sort.head = merge(sll1.head, sll2.head);
        sort.display();
    }
}
