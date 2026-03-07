package Module5;

class NumberPrinter {
    int num = 1;
    int max = 10;

    synchronized void printOdd() {
        while (num <= max) {
            if (num % 2 == 0) {
                try {
                    wait();
                } catch (Exception e) {}
            } else {
                System.out.println("Odd Thread: " + num);
                num++;
                notify();
            }
        }
    }

    synchronized void printEven() {
        while (num <= max) {
            if (num % 2 == 1) {
                try {
                    wait();
                } catch (Exception e) {}
            } else {
                System.out.println("Even Thread: " + num);
                num++;
                notify();
            }
        }
    }
}

class OddThread extends Thread {
    NumberPrinter np;

    OddThread(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printOdd();
    }
}

class EvenThread extends Thread {
    NumberPrinter np;

    EvenThread(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printEven();
    }
}
public class ThreadAlternative {
    public static void main(String[] args) {

        NumberPrinter np = new NumberPrinter();

        OddThread t1 = new OddThread(np);
        EvenThread t2 = new EvenThread(np);

        t1.start();
        t2.start();
    }
}
