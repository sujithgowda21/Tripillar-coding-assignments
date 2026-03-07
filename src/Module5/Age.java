package Module5;

import java.util.Scanner;

public class Age {
    static void checkAge() {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        age = sc.nextInt();
        if (age <= 18) {
            System.out.println(" Age is less than 18 ");
        } else {
            throw new RuntimeException(" Age is greater than 18");
        }
    }
    public static void main(String[] args) {
        checkAge();
        checkAge();
    }
}

