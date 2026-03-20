package Module13;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        Stack<Integer> temp = new Stack<>();

        while(!s.isEmpty()){
            temp.push(s.pop());
        }

        System.out.println(temp);
    }

}
