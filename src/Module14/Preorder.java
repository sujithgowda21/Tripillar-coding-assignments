package Module14;

import java.util.LinkedList;
import java.util.Queue;

class Node1{
    int key;
    Node1 left;
    Node1 right;

    Node1 (int key){
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

public class Preorder {
    Node1 root;
    Preorder(){
        root = null;
    }

    private Node1 insertRec(Node1 root, int key){
        if(root == null){
            return new Node1(key);
        }

        if(key < root.key){
            root.left = insertRec(root.left, key);
        }else if(key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    private boolean searchRec(Node1 root, int key){
        if(root==null){
            return false;
        }
        if(key==root.key){
            return true;
        }
        if(key<root.key){
            return searchRec(root.left, key);
        }
        else{
            return searchRec(root.right, key);
        }
    }

    public boolean search(int key){
        return searchRec(root, key);
    }

    private Node1 findSuccessor(Node1 node){
        while(node.left!=null){
            node = node.left;
        }
        return node;
    }

    private Node1 removeRec(Node1 root, int key){
        if(root==null){
            return null;
        }
        if(key < root.key){
            root.left = removeRec(root.left, key);
        }else if(key > root.key){
            root.right = removeRec(root.right, key);
        }else{
            // you found the target to be deleted!
            // Case 1 - Node with 0 or 1 child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            // Case 2 - Node with 2 children
            Node1 successor = findSuccessor(root.right);
            root.key = successor.key;
            root.right = removeRec(root.right, successor.key);

        }
        return root;
    }

    public void remove(int key){
        root = removeRec(root, key);
    }

    void DFS(Node1 root){
        if(root==null){
            return ;
        }

        System.out.print(root.key + " ");
        DFS(root.left);
        DFS(root.right);
    }

    void BFS(){
        Queue<Node1> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node1 temp = q.poll();
            System.out.print(temp.key + " ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }

    }
}

class Driver1{
    public static void main(String[] args) {
        Preorder bst = new Preorder();
        bst.insert(100);
        bst.insert(50);
        bst.insert(180);
        bst.insert(30);
        bst.insert(80);
        bst.insert(60);
        bst.insert(150);
        bst.insert(200);
        bst.insert(120);
        bst.insert(170);

        System.out.println("BFS Traversal: ");
        bst.BFS();
        System.out.println();
        System.out.println("DFS PreOrder Traversal");
        bst.DFS(bst.root);

        int key = 1;
        System.out.println(bst.search(key));

    }
}
