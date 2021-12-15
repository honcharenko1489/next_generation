import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackCl {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        Iterator<Integer> iterator = l.iterator();
        int idx = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (idx == 1) {
                iterator.remove();
            }
            idx++;
        }
        System.out.println(l);

        /*        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(3);
        st.push(1);
        *//*System.out.println(st.peek());
        System.out.println(st.pop());*//*
//        System.out.println(st.empty());
        while (!st.empty()){
            System.out.println(st.pop());
        }*/
    }
}
