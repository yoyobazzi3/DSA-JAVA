package Stack;

/*
 * Stack is LIFO last in first out
 * push() adds objects to the top of the stack
 * pop() removes the first element in the stack
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(4);
        stack.push(14);
        stack.push(23);
        stack.push(22);
        stack.push(88);


        stack.pop();
        stack.pop();
        int j = stack.pop();// remove it and assign it to a different value

        System.out.println(stack.search(33));
        System.out.println(j);
        System.out.println(stack);
        System.out.println(stack.isEmpty());

    }

}