/*
program to remove all elements from the list:
Instruction:
Create List with 5 elements
Display list is not empty
Remove all elements using clear()
*/



package collection.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //display is not empty
        if(!list.isEmpty()){
            System.out.println("Not empty");
        }
        else{
            System.out.println("Empty");
        }

        list.clear();
        System.out.println(list);

    }
}
