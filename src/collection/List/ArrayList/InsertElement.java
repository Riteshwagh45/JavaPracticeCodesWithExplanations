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


package collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertElement {

    public static void add(int idx, int val, ArrayList<Integer> list) {

        // Check whether the index is present/valid or not
        if (idx >= 0 && idx <= list.size()) {
            list.add(idx, val);
            System.out.println("Updated List: " + list);

        }
        else {

            // Display Error message if index is out of bounds
            System.out.println("Error: Index " + idx + " is out of bounds. Cannot insert.");
        }
    }

    public static void main(String[] args) {


        // Create ArrayList with 5 elements: 10, 20, 30, 40, 50
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Current List : "+list);

        Scanner scanner = new Scanner(System.in);

        // 1. Read index to insert
        System.out.print("Enter the index where you want to insert: ");
        int idx = scanner.nextInt();

        // 2. Check validity and handle inputs accordingly
        if (idx >= 0 && idx <= list.size()) {

            // Read the value only if the index is valid
            System.out.print("Enter the value to insert: ");
            int val = scanner.nextInt();
            add(idx, val, list);
        }
        else {
            // Direct error message if index is invalid off the bat
            System.out.println("Error: Invalid index provided.");
        }

        scanner.close();
    }
}