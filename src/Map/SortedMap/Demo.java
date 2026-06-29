package Map.SortedMap;

import java.util.TreeMap;

public class Demo {
    static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();

        // Properties of TreeMap
        // ----------------------
        // • Stores data as key-value pairs.
        // • Keys are automatically sorted in ascending order.
        // • Duplicate keys are not allowed, but duplicate values are allowed.
        // • Null keys are not allowed, but null values are allowed.
        // • Not synchronized (not thread-safe).
        // • Implemented using a Red-Black Tree.
        // • Time Complexity:
        //      put()    -> O(log n)
        //      get()    -> O(log n)
        //      remove() -> O(log n)

        tm.put(10,"ten");
        tm.put(1,"one");
        tm.put(8,"eight");
        tm.put(5,"five");
        tm.put(4,"four");
        tm.put(4,"four");

        System.out.println(tm);
    }
}
