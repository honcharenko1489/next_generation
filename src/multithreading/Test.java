package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    private int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        //Test test = new Test();
        new Workers().main();
        // test.doubleWork();


    }

    static class Workers {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Random random = new Random();
        private List<Integer> list1 = new ArrayList<>();
        private List<Integer> list2 = new ArrayList<>();

        public void addToList1() {
            synchronized (lock1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list1.add(random.nextInt(100));
            }
        }


        public void addToList2() {
            synchronized (lock2) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list2.add(random.nextInt(100));
            }
        }


        public void work() {
            for (int i = 0; i < 1000; i++) {
                addToList1();
                addToList2();
            }
        }

        public void main() {
            long before = System.currentTimeMillis();
//            work();
            Thread th1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    work();
                }
            });
            Thread th2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    work();
                }
            });
            th1.start();
            th2.start();
            try {
                th1.join();
                th2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long after = System.currentTimeMillis();
            System.out.println("Program took " + (after - before) + " second");
            System.out.println("List1 :" + list1.size());
            System.out.println("List1 :" + list2.size());
        }
    }
/*    public void increment() {
        synchronized (this) {
            counter++;
        }

    }

    public void doubleWork() throws InterruptedException {
        Thread thread911 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment();
            }
        });

        Thread thread912 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment();
            }
        });
        thread911.start();
        thread912.start();
        thread911.join();
        thread912.join();
        System.out.println(counter);
    }*/


}
