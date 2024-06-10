package Stack;

import java.util.Stack;

public class StackArray {
    private int top;
    private int[] arr;

    public StackArray(int capacity) {
        top = -1;
        arr = new int[capacity];
    }

    public StackArray() {
        // if we do not provide any capacity it is 10 by default
        this(10);
    }

    public void push(int value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full!!!");
        }
        top++;
        arr[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new StackOverflowError();
        }
        int result = arr[top];
        top--;
        return result;
    }

    public boolean isFull() {
        return arr.length == size();
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return top < 0;
    }

    // public int[] nextGreaterElement(int arr[]) {
    // Stack<Integer> stack = new Stack<>();
    // int[] result = new int[arr.length];
    // for (int i = arr.length - 1; i >= 0; i--) {
    // while (!stack.isEmpty() && stack.peek() <= arr[i]) {
    // stack.pop();
    // }
    // if (stack.isEmpty()) {
    // result[i] = -1;
    // } else {
    // result[i] = stack.peek();
    // }
    // stack.push(arr[i]);
    // }
    // return result;
    // }

    public int[] nextGreaterElement(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else if (stack.peek() > arr[i]) {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if ((c == ')' && top == '(') ||
                    (c == ']' && top == '[') ||
                    (c == '}' && top == '{')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray();
        int[] arr = { 4, 7, 3, 4, 8, 1 };

        System.out.println("Stack size: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());

        int[] nextGreater = stack.nextGreaterElement(arr);
        System.out.print("Next greater elements: ");
        for (int val : nextGreater) {
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println(stack.isValid("{([])}"));
    }
}
