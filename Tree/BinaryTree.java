package Tree;

import java.util.NoSuchElementException;
import java.util.Stack;

public class BinaryTree {

    private TreeNode root;

    private static class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;// root ---> first;
        first.left = second;
        first.right = third;// second <--- first ---> third
        second.left = fourth;
        second.right = fifth;

    }

    public void preOrderRec(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderRec(root.left);
        preOrderRec(root.right);
    }

    public void preOrder() {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);

            }
        }
    }

    public void inOrderRec(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderRec(root.left);
        System.out.print(root.data + " ");
        inOrderRec(root.right);

    }

    public void inOrder() {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
         TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            }
            else{
                current = stack.pop();
                System.out.print(current.data + " ");
                current = current.right;
            }
        }
    }

    public void postOrder(){
        if(root == null){
            return ;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while(!stack.isEmpty() || current != null){
            stack.push(current);
            if(current != null){
                current = current.left;
                stack.push(current);
            }else{
                current = stack.pop();
                System.out.print(current.data + " ");
                current = stack.peek();
                current = current.right;
                
                System.out.println(current.data);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        System.out.println("The preOrderRec of the tree is: ");
        bt.preOrderRec(bt.root);
        System.out.println();

        bt.createBinaryTree();
        System.out.println("The preOrder Iteratively is: ");
        bt.preOrder();
        System.out.println();
        bt.createBinaryTree();
        System.out.println("InOrder recursively is: ");
        bt.inOrderRec(bt.root);
        System.out.println();

        bt.createBinaryTree();
        System.out.println("Print the in order Iteratively");
        bt.inOrder();
        System.out.println();

    }
}
