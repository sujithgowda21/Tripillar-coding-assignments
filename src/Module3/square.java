package Module3;

public class square {
    static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = square(number);
        System.out.println("Square of " + number + " is: " + result);
    }
}
