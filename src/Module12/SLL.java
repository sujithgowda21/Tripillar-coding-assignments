package Module12;
class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SLL {
    Node head;

    // 1. Insert at beginning
    void insertAtBeginning(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    // 2. Insert at end
    void insertAtEnd(int val){
        Node n = new Node(val);

        if(head == null){
            head = n;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
    }

    // 3. Delete node by value
    void delete(int val){
        if(head == null) return;

        if(head.data == val){
            head = head.next;
            return;
        }

        Node temp = head;
        while(temp.next != null && temp.next.data != val){
            temp = temp.next;
        }

        if(temp.next != null){
            temp.next = temp.next.next;
        }
    }

    // 4. Count nodes
    int count(){
        int c = 0;
        Node temp = head;

        while(temp != null){
            c++;
            temp = temp.next;
        }
        return c;
    }

    // 5. Display list
    void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SLL sll = new SLL();

        sll.insertAtBeginning(10);
        sll.insertAtBeginning(5);
        sll.display();

        sll.insertAtEnd(20);
        sll.insertAtEnd(30);
        sll.display();

        sll.delete(20);
        sll.display();

        System.out.println("Count: " + sll.count());
    }
}