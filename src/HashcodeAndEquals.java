import java.util.*;

public class HashcodeAndEquals {
    public static void main(String[] args) {
        Map<Person, String> hm = new HashMap<>();
        Set<Person>  hs = new HashSet<>();
       /* hs.add("Hallo");
        hs.add("Hallo");*/

    /*    hm.put(1, "one");
        hm.put(1, "two");
        hs.add(1);
        hs.add(1);
        System.out.println(hm);
        System.out.println(hs);*/
        Person p1 = new Person(1, "Mike");
        Person p2 = new Person(1, "Ol");
//        Person p2 = new Person(2, "Katti");
        hm.put(p1, "123");
        hm.put(p2, "111");
        hs.add(p1);
        hs.add(p2);
        System.out.println(hm);
        System.out.println(hs);

    }
}
class Person{
    int id;
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}