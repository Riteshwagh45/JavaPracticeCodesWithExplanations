package collection.Set.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class StoreElements {
    static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(40);

        System.out.println(set);



    }
}
