package Map.HashTable;

import java.util.Hashtable;

public class Demo {
    static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();

        // Hashtable stores data as key-value pairs.
        // Duplicate keys are not allowed, but duplicate values are allowed.
        // Does not maintain insertion order.
        // Does not allow null keys or null values.
        // Synchronized (thread-safe).
        // Slower than HashMap because of synchronization.
        // • Average time complexity: O(1) for put(), get(), and remove().

        ht.put(10,"ten");
        ht.put(20,"twenty");
        ht.put(30,"thirty");
        ht.put(30,"thirty");

        System.out.println(ht);
    }
}
