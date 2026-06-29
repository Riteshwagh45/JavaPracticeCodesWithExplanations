/*
Program	to	remove	index	element:	remove(int	index)	method	removes	element	of	specified
index.
Instructions to code:
• Create list with elements
• Read index value.
• If the index is valid – remove the element and display list
• If the index is not valid	– display error message.
 */


package collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Current List : "+list);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a index value you want to delete : ");
        int idx = sc.nextInt();

        if(idx >= 0 && idx <= list.size()){

            int val = list.get(idx);
            list.remove(idx);
            System.out.println("After deletion : "+list);
            System.out.println(val + " is a deleted successfully...");

        }

        else{
            System.out.println("index is invalid...");
        }

        sc.close();
    }
}
