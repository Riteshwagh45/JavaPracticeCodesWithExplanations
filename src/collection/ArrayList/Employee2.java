/*
Approach-2: (Create Employee objects by collecting details from arrays)
Employee.java:
• Create Employee class with instance variables id, name, salary
• Define parameterized constructor to	initialize the object.
 */


package collection.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Employee2 {

    public static class Employee{
        private int id;
        private String name;
        private String address;

        public Employee(int id , String name , String address){
            this.id = id;
            this.name = name;
            this.address = address;
        }
    }

    static void main(String[] args) {

        int ids[] = {1,2,3,4,5};
        String names[] = {"ritesh","shubham","rahul","gitesh","aryan"};
        String addresses[] = {"pune","jalgaon","malegaon","malegaon","pune"};

        ArrayList<Employee> list = new ArrayList<>();

        for(int i=0; i<ids.length-1; i++){
            Employee e = new Employee(ids[i], names[i], addresses[i]);
            list.add(e);
        }

        //print data using for each loop
        for(Employee e : list){
            System.out.println(e.id +" "+" "+ e.name +" " +" " + e.address);

        }

        System.out.println("---------------------------------");
        //print using ListIterator
        ListIterator<Employee> itr = list.listIterator();

        while(itr.hasNext()){
            Employee e = itr.next();
            System.out.println(" Id = "+e.id +" name = "+ e.name+" address = "+ e.address);

        }

        //printing the data in reverseorder using ListIterator
        System.out.println("----------------------------------------");
        ListIterator<Employee> itr2 = list.listIterator(list.size());
        while(itr2.hasPrevious()){
            Employee e = itr2.previous();
            System.out.println(" Id = "+e.id +" name = "+ e.name+" address = "+ e.address);

        }
    }
}
