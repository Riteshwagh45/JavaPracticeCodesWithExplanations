package collection.List.ArrayList;

import java.util.ArrayList;

public class Employee1 {
    int id;
    String name;
    String address;

   public Employee1(int id , String name , String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

   /*
   @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    */

    public static void printReverseOrder(ArrayList<Employee1> list){
        for(int i=list.size()-1; i>=0; i--){
            Employee1 e = list.get(i);

            System.out.println(e.id +" " +" "+ e.name +" "+ e.address);

        }

    }

    public static void main(String[] args){
       Employee1 E1 = new Employee1(1 , "ritesh" , "pune");
       Employee1 E2 = new Employee1(2,"shubham","malegaon");
       Employee1 E3 = new Employee1(3,"rahul","nsk");

        ArrayList<Employee1> list = new ArrayList<>();
        list.add(E1);
        list.add(E2);
        list.add(E3);

        //System.out.println(list);

        for(Employee1 e : list){
            System.out.println(e.id+" ," + e.name +" , " + e.address);
        }
        printReverseOrder(list);

    }
}
