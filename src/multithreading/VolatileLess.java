package multithreading;

import java.util.Scanner;

public class VolatileLess {
    public static void main(String[] args) {
        MyThread1 my1 = new MyThread1();
        my1.start();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        my1.shutdown();

    }
}

class MyThread1 extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}