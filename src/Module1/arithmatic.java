package Module1;

import java.util.Scanner;

public class arithmatic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Num 1: ");
        double num1= sc.nextInt();
        System.out.println(" Num 2: ");
        double num2= sc.nextInt();
        double add=num1+num2;
        double sub=num1-num2;
        double mul=num1*num2;
        double div=num1/num2;
        System.out.println(" Addition : "+ add);
        System.out.println(" Subtraction : "+ sub);
        System.out.println(" Multiplication : "+ mul);
        System.out.println(" Division : "+ div);

    }
}
