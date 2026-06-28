package collection.Vector;

import java.util.Vector;

public class VectorSearch {

    public static boolean searchElement(Vector<Integer> v , int val){
        for(Integer i : v){
            if(i == val){
                return true;
            }
        }
        return false;
    }
    static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println(searchElement(v,10));

    }
}
