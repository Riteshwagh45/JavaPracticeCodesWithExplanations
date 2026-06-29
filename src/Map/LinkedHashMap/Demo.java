package Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class Demo {
    static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        // LinkedHashMap stores data as key-value pairs.
        // Maintains insertion order.
        // Duplicate keys are not allowed, but duplicate values are allowed.
        // Allows one null key and multiple null values.
        // Not synchronized (not thread-safe).
        // Slightly slower than HashMap because it maintains insertion order.
        // • Average time complexity: O(1) for put(), get(), and remove().
        lhm.put(10,"ten");
        lhm.put(20,"twenty");
        lhm.put(20,"twenty");
        lhm.put(null , "null");
        lhm.put(null,"null");

        System.out.println(lhm);
    }
}
