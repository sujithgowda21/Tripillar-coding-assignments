package Module3;

import java.util.Scanner;

public class checknumber {
    static void checkNumber(int num) {
        if(num > 0) {
            System.out.println("Positive number");
        }
        else if(num < 0) {
            System.out.println("Negative number");
        }
        else {
            System.out.println("Zero");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        checkNumber(num);
    }
}
