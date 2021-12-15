import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArray {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        System.out.println(list);
        //System.out.println(list.get(0));
        // System.out.println(list.get(49));
        System.out.println(list.size());
        list.remove(5);
        for (int l = 0; l < list.size(); l++) {
            System.out.print(list.get(l) + " ");
        }
        System.out.println();
        for (Integer in : list) {
            System.out.print(in);
        }
    }
}
