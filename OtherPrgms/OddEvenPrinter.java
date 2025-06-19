import java.util.*;

public class OddEvenPrinter {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter the upper limit: ");
        int N = in.nextInt();
        // System.out.println();
        var printer = new Printer(N);

        Thread evenPrinter = new Thread(() -> {
            try {
                printer.printEven(); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "EvenPrinterThread");

        Thread oddPrinter = new Thread(() -> {
            try {
                printer.printOdd(); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "OddPrinterThread");

        evenPrinter.start();
        oddPrinter.start();

        evenPrinter.join();
        oddPrinter.join();
    }
}

class Printer {
    private int i = 1;
    private final int n;

    Printer(int n) {
        this.n = n;
    }

    public void printEven() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (i % 2 != 0) {
                    if (i > n) return;
                    wait();
                }
                if (i > n) return;
                System.out.println(Thread.currentThread().getName() + " prints: " + i);
                i++;
                notifyAll();
            }
        }
    }

    public void printOdd() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (i % 2 == 0) {
                    if (i > n) return;
                    wait();
                }
                if (i > n) return;
                System.out.println(Thread.currentThread().getName() + " prints: " + i);
                i++;
                notifyAll();
            }
        }
    }
}
