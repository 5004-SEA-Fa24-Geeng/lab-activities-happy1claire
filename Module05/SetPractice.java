import java.util.HashSet;
import java.util.Set;


// Practice using sets in Java


public class SetPractice {


    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Alice");
        set.add("Bob");
        set.add("Carol");

        System.out.println(set);

        set.add("Alice"); // what will happen?

        System.out.println(set.contains("Alice"));


        // TODO: add Set<Person>, and see
        // how it behaves with both students and person.
        // Make sure to have a duplicate student or person
        Person p1 = new Person("Alice");
        Person p2 = new Student("Alice", 1);
        Person p3 = new Student("Alice", 2);
        Person p4 = new Student("Alice", 1); // same as p2?


        Set<Person> people = new HashSet<>();
        Person pp1 = new Person("Alice");
        Person pp2 = new Student("Alice", 1);
        Person pp3 = new Student("Alice", 2);

        people.add(new Person("Bob"));
        people.add(new Person("Carol"));
        people.add(pp1);
        people.add(pp2);
        people.add(pp3);

        people.stream().filter(p -> p.getName().equals("Alice")).forEach(System.out::println);
    }

}
