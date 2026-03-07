package Module2;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter The Year: ");
        int year= sc.nextInt();
        if (year%4==0 /*|| year%400==0*/){
            System.out.println("The Year Is a Leap Year");
        }else{
            System.out.println("The Year Is not a Leap Year");
        }

    }
}
