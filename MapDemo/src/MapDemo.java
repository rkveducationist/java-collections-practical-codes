import java.util.Map;
import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        System.out.println("-- HashMap Demo --");

        // Declaring Object - Map<KeyType, ValueType>
        Map<String, Integer> studentMarks = new HashMap<>();

        // PUT (add key-value pair)
        studentMarks.put("Arjun", 37);
        studentMarks.put("Ravi", 85);
        studentMarks.put("Priya", 92);
        studentMarks.put("Joshi", 78);
        studentMarks.put("Meena", 39);


        System.out.println("Student Marks: " + studentMarks);

        // Get Value by Key
        System.out.println("Get Value by Key");
        System.out.println("Ravi Marks: " + studentMarks.get("Ravi"));
        System.out.println("Xyz Marks: " + studentMarks.get("Xyz"));

        // Check Key/Value Exists
        System.out.println("Contains Key 'Arjun'? : " + studentMarks.containsKey("Arjun"));

        // Size of Map
        System.out.println("Size of Map: " + studentMarks.size());

        // Remove by Key
        studentMarks.remove("Arjun");
        System.out.println("Contains Key 'Arjun'? : " + studentMarks.containsKey("Arjun"));
        System.out.println("Student Marks: " + studentMarks);

        // Iterate - 3 ways
        // 1 - keySet() - Iterate keys only
        System.out.println("-- Iterate Keys --");
        for (String keyName: studentMarks.keySet()) {
            System.out.println("Key: " + keyName);
        }

        // 2 - values() - Iterate values only
        System.out.println("-- Iterate Values --");
        for (int marks: studentMarks.values()) {
            System.out.println("Marks: " + marks);
        }

        // 3 - entrySet() - Iterate: key-value pair (best way)
        System.out.println("-- Iterate: key-value pair --");
        for (Map.Entry<String, Integer> entry: studentMarks.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " => Value: " + entry.getValue());
        }

        // getOrDefault - safe get with fallback value
        System.out.println("\n Get 'Ravi' or default: " + studentMarks.getOrDefault("Ravi", 0));
        System.out.println("\n Get 'Unknown' or default: " + studentMarks.getOrDefault("Unknown", 10));

        System.out.println("\n -- Map with Object Values -- ");

    }
}
