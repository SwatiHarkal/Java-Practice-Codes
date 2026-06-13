package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1{
    private int age;
    private String name;
    
    
    Employee1(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}

class AgeComparator implements Comparator<Employee1> {
    public int compare(Employee1 e1, Employee1 e2){
        return e1.getAge() - e2.getAge();
    }
}


public class ComparatorExample {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1(3, "d");
        Employee1 e2 = new Employee1(2, "a");
        Employee1 e3 = new Employee1(5, "b");
        Employee1 e4 = new Employee1(4, "c");

        List<Employee1> employees = new ArrayList<Employee1>();
        AgeComparator ageComparator = new AgeComparator();
        Comparator<Employee1> nameComparator = new Comparator<Employee1>(){
            public int compare(Employee1 e1, Employee1 e2){
                return e1.getName().compareTo(e2.getName());
            }
        };

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        System.out.println("before sorting: "+employees);
        //Collections.sort(employees,ageComparator);
         Collections.sort(employees,nameComparator);

        System.out.println("after sorting: "+employees);
    }
}
