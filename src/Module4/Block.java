package Module4;

public class Block {
    static int num;

    // Static block
    static {
        num = 100;
        System.out.println("Static Block Executed");
    }

    public static void main(String[] args) {
        System.out.println("Main Block Executed");
    }
}
