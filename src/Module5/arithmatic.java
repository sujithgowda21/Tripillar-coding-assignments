package Module5;

public class arithmatic {
    public static void main(String[] args) {
        int i = 5, j = 0, k = 0;
        try {
            k = i / j;
            System.out.println(k);

        } catch (ArithmeticException e) {
            System.out.println(" you cant divide anything by zero");
        }
    }
}