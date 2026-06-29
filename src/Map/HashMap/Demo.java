package Map.HashMap;
import java.util.*;

public class Demo {
    static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        // HashMap stores data as key-value pairs.
        // Keys must be unique, but values can be duplicated.
        // Does not maintain insertion order.
        // Allows one null key and multiple null values.
        // Not synchronized (not thread-safe).
        // Average time complexity for put(), get(), remove() is O(1).

        map.put(10,"Ten");
        map.put(20,"twenty");
        map.put(30,"thirty");
        map.put(40,"fourty");
        map.put(40,"fourty");
        map.put(null,null);
        map.put(null,null);

        System.out.println(map);

    }
}
