/*
ArrayList – Employee CRUD – Menu Driven Approach
This	program	explains	how	to	add	employee	details,	display	details	of	specific	ID,	remove
employee and update	the	details	of employee:
 */


package collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeCRUD {

    static class employee {
        int id;
        String name;
        double salary;

        public employee(int id , String name , double salary){
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }

    static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        ArrayList<employee> list = new ArrayList<>();


        while(true){
            System.out.println("---------------------------------------------");
            System.out.println("Enter 1 for Add Employee :");
            System.out.println("Enter 2 for Display Employee :");
            System.out.println("Enter 3 for Remove Employee :");
            System.out.println("Enter 4 for Update Employee :");
            System.out.println("Enter 5 for Display All Data : ");
            System.out.println("6 Exit : ");

            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();

            if(ch == 1){

                System.out.println("Enter Employee ID :");
                int id = sc.nextInt();
                System.out.println("Enter Name : ");
                String name = sc.next();
                System.out.println("Enter salary : ");
                double salary = sc.nextDouble();

                employee e = new employee(id,name,salary);
                list.add(e);
                System.out.println("Data Inserted Successfully : ");
            }

            else if(ch == 2){

                System.out.println("Enter Employee ID : ");
                int id = sc.nextInt();
                boolean isAvailable  = false;
                for(employee e : list){
                    if(e.id == id){
                        System.out.println("ID = "+e.id +" name = "+e.name +" salary = "+e.salary);
                        isAvailable = true;
                        break;
                    }
                }
                if(isAvailable == false){

                    System.out.println("Invalid ID");
                }

            }
            else if(ch == 3){

                System.out.println("Enter ID you want to remove Employee : ");
                int id = sc.nextInt();
                boolean isFound = false;

                for(employee e : list){
                    if(e.id == id){
                        int index = list.indexOf(e);
                        list.remove(index);
                        isFound = true;
                        System.out.println("Remove successfully...!");
                        break;
                    }
                }
                if(!isFound){
                    System.out.println("Invalid ID : ");
                }

            }
            else if(ch == 4){
                System.out.println("Enter ID for Update Employee : ");
                int id = sc.nextInt();
                boolean isFound = false;
                for(employee e : list){
                    if(e.id == id){
                        System.out.println("Enter Salary to Update");
                        double sal = sc.nextDouble();
                        e.salary = sal;

                        System.out.println("Salary updated...!");
                        isFound = true;
                        break;
                    }
                }
                if(!isFound){
                    System.out.println("Invalid Employee : ");
                }

            }
            else if(ch == 5){

                if(list.isEmpty()){
                    System.out.println("List Empty : ");
                }
                else {
                    System.out.println("You can See All  Employees...!");
                    for (employee e : list) {
                        System.out.println(e.id +" "+ e.name +" "+ e.salary);
                    }
                }
            }
            else if(ch == 6){
                System.out.println("End");
                System.exit(1);
            }

            else{
                System.out.println("Invalid choice");
            }

        }

    }

    
}
