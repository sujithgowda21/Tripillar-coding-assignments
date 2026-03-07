package Module4;

public class Garbage {
    public void finalize() {
        System.out.println("Garbage collection");
    }
    public static void main(String[] args) {
       for (int i = 0; i < 3; i++) {
            Garbage obj = new Garbage();

        }
        System.gc();
    }
}
