package collection.List.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        for(int i=0; i<=5; i++){
            v.add(i*5);
        }

        //direcly print whole vector
        //System.out.println(v);

        //print the data using for-each loop
        for(int val : v){
            System.out.println(val);
        }

        //print using for loop
        for(int i=0; i<v.size(); i++){
            System.out.println(v.get(i));
        }

        //print using Enumeration
        Enumeration<Integer> en = v.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
