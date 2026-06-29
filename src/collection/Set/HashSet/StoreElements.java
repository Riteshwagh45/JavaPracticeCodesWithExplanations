package collection.Set.HashSet;


import java.util.*;

public class StoreElements {
    static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(40);
        System.out.println(set);

    }
}
