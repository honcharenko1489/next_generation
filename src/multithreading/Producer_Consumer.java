package multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer_Consumer {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                produce();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void produce() {
        Random random = new Random();
        while (true) {
            queue.offer(random.nextInt(100));
        }
    }

    private static void consumer() throws InterruptedException {
        Random rnd = new Random();
        while (true) {
            Thread.sleep(100);
            if (rnd.nextInt(10) == 5) {
                System.out.println(queue.take());
                System.out.println("Q size is : " + queue.size());
            }
        }
    }
}
