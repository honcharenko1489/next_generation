package multithreading;

import java.util.Scanner;

public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wnf = new WaitAndNotify();
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wnf.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wnf.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thr1.start();
        thr2.start();
        thr1.join();
        thr2.join();
    }
}

class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("producer thread started...");
            wait();
                wait(1000);
            System.out.println("producer thread resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner sc = new Scanner(System.in);
        synchronized (this){
            System.out.println("waiting for return key pressed");
            sc.nextLine();
            notify();
            Thread.sleep(5000);
        }
    }
}