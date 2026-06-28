package collection.Vector;

import java.util.Vector;

public class RemoveDuplicateVector {
    static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(30);

        Vector<Integer> result = new Vector<>();
        for(Integer i : v){
            if(!result.contains(i)){
                result.add(i);
            }
        }

        System.out.println(result);
    }
}
