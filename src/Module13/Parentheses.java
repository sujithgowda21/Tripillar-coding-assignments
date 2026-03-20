package Module13;

import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        String str = "{[()]}";
        Stack<Character> s = new Stack<>();

            for(char ch : str.toCharArray()){
                if(ch == '(' || ch == '{' || ch == '['){
                    s.push(ch);
                } else {
                    if(s.isEmpty()){
                        System.out.println("Not Balanced");
                        return;
                    }
                    s.pop();
                }
            }

            if(s.isEmpty())
                System.out.println("Balanced");
            else
                System.out.println("Not Balanced");
        }
    }

