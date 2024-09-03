import java.util.Arrays;
import java.util.Comparator;

public class StudentSorter {

    // Generalized sorting method
    public static void sortStudents(Student[] students, Comparator<Student> comparator) {
        Arrays.sort(students, comparator);
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Alice", 85, 20),
                new Student(2, "Bob", 95, 22),
                new Student(3, "Charlie", 90, 21),
                new Student(4, "Dave", 80, 20)
        };

        // Sort by ID
        sortStudents(students, Comparator.comparingInt(Student::getId));
        System.out.println("Sorted by ID: " + Arrays.toString(students));

        // Sort by Name
        sortStudents(students, Comparator.comparing(Student::getName));
        System.out.println("Sorted by Name: " + Arrays.toString(students));

        // Sort by Grade
        sortStudents(students, Comparator.comparingInt(Student::getGrade));
        System.out.println("Sorted by Grade: " + Arrays.toString(students));

        // Sort by Age
        sortStudents(students, Comparator.comparingInt(Student::getAge));
        System.out.println("Sorted by Age: " + Arrays.toString(students));
    }
}
