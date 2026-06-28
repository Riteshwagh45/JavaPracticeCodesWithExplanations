package collection.Vector;

import java.util.Scanner;
import java.util.Vector;

public class VectorEvenNumbers {
    static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 elements : ");
        for(int i=1; i<=10; i++){
            v.add(Integer.valueOf(sc.next()));
        }

        for(Integer i : v) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
