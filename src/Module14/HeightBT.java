package Module14;

class Node3 {
    int data;
    Node3 left, right;

    Node3 (int value) {
        data = value;
        left = right = null;
    }
}

public class HeightBT {

    // Function to find height of binary tree
    public static int height(Node3 root) {
        if (root == null) {
            return -1; // return 0 if counting nodes instead of edges
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node3 root = new Node3(1);
        root.left = new Node3(2);
        root.right = new Node3(3);
        root.left.left = new Node3(4);
        root.left.right = new Node3(5);
        root.right.left=new Node3(6);
        root.right.right=new Node3(7);
        root.left.left.left=new Node3(8);
        root.left.left.right=new Node3(9);


        int h = height(root);
        System.out.println("Height of binary tree: " + h);
    }
}