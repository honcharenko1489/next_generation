package multithreading;

public class Multi {
/*    public static void main(String[] args) throws InterruptedException {
*//*    MyThread mt = new MyThread();
    mt.start();
    Thread.sleep(1000);
    MyThread mt2 = new MyThread();
    mt2.start();*//*
        *//*System.out.println("I am going to  sleep");
      Thread.sleep(3000);
        System.out.println("I am weak");*//*
        Thread th = new Thread(new Runner());
        th.start();


        System.out.println("Hello from main  thread");
    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<1000; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from thread : "+i);
        }
    }
}
class MyThread extends Thread{
    public void run(){

        for (int i=0; i<1000; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from thread : "+i);
        }
    }*/
}
