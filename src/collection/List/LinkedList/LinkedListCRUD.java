package collection.List.LinkedList;

import java.util.LinkedList;

public class LinkedListCRUD {

    static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        // Add Elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.addFirst("Mango");
        linkedList.addLast("Grapes");

        System.out.println("LinkedList : " + linkedList);

        // Retrieve Elements
        String first = linkedList.getFirst();
        String last = linkedList.getLast();

        System.out.println("First Element : " + first);
        System.out.println("Last Element : " + last);

        String element = linkedList.get(2);
        System.out.println("Element at Index 2 : " + element);

        // Search
        boolean containsBanana = linkedList.contains("Banana");
        System.out.println("Contains Banana : " + containsBanana);

        // Remove First and Last
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("After Removing First & Last : " + linkedList);

        // Remove by Index
        linkedList.remove(1);

        System.out.println("After Removing Index 1 : " + linkedList);

        // Check Empty
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is Empty : " + isEmpty);

        // Size
        int size = linkedList.size();
        System.out.println("Size : " + size);

        // Clear LinkedList
        linkedList.clear();

        System.out.println("After Clear : " + linkedList);
    }
}