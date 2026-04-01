import java.util.Set;
import java.util.HashSet;

public class SetObjectDemo {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student(101, "Ravi"));
        students.add(new Student(102, "Sita"));
        students.add(new Student(103, "Amit"));
        students.add(new Student(101, "Ravi"));

        System.out.println("Student Set");
        for (Student s: students) {
            System.out.println(s);
        }

        Set<Student> students1 = new HashSet<>();

        students1.add(new Student(105, "Ravi"));
        students1.add(new Student(106, "Sita"));
        students1.add(new Student(107, "Amit"));
        students1.add(new Student(108, "Ravi"));

        System.out.println("Student1 Set");
        for (Student s1: students1) {
            System.out.println(s1);
        }

        System.out.println("Equals: " + students.equals(students1));
        System.out.println("HashCode: " + students.hashCode());
    }
}
