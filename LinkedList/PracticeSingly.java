package LinkedList;

public class PracticeSingly {
    private Node head;

    private static class Node{
        private int data;// can also be double, String, any data value
        private Node next; 

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "--> " );
            current = current.next;
        }
        System.out.print("null");
    }

    public void addFirst(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        


    }
    
    public static void main(String[] args) {
        PracticeSingly ps = new PracticeSingly();
       
        ps.head = new Node(22);
        Node second = new Node(10);
        Node third = new Node(24) ;
        Node fourth = new Node (30);
        ps.head.next = second;
        second.next = third;
        third.next = fourth;

        ps.print();

        System.out.println();
        ps.addFirst(30);
        ps.print();
    }

}
