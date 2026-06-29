package collection.Set.TreeSet;
import java.util.*;

public class TreeSetRange {
    static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);

       /*
        for(Integer i : set){
            if(i > 30){
                System.out.println(i);
            }
        }

        */

        // Returns all elements greater than or equal to the specified element (31)
        System.out.println(set.tailSet(31));

        // Returns all elements strictly less than the specified element (40)
        System.out.println(set.headSet(40));
    }
}
