import java.util.*;

public class SetLesson {
    public static void main(String[] args) {
     /*   Set<String>  ht = new HashSet<>();
        Set<String> ls = new LinkedHashSet<>();
        Set<String> ts = new TreeSet<>();
        ht.add("Albert");
        ht.add("Roman");
        ht.add("Alisa");
        ht.add("Bob");
        ht.add("Bob");
        ht.add("Bob");
        ht.add("Marta");*/
       /* for (String name: ht) {
            System.out.println(name);
        }
        System.out.println(ht.contains("Marta"));*/

        //union
        Set<Integer> hashSat = new HashSet<>();
        hashSat.add(0);
        hashSat.add(1);
        hashSat.add(2);
        hashSat.add(3);
        hashSat.add(4);
        hashSat.add(5);
        hashSat.add(6);
        Set<Integer> hashSat1 = new HashSet<>();
        hashSat1.add(3);
        hashSat1.add(4);
        hashSat1.add(5);
        hashSat1.add(6);
        hashSat1.add(7);
        hashSat1.add(8);
//        System.out.println(hashSat.addAll(hashSat1));
        Set<Integer> union = new HashSet<>(hashSat);
        union.addAll(hashSat1);
        System.out.println(union);

        //intersection
        Set<Integer> intersection = new HashSet<>(hashSat);
        intersection.retainAll(hashSat1);
        System.out.println(intersection );
        //difference
        Set<Integer> diff = new HashSet<>(hashSat);
        diff.removeAll(hashSat1);
        System.out.println(diff);
    }
}
