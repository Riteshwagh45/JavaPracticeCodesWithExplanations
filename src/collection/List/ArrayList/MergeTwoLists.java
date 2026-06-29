package collection.List.ArrayList;

import java.util.ArrayList;

public class MergeTwoLists {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(i*5);
        }
        for(int i=5; i>=1; i--){
            list2.add(i*5);
        }
        list1.addAll(list2);
        System.out.println(list1);

    }
}
