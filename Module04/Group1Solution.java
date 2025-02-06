import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Group1Solution {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // this function is a quick way to build a list
        List<Integer> evens2 = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evens2);

        // Reduce
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        // Map
        List<Integer> integers1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squared = integers1.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squared);

        // Map for books
        List<String> bookStrings = Arrays.asList("The Great Gatsby,F. Scott Fitzgerald,1925",
                "To Kill a Mockingbird,Harper Lee,1960",
                "1984,George Orwell,1949",
                "The Catcher in the Rye,J.D. Salinger,1951",
                "Beloved,Toni Morrison,1987");
        List<Book> books = bookStrings.stream().map(Book::createFromString).collect(Collectors.toList());
        System.out.println(books);

        // Sorting
        List<Integer> unsorted = Arrays.asList(5, 3, 1, 2, 4);
        List<Integer> sorted = unsorted.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        //Practice: filter out books published before 1950 and sorted by ascending order
        List<String> bookStringsPractice = Arrays.asList("The Great Gatsby,F. Scott Fitzgerald,1925",
                "To Kill a Mockingbird,Harper Lee,1960",
                "1984,George Orwell,1949",
                "The Catcher in the Rye,J.D. Salinger,1951",
                "Beloved,Toni Morrison,1987");

        List<Book> books_practice = bookStringsPractice.stream()
                .map(Book::createFromString)
                .filter(book -> book.getYear() < 1950)
                .sorted(Comparator.comparing(Book::getYear))
                .collect(Collectors.toList());
        System.out.println(books_practice);

    }
}
