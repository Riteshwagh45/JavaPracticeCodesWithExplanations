package collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Approach-3:
 * Read Employee details using Scanner class
 * and store them in an ArrayList.
 */

public class Employee3 {

    int id;
    String name;
    String address;

    // Parameterized Constructor
    public Employee3(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee3> list = new ArrayList<>();

        System.out.println("Enter Employee Details:");

        for (int i = 1; i <= 3; i++) {

            System.out.println("\nEmployee " + i);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            Employee3 emp = new Employee3(id, name, address);
            list.add(emp);
        }

        System.out.println("\nEmployee Details are:");

        for (Employee3 emp : list) {
            System.out.println("ID: " + emp.id +
                    "  Name: " + emp.name +
                    "  Address: " + emp.address);
        }

        sc.close();
    }
}