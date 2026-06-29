package collection.List.Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackCRUD {

    static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n==========================");
            System.out.println("1. Push Element");
            System.out.println("2. Search Element");
            System.out.println("3. Update Element");
            System.out.println("4. Pop Element");
            System.out.println("5. Display Stack");
            System.out.println("6. Display Top Element");
            System.out.println("7. Exit");
            System.out.println("==========================");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                // Push
                case 1:

                    System.out.print("Enter Element : ");
                    int num = sc.nextInt();

                    st.push(num);

                    System.out.println("Element Pushed Successfully.");
                    break;

                // Search
                case 2:

                    if (st.isEmpty()) {
                        System.out.println("Stack is Empty.");
                        break;
                    }

                    System.out.print("Enter Element to Search : ");
                    num = sc.nextInt();

                    int pos = st.search(num);

                    if (pos == -1) {
                        System.out.println("Element Not Found.");
                    } else {
                        System.out.println("Element Found.");
                        System.out.println("Position from Top = " + pos);
                    }

                    break;

                // Update
                case 3:

                    if (st.isEmpty()) {
                        System.out.println("Stack is Empty.");
                        break;
                    }

                    System.out.print("Enter Old Value : ");
                    int oldValue = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < st.size(); i++) {

                        if (st.get(i) == oldValue) {

                            System.out.print("Enter New Value : ");
                            int newValue = sc.nextInt();

                            st.set(i, newValue);

                            found = true;

                            System.out.println("Updated Successfully.");

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Element Not Found.");
                    }

                    break;

                // Pop
                case 4:

                    if (st.isEmpty()) {
                        System.out.println("Stack is Empty.");
                    } else {

                        System.out.println("Removed Element : " + st.pop());
                    }

                    break;

                // Display
                case 5:

                    if (st.isEmpty()) {
                        System.out.println("Stack is Empty.");
                    } else {

                        System.out.println("Stack Elements:");

                        for (int i = st.size() - 1; i >= 0; i--) {
                            System.out.println(st.get(i));
                        }
                    }

                    break;

                // Peek
                case 6:

                    if (st.isEmpty()) {
                        System.out.println("Stack is Empty.");
                    } else {

                        System.out.println("Top Element = " + st.peek());
                    }

                    break;

                // Exit
                case 7:

                    System.out.println("Program Ended.");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}