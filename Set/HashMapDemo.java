package Set;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*  In Java, a Map is an object that maps keysto values. It cannot contain duplicate keys, and each key can map to at most one value. Think of it as a dictionary where you look up a word (key) to find its definition (value). */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "bob");
        map.put(3, "charlie");
        map.put(4, "david");
        map.put(5, "emilie");
        System.out.println(map);
        // Set<Integer> keys = map.keySet();
        // for (Integer rollNo : keys) {
        // String name = map.get(rollNo);
        // System.out.println(rollNo + " : " + name);
        // }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        // using entryset You can modify original map self
        for (Entry<Integer, String> pair : entries) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
            // converting to uppercase
            pair.setValue(pair.getValue().toUpperCase());
        }
        System.out.println(map);
        /*
         * Key Characteristics:
         * Unordered: Does not maintain any order of its elements.
         * Allows null Keys and Values: Can have one null key and multiple null values.
         * Not Synchronized: Not thread-safe; requires external
         * synchronization if used in a multi-threaded context.
         * Performance: Offers constant-time performance (O(1)) for basic
         * operations like get and put, assuming the hash function disperses elements
         * properly.
         */

    }
}