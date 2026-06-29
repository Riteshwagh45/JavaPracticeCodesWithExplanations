package collection.Set.LinkedHashSet;
import java.util.*;
public class LinkedHashSetFrequency {
    static void main(String[] args) {
        Set<Integer> lh = new LinkedHashSet<>();
        int totalElements = 0;
        lh.add(10);
        totalElements++;

        lh.add(20);
        totalElements++;

        lh.add(20);
        totalElements++;

        lh.add(30);
        totalElements++;

        lh.add(10);
        totalElements++;

        lh.add(40);
        totalElements++;

        lh.add(40);
        totalElements++;

        System.out.println("Unique Elements : "+lh);
        System.out.println("Unique Elements : "+lh.size());
        System.out.println("Total Elements : "+totalElements);



    }
}
