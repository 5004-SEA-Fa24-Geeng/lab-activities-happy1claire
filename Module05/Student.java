import java.util.Objects;

/** feel free to use this template as a starting point. */

public class Student extends Person {
    private int id;

    public Student(String theName, int id) {
        super(theName);
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals (Object other) {
        if (other == null) {
            return false;
        }

        if (other.getClass() != this.getClass()) {
            return false;
        }

        Student otherStudent = (Student) other;

        return otherStudent.getId() == this.getId() && Objects.equals(otherStudent.getName(), this.getName());
    }

//    @Override
//    public int hashCode() {
//        int hash = id;
//        for (int i = 0; i < this.getName().length(); i++) {
//            hash += this.getName().charAt(i);
//        }
//        return hash;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), id);
    }


    @Override
    public String toString() {
        return "StudentSolution{" + "name='" + this.getName() + '\'' + ", id=" + this.getId() + '}';
    }

    public static void main(String[] args) {
        int value = 10;
        Person e1 = new Student("Alice", 1);
        Person e2 = new Student("Bob", 2);
        Person e3 = new Student("Carol", 3);
        Person e5 = new Person("Alice");
        Person arrayOfPeople[] = {e1, e2, e3};

        Person e4 = new Student("Alice", 1); // same as e1?

        System.out.println(e1 == arrayOfPeople[0]); // what is printed here?
        System.out.println(e1 == e4); // what is printed here?

        System.out.println(e1.equals(e4)); // and here?
        System.out.println(e1.equals(e5)); // and here?
    }
}
