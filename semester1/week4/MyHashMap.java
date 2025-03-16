package week4;
import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args){

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Tom");
        map.put(2, "Bob");

        System.out.println(map.get(1));

        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + " Name: " + map.get(key));

        }

    }
    
}
