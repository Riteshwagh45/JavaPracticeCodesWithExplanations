package Map.HashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MenuDrivenStudentMarks {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hashtable<String, Double> ht = new Hashtable<>();

        while (true) {

            System.out.println("1 Add Student");
            System.out.println("2 Update Student");
            System.out.println("3 Search Student");
            System.out.println("4 Remove Student");
            System.out.println("5 Display All Students");
            System.out.println("6 Exit");
            System.out.print("Enter your choice : ");

            int ch = sc.nextInt();

            // Add Student
            if (ch == 1) {

                System.out.print("Enter Name : ");
                String name = sc.next();

                System.out.print("Enter Marks : ");
                Double marks = sc.nextDouble();

                ht.put(name, marks);

                System.out.println("Student Added...!");
            }

            // Update Student
            else if (ch == 2) {

                System.out.print("Enter Name : ");
                String name = sc.next();

                if (ht.isEmpty()) {

                    System.out.println("Empty Set. Students unavailable...!");
                }

                else {

                    boolean isFound = false;

                    System.out.print("Enter New Marks : ");
                    Double newMarks = sc.nextDouble();

                    if (ht.containsKey(name)) {

                        ht.replace(name, newMarks);
                        isFound = true;
                    }

                    if (!isFound) {

                        System.out.println("Invalid Student...!");
                    }

                    else {

                        System.out.println("Student Updated...!");
                    }
                }
            }

            // Search Student
            else if (ch == 3) {

                System.out.print("Enter Name : ");
                String name = sc.next();

                if (ht.isEmpty()) {

                    System.out.println("Empty Set. Students not available...!");
                }

                else {

                    if (ht.containsKey(name)) {

                        System.out.println("Name  = " + name);
                        System.out.println("Marks = " + ht.get(name));
                    }

                    else {

                        System.out.println("Invalid Student...!");
                    }
                }
            }

            // Remove Student
            else if (ch == 4) {

                System.out.print("Enter Name : ");
                String name = sc.next();

                if (ht.isEmpty()) {

                    System.out.println("Empty Set.");
                }

                else {

                    boolean isFound = false;

                    if (ht.containsKey(name)) {

                        ht.remove(name);
                        isFound = true;
                    }

                    if (!isFound) {

                        System.out.println("Invalid Student...!");
                    }

                    else {

                        System.out.println("Student Removed Successfully...!");
                    }
                }
            }

            // Display All Students
            else if (ch == 5) {

                if (ht.isEmpty()) {

                    System.out.println("No Students Available...!");
                }

                else {

                    for (Map.Entry<String, Double> entry : ht.entrySet()) {

                        System.out.println(
                                "Name = " + entry.getKey()
                                        + " , Marks = " + entry.getValue()
                        );
                    }
                }
            }

            // Exit
            else if (ch == 6) {

                System.out.println("Exit...!");

                sc.close();
                System.exit(0);
            }

            // Invalid Choice
            else {

                System.out.println("Invalid Choice...!");
            }
        }
    }
}