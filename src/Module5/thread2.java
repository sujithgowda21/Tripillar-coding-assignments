package Module5;
class MyTask implements Runnable{
    //  @Override
    public void run() {
        for (int i=0; i<=9; i++) {
            System.out.println("Thread is Running...");
        }

    }
}
public class thread2 {
    public static void main(String[] args) {
        MyTask obj=new MyTask();
        Thread t1=new Thread(obj);
        t1.start();

        for (int i=0; i<=9; i++){
            System.out.println("Main Thread is Running... ");
        }
    }
}
