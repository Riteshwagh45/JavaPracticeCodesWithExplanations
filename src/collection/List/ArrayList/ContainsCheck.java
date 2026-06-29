/*
Program to check whether the list contains element or not: contains()	method	returns	true	if
the list has	specified element.
 */


package collection.List.ArrayList;
import java.util.ArrayList;

public class ContainsCheck {
    public static boolean contains(ArrayList<Integer> list , int val){
        return list.contains(val);

    }

    public static int indexOf(ArrayList<Integer> list , int val){
        /*
        Program	display	the	index	value	of	element:	indexOf()	method	returns	index	of	specified
         element. It returns -1	if	no	such element in the list.
         */

       return list.indexOf(val);
    }
    public static void set(ArrayList<Integer> list , int idx , int val){
        /*
        Program	to	replace	the	existing	value:	set(int	index,	E	e)	method	replace	the	index	element
         with specified element
         */
        System.out.println("Current list : "+list);

        if(idx >=0 && idx < list.size()){
            list.set(idx,val);
            System.out.println("after updation list : "+list);
        }

        else{
            System.out.println("invalid index ... error");
        }
    }
    public static void main(String[] args){
     ArrayList<Integer> list = new ArrayList<>();

     list.add(10);
     list.add(20);

      //  System.out.println(contains(list,10));
       // System.out.println(indexOf(list,50));
        set(list,2,30);


    }
}
