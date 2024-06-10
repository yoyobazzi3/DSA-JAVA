package LinkedList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        LinkedList<String> linkedlist = new LinkedList<>();


        // linkedlist.push("A");
        // linkedlist.push("B");
        // linkedlist.push("C");
        // linkedlist.push("D");
        // linkedlist.push("E");
        // linkedlist.pop();
        //Acts like a stack

        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("E");
        // linkedlist.poll();

        linkedlist.add(4,"E");
        linkedlist.remove("E");

        System.out.println(linkedlist.peekFirst());
        System.out.println(linkedlist.peekLast());
        linkedlist.addFirst("F");
        linkedlist.addLast("W");
        String first = linkedlist.removeFirst();
        String last = linkedlist.removeLast();
        System.out.println(first);
        System.out.println(last);

        System.out.println(linkedlist);

    }
}
