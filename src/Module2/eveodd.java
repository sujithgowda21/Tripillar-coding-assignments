package Module2;

import java.util.Scanner;

public class eveodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the Number");
        int n= sc.nextInt();
        if ( n % 2 == 0 ) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

        }
    }


