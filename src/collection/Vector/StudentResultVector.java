package collection.Vector;

import java.util.Scanner;
import java.util.Vector;

public class StudentResultVector {

    static class Student {
        int id;
        String name;
        double marks;

        public Student(int id, String name, double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }
    }

    static void main(String[] args) {

        Vector<Student> v = new Vector<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n==============================");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Marks");
            System.out.println("4. Remove Student");
            System.out.println("5. Display All");
            System.out.println("6. Display Highest Marks Student");
            System.out.println("7. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                // Add Student
                case 1:

                    System.out.print("Enter Student ID : ");
                    int id = sc.nextInt();

                    boolean duplicate = false;

                    for (Student s : v) {
                        if (s.id == id) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {
                        System.out.println("Student ID already exists.");
                        break;
                    }

                    System.out.print("Enter Student Name : ");
                    String name = sc.next();

                    System.out.print("Enter Marks : ");
                    double marks = sc.nextDouble();

                    Student s = new Student(id, name, marks);
                    v.add(s);

                    System.out.println("Student Added Successfully.");
                    break;

                // Search Student
                case 2:

                    if (v.isEmpty()) {
                        System.out.println("Vector is Empty.");
                        break;
                    }

                    System.out.print("Enter Student ID : ");
                    id = sc.nextInt();

                    boolean found = false;

                    for (Student st : v) {

                        if (st.id == id) {

                            System.out.println("-----------------------");
                            System.out.println("ID    : " + st.id);
                            System.out.println("Name  : " + st.name);
                            System.out.println("Marks : " + st.marks);
                            System.out.println("-----------------------");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }

                    break;

                // Update Marks
                case 3:

                    if (v.isEmpty()) {
                        System.out.println("Vector is Empty.");
                        break;
                    }

                    System.out.print("Enter Student ID : ");
                    id = sc.nextInt();

                    found = false;

                    for (Student st : v) {

                        if (st.id == id) {

                            System.out.print("Enter New Marks : ");
                            st.marks = sc.nextDouble();

                            System.out.println("Marks Updated Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }

                    break;

                // Remove Student
                case 4:

                    if (v.isEmpty()) {
                        System.out.println("Vector is Empty.");
                        break;
                    }

                    System.out.print("Enter Student ID : ");
                    id = sc.nextInt();

                    found = false;

                    for (Student st : v) {

                        if (st.id == id) {

                            v.remove(st);

                            System.out.println("Student Removed Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }

                    break;

                // Display All Students
                case 5:

                    if (v.isEmpty()) {
                        System.out.println("Vector is Empty.");
                    }

                    else {

                        System.out.println("\n----------- Student List -----------");

                        for (Student st : v) {

                            System.out.println("ID = " + st.id +
                                    " | Name = " + st.name +
                                    " | Marks = " + st.marks);
                        }
                    }

                    break;

                // Highest Marks Student
                case 6:

                    if (v.isEmpty()) {
                        System.out.println("Vector is Empty.");
                        break;
                    }

                    Student topper = v.get(0);

                    for (Student st : v) {

                        if (st.marks > topper.marks) {
                            topper = st;
                        }
                    }

                    System.out.println("\n------ Highest Marks Student ------");
                    System.out.println("ID    : " + topper.id);
                    System.out.println("Name  : " + topper.name);
                    System.out.println("Marks : " + topper.marks);

                    break;

                // Exit
                case 7:

                    System.out.println("Program Terminated.");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");
            }

        }

    }

}