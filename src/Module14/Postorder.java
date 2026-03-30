package Module14;

import java.util.LinkedList;
import java.util.Queue;

class Node2{
    int key;
    Node2 left;
    Node2 right;

    Node2 (int key){
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

public class Postorder {
    Node2 root;
    Postorder(){
        root = null;
    }

    private Node2 insertRec(Node2 root, int key){
        if(root == null){
            return new Node2(key);
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

    private boolean searchRec(Node2 root, int key){
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

    private Node2 findSuccessor(Node2 node){
        while(node.left!=null){
            node = node.left;
        }
        return node;
    }

    private Node2 removeRec(Node2 root, int key){
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
            Node2 successor = findSuccessor(root.right);
            root.key = successor.key;
            root.right = removeRec(root.right, successor.key);

        }
        return root;
    }

    public void remove(int key){
        root = removeRec(root, key);
    }

    void DFS(Node2 root){
        if(root==null){
            return ;
        }


        DFS(root.left);
        DFS(root.right);
        System.out.print(root.key + " ");
    }

    void BFS(){
        Queue<Node2> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node2 temp = q.poll();
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

class Driver2{
    public static void main(String[] args) {
        Postorder bst = new Postorder();
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
        System.out.println("DFS PostOrder Traversal");
        bst.DFS(bst.root);

        int key = 1;
        System.out.println(bst.search(key));

    }
}
