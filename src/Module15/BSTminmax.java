package Module15;
import java.util.LinkedList;
import java.util.Queue;

// Binary Search Tree implementation with Min & Max
class Node4 {
    int data;
    Node4 left, right;

    // Constructor
    public Node4(int item) {
        data = item;
        left = right = null;
    }
}

class BSTminmax {
    Node4 root;

    // Insert a new node into BST
    Node4 insert(Node4 node, int value) {
        if (node == null) {
            return new Node4(value);
        }
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    // Find minimum value in BST
    int findMin(Node4 node) {
        if (node == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    // Find maximum value in BST
    int findMax(Node4 node) {
        if (node == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }

    public static void main(String[] args) {
        BSTminmax bst = new BSTminmax();

        // Insert elements
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);

        System.out.println("Minimum element in BST: " + bst.findMin(bst.root));
        System.out.println("Maximum element in BST: " + bst.findMax(bst.root));
    }
}
