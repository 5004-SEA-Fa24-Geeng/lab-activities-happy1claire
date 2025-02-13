import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Apple", 3.5);
        map.put("Banana", 2.0);
        map.put("Cherry", 4.0);

        // let's print the map

        System.out.println(map);

        // what happens if we add a duplicate key?
        // your code here


        // now try it with Person/Student. We will
        // use the person or student as a key and the
        // value will be a set of classes they are taking

        Map<Person, Set<String>> classes = new HashMap<>();
        Person p1 = new Student("Super", 1);
        Person p2 = new Student("Apple", 2);

        classes.put(p1, Set.of("CS5001", "CS5002"));
        classes.put(p2, Set.of("CS5001", "CS5002"));

        System.out.println(classes);

        // you will find Set.of() useful here
        // for example:

        Map<String, Double> food = new HashMap<>();

        food.put("Apple", 3.5);
        food.put("Banana", 2.0);
        food.put("Cherry", 4.0);


        food.entrySet().stream().map(x -> x.getKey() + " costs " + x.getValue())
                .forEach(System.out::println);

        System.out.println("Food that costs more than 3.0");

        food.entrySet().stream().filter(x -> x.getValue() > 3.0)
                .map(x -> x.getKey() + " costs " + x.getValue())
                .forEach(System.out::println);

    }

}
