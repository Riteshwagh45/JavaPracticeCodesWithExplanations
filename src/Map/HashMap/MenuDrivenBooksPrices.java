package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuDrivenBooksPrices {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> bookMap = new HashMap<>();

        while (true) {

            System.out.println("\n========== BOOK MANAGEMENT ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book Price");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Remove Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                // Add Book
                case 1:

                    System.out.print("Enter Book Name : ");
                    String name = sc.next();

                    if (bookMap.containsKey(name)) {
                        System.out.println("Book already exists.");
                        break;
                    }

                    System.out.print("Enter Book Price : ");
                    double price = sc.nextDouble();

                    bookMap.put(name, price);

                    System.out.println("Book Added Successfully.");
                    break;

                // Update Price
                case 2:

                    if (bookMap.isEmpty()) {
                        System.out.println("No Books Available.");
                        break;
                    }

                    System.out.print("Enter Book Name : ");
                    name = sc.next();

                    if (bookMap.containsKey(name)) {

                        System.out.print("Enter New Price : ");
                        double newPrice = sc.nextDouble();

                        bookMap.put(name, newPrice);

                        System.out.println("Price Updated Successfully.");
                    }

                    else {

                        System.out.println("Book Not Found.");
                    }

                    break;

                // Search Book
                case 3:

                    if (bookMap.isEmpty()) {

                        System.out.println("No Books Available.");
                        break;
                    }

                    System.out.print("Enter Book Name : ");
                    name = sc.next();

                    if (bookMap.containsKey(name)) {

                        System.out.println("----------------------------");
                        System.out.println("Book Name  : " + name);
                        System.out.println("Book Price : " + bookMap.get(name));
                        System.out.println("----------------------------");
                    }

                    else {

                        System.out.println("Book Not Found.");
                    }

                    break;

                // Display All Books
                case 4:

                    if (bookMap.isEmpty()) {

                        System.out.println("No Books Available.");
                    }

                    else {

                        System.out.println("\n------ Available Books ------");

                        for (Map.Entry<String, Double> entry : bookMap.entrySet()) {

                            System.out.println("Book : " + entry.getKey()
                                    + " | Price : ₹" + entry.getValue());
                        }
                    }

                    break;

                // Remove Book
                case 5:

                    if (bookMap.isEmpty()) {

                        System.out.println("No Books Available.");
                        break;
                    }

                    System.out.print("Enter Book Name : ");
                    name = sc.next();

                    if (bookMap.containsKey(name)) {

                        bookMap.remove(name);

                        System.out.println("Book Removed Successfully.");
                    }

                    else {

                        System.out.println("Book Not Found.");
                    }

                    break;

                // Exit
                case 6:

                    System.out.println("Program Terminated.");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}