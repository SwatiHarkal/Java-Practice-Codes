package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    private final int age;
    private final String name;

    Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Employee e) {
        return this.age - e.age;
        //return this.name.compareTo(e.name);
    }
}

public class CompararableExample {
    public static void main(String[] args) {
        Employee e1 = new Employee(3, "d");
        Employee e2 = new Employee(2, "a");
        Employee e3 = new Employee(5, "b");
        Employee e4 = new Employee(4, "c");


        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        System.out.println("before sorting" + employees);
        Collections.sort(employees);
        System.out.println("after sorting" + employees);
    }
}
