
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

// yes we used all the above in the solution. You
// may not use them all, that is fine.


/**
 * a few java syntax items to help you out. Depending on how you do it, you may not need them
 * 
 * /
 * 
 * /* String[] parts = line.split("\\s+"); // split by whitespace String student = parts[0]; String
 * course = parts[1];
 */

/**
 * Set.of() creates an immutable set!, So if you want it mutable.
 * 
 * You will need to use a HashSet
 * 
 * Set<String> courses = new HashSet<>();
 * 
 * courses.add(course);
 * 
 * students.put(student, courses);
 */

/*
 * Using a stream to take a list and make it a string of "value value value"
 * 
 * 
 * students.get(student).stream().collect(Collectors.joining(" ")) - This one may be easier to do as
 * a separate loop, but feel free to play with this one.
 *
 */

public class StudentLoader {
    private static HashMap<String, Set<String>> students = new HashMap<>();


    public static void main(String[] args) {
        students.put("Apple", Set.of("CS5001", "CS5002"));
        students.put("Banana", Set.of("CS5004", "CS5008"));

        try {
            List<String> coursesList = students.entrySet().stream().map(x -> x.getKey() + " takes " + x.getValue()).toList();
            Files.write(Path.of("courses.txt"), coursesList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // todo: write a program that reads
    // the courses.txt file, and links
    // all classes with the String (name) of the student
    // outputs then will be "person has completed class1 class2 etc"
    // for each student

}
