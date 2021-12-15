import java.util.*;

public class ComparatorLess {
    public static void main(String[] args) {
       /* List<String> animal = new ArrayList<>();
        animal.add("cat");
        animal.add("dog");
        animal.add("bird");
        animal.add("frog");
        animal.add("elephant");
        Collections.sort(animal);
        System.out.println(animal);
        Collections.sort(animal, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return 1;
                } else if (o1.length() > o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(animal);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(9);
        numbers.add(6);
        numbers.add(4);
       *//* Collections.sort(numbers);
        System.out.println(numbers);*//*
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return 1;
                } else if (o1 > o2) {
                    return -1;
                } else {
                    return 0;
                }

            }
        });
        System.out.println(numbers);
        //------------------------------------
        List<Person> lili = new ArrayList<>();
        lili.add(new Person(2, "Lom"));
        lili.add(new Person(4, "Tamara"));
        lili.add(new Person(2, "Li"));
        lili.add(new Person(1, "Artur"));
        Collections.sort(lili, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.id < o2.id) {
                    return -1;
                } else if (o1.id > o2.id) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println((lili));
        Collections.sort(lili, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.name.length() > o2.name.length()) {
                    return 1;
                } else if (o1.name.length() < o2.name.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(lili);*/
        List<Piperson> people = new ArrayList<>();
        Set<Piperson> treep= new TreeSet<>();
        addElement(people);
        addElement(treep);


        Collections.sort(people);
//      Collections.sort(treep);
        System.out.println(people);
        System.out.println(treep);
    }


    private static void addElement(Collection collection) {
        collection.add(new Piperson(2, "Katia"));
        collection.add(new Piperson(1, "Travolta"));
        collection.add(new Piperson(3, "Kill"));
        collection.add(new Piperson(83, "Ok"));
    }
}

class Piperson implements Comparable<Piperson> {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piperson piperson = (Piperson) o;
        return id == piperson.id && Objects.equals(name, piperson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Piperson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Piperson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;

    @Override
    public int compareTo(Piperson o) {
        if (this.name.length()>o.getId()){
            return 1;
        }else if (this.name.length()<getId()){
            return -1;
        }else {
            return 0;
        }
    }
}
/*class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}*/

/*
class BackWordsComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return 1;
        } else if (o1 > o2) {
            return -1;
        } else {
            return 0;
        }
    }

*/
/*    @Override
    public Comparator<Integer> reversed() {
        return Comparator.super.reversed();
    }*//*

}*/
