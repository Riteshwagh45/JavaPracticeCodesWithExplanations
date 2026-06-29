/*

Program to display ArrayList and its size:
   • add() method is	used to append element to the list.
   • size() method returns the length of list.

 */



package collection.List.ArrayList;


import java.util.ArrayList;

public class Practice1 {

    public static boolean isEmptyList(ArrayList<Integer> list){
        /*
          • isEmpty() method returns true if the list doesn’t contains elements else returns false
        */

        if(list.isEmpty()){
            return true;
        }

        return false;
    }

    public static int getElement(ArrayList<Integer> list , int idx){
        /*
           Program to display the element of specified index:
                • get(int index) returns the element of	specified index.
         */

        if(idx < 0 || list.size() <= idx){
            return -1;
        }

        return list.get(idx);

    }

    public static void add(int idx , int val){
        /*
           Insert	element	into	specified	index:	add(int	index,	E	e)	method	is	used	to	insert	element	into
            specified index.
Instructions to code:
• Create ArrayList with 5 elements 10, 20, 30, 40, 50
• Read index to insert.
• Check whether	the index is present or	not
• If	the index is present, then read the	value and insert.
• If the index is not present, display Error message

     */


    }
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

       // System.out.println("size of the list is : "+list.size());
       // System.out.println(isEmptyList(list));
        System.out.println(getElement(list,6));

    }
}
