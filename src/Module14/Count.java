package Module14;

class Node4 {
    int data;
    Node4 left, right;

    Node4(int value) {
        data = value;
        left = right = null;
    }
}

public class Count {

    // Function to count nodes
    public static int countNodes(Node4 root) {
        if (root == null) {
            return 0;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node4 root = new Node4(1);
        root.left = new Node4(2);
        root.right = new Node4(3);
        root.left.left = new Node4(4);
        root.left.right = new Node4(5);

        int totalNodes = countNodes(root);
        System.out.println("Total number of nodes: " + totalNodes);
    }
}
