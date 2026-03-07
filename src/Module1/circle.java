package Module1;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        double A, r;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter The Radius : ");
        r= sc.nextDouble();
        A=3.14*(r*r);
        System.out.println(" Area Of Circle is : "+ A);
    }
}
