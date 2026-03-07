package Module2;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        long num = sc.nextLong();
        long fact=1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
            System.out.println(fact);
        }
    }
}

