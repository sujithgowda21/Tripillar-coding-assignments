package Module15;
import java.util.LinkedList;
import java.util.Queue;
// Binary Search Tree implementation with Delete Operation
class Node3 {
    int data;
    Node3 left, right;

    // Constructor
    public Node3(int item) {
        data = item;
        left = right = null;
    }
}

class BSTDelete{
    Node3 root;

    // Insert a new node into BST
    Node3 insert(Node3 node, int value) {
        if (node == null) {
            return new Node3(value);
        }
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    // Inorder traversal (sorted order)
    void inorderTraversal(Node3 node) {
        if (node == null) return;
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    // Find minimum value node in a subtree
    Node3 findMin(Node3 node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Delete a node from BST
    Node3 delete(Node3 node, int key) {
        if (node == null) {
            return null;
        }

        // Traverse the tree
        if (key < node.data) {
            node.left = delete(node.left, key);
        } else if (key > node.data) {
            node.right = delete(node.right, key);
        } else {
            // Node found

            // Case 1: No child
            if (node.left == null && node.right == null) {
                return null;
            }

            // Case 2: One child
            else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // Case 3: Two children
            Node3 successor = findMin(node.right);
            node.data = successor.data;
            node.right = delete(node.right, successor.data);
        }
        return node;
    }

    public static void main(String[] args) {
        BSTDelete bst = new BSTDelete();

        // Insert elements
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);

        System.out.println("Inorder Traversal before deletion:");
        bst.inorderTraversal(bst.root);

        // Delete node
        System.out.println("\n\nDeleting 50...");
        bst.root = bst.delete(bst.root, 50);

        System.out.println("Inorder Traversal after deletion:");
        bst.inorderTraversal(bst.root);
    }
}
