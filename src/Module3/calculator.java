package Module3;

public class calculator {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Addition: " + sum);
    }
    void subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
    }

    public static void main(String[] args) {
        calculator c = new calculator();

        c.add(10, 5);
        c.subtract(10, 5);
    }
}
