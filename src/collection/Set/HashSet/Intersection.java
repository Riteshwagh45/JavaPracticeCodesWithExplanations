package collection.Set.HashSet;
import java.util.*;
public class Intersection {
    static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(10);

        Set<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(50);
        set2.add(60);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);



    }
}
