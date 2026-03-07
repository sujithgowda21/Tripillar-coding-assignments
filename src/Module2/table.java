package Module2;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(n + "X" + i + "=" + n*i);
        }

    }
}
