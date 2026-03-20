package Module13;

public class Stack {

    int[] arr;
    int top;

    Stack(int size){
        arr = new int[size];
        top = -1;
    }

    void push(int val){
        if(top == arr.length - 1){
            System.out.println("Overflow");
            return;
        }
        arr[++top] = val;
    }

    int pop(){
        if(top == -1){
            System.out.println("Underflow");
            return -1;
        }
        return arr[top--];
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();   // 30 20 10

        s.pop();

        s.display();   // 20 10
    }
}