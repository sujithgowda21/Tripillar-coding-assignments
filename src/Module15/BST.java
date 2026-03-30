package Module15;
import java.util.LinkedList;
import java.util.Queue;
class Node {
    int data;
    Node left, right;

    // Constructor
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BST {
    Node root;
    Node insert(Node node, int value) {
        // If tree is empty, create a new node
        if (node == null) {
            return new Node(value);
        }

        // Recur down the tree
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        }

        // Return unchanged node pointer
        return node;
    }

    // Inorder traversal to display sorted order
    void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        BST bst = new BST();

        // Insert elements
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);

        System.out.println("Inorder Traversal of BST (sorted order):");
        bst.inorderTraversal(bst.root);
    }
}

