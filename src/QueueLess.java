import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueLess {
    public static void main(String[] args) {
        Personych per1 = new Personych(1);
        Personych per2 = new Personych(2);
        Personych per3 = new Personych(3);
        Personych per4 = new Personych(4);
        Queue<Personych> qp = new ArrayBlockingQueue<Personych>(3);
        System.out.println(qp.offer(per3));
        System.out.println(qp.offer(per2));
        System.out.println(qp.offer(per4));
        System.out.println(qp.offer(per1));
        System.out.println(qp);
       /* System.out.println(qp.remove());
        System.out.println(qp.peek());
        System.out.println(qp);*/
        /*for (Personych  pepe: qp) {
            System.out.println(pepe);
        }*/
    }
}
