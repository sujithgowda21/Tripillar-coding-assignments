package Module13;

public class Queue {

    int[] arr;
    int front, rear;

    Queue(int size){
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int val){
        if(rear == arr.length - 1){
            System.out.println("Overflow");
            return;
        }
        arr[++rear] = val;
    }

    int dequeue(){
        if(front > rear){
            System.out.println("Underflow");
            return -1;
        }
        return arr[front++];
    }

    void display(){
        for(int i = front; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();
    }
}