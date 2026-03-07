package Module5;

class MyTHread extends Thread {

    public void run() {
        System.out.println("Thread is running...");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Thread finished execution.");
    }
}

public class LifeCycle {
    public static void main(String[] args) {

        MyTHread t1 = new MyTHread();

        System.out.println("State after creation: " + t1.getState());

        t1.start();

        System.out.println("State after start(): " + t1.getState());

        try {
            t1.join();
        } catch (Exception e) {}

        System.out.println("State after completion: " + t1.getState());
    }
}
