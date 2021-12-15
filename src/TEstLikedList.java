import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TEstLikedList {
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        ml.add(1);
        ml.add(2);
        ml.add(10);
        System.out.println(ml);
        System.out.println(ml.get(0));
        System.out.println(ml.get(2));
//        System.out.println(ml.get(10));
        ml.remove(1);
        ml.remove(1 );
        System.out.println(ml);
        /*List<Integer> ls = new LinkedList<>();
        List<Integer> al = new ArrayList<>();
        System.out.println();
        measureTime(ls);
        measureTime(al);

    }

    public static void measureTime(List<Integer> lol) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000_00; i++) {
            lol.add(0, i);
        }

        long finish = System.currentTimeMillis();
        System.out.println(finish - start);*/

    }
}
