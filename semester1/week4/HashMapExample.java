package week4;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");

        // Retrieving a value
        System.out.println("Key 2 maps to: " + map.get(2));

        // Iterating over the HashMap
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Handling collisions (simulate)
        map.put(1, "Dave");  // Replaces "Alice"
        System.out.println("After update, Key 1 maps to: " + map.get(1));
    }
}
