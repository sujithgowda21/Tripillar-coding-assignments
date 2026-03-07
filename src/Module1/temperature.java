package Module1;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the temperature in celsius: ");
        double cel= sc.nextDouble();
        double far=(cel*1.8)+32;
        System.out.println(" The temperature in Fahrenheit: " + far);
    }
}
