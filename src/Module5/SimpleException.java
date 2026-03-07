package Module5;

import java.util.Scanner;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}
public class SimpleException {
    public static void main(String[] args) {
        try {
            int age ;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the age");
            age=sc.nextInt();
            if (age > 18) {
                System.out.println("Eligible to vote");
            }
            else {
                throw new MyException("Not eligible to vote");
            }
        }
        catch (MyException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
