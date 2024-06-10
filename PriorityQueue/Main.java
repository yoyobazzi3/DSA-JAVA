package PriorityQueue;
import java.util.*;
public class Main {
    public static void main(String[] args) {
      
        PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());// this reverses the elements in the queue
        queue.offer(3.0);
        queue.offer(4.3);
        queue.offer(5.1);
        queue.offer(4.2);
        queue.offer(8.4);

        //This also sorts the elements in the queue
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
