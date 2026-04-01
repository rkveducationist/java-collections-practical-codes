import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("-- ArrayList Demo --");

        // Creating a List - best practice: use interface type
        // ArrayList<String> - list that holds only String values

        List<String> students = new ArrayList<>();

        // Add Elements
        students.add("Ravi Kumar"); // index 0
        students.add("Priya Sharma");
        students.add("Arjun Reddy");
        students.add("Meena Joshi");
        students.add("Ravi Kumar"); // index 4 - duplicate

        System.out.println("All Students: " + students);
        System.out.println("Size: " + students.size());

        // GET Element by Index
        System.out.println("Student at Index 0: " + students.get(0));
        System.out.println("Student at Index 3: " + students.get(3));

        // UPDATE Element
        System.out.println("Before Update - Student at Index 1: " + students.get(1));
        students.set(1, "Priya Patel");
        System.out.println("After Update - Student at Index 1: " + students.get(1));

        // REMOVE Element
        System.out.println("Remove - Student Name: Arjun Reddy: " + students.get(2));
        students.remove("Arjun");
        System.out.println("After Remove - Student: " + students.get(2));
        System.out.println("Size: " + students.size());

        System.out.println("Remove - Student at index 3: " + students.get(3));
        students.remove(3);
        System.out.println("Size: " + students.size());

        System.out.println("After Update & Removing the Final List of Students");
        System.out.println("All Students: " + students);

        // CHECK if Element Exists
        System.out.println("\nContains Meena Joshi?: " + students.contains("Meena Joshi"));

        // INDEX of Element
        System.out.println("\nIndex of Ravi Kumar: " + students.indexOf("Ravi Kumar"));

        // ITERATE using for-each loop
        System.out.println("\n-- ITERATE with for-each --");
        for (String student: students) {
            System.out.println("-> " + student);
        }

        // ITERATE using INDEX
        System.out.println("\n-- ITERATE with Index --");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("[ " + i + " ] => " + students.get(i));
        }

        // SORTING
        System.out.println("\n -- Before SORTING: " + students);
        java.util.Collections.sort(students);
        System.out.println("\n -- After SORTING: " + students);

        // CLEAR
        System.out.println("\n -- Before CLEAR: " + students);
        students.clear();
        System.out.println("\n -- After CLEAR: " + students);
    }
}