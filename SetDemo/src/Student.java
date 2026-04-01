import java.util.Objects;

public class Student {
    private int id;
    private String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return id == s.id;
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Override toString()
    public String toString() {
        return id + " - " + name;
    }
}
