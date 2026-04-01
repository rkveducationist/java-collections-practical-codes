import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        System.out.println("-- HashSet Demo --");
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Ravi");
        hashSet.add("Sita");
        hashSet.add("Amit");
        hashSet.add("Ravi");
        hashSet.add(null);

        System.out.println("HashSet Data: " + hashSet);

        System.out.println("-- LinkedHashSet Demo --");
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Ravi");
        linkedHashSet.add("Sita");
        linkedHashSet.add("Amit");
        linkedHashSet.add("Ravi");
        linkedHashSet.add(null);

        System.out.println("LinkedHashSet Data : " + linkedHashSet);

        System.out.println("-- TreeSet Demo --");
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Ravi");
        treeSet.add("Sita");
        treeSet.add("Amit");
        treeSet.add("Ravi");
        // treeSet.add(null);

        System.out.println("TreeSet Data : " + treeSet);
    }
}