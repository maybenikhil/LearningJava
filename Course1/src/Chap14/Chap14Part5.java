package Chap14;

import Chap13.Employee;
import Chap13.Manager;

import java.util.ArrayList;

public class Chap14Part5 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Smith", 20000);
        Manager m1 = new Manager("Brown", 40000, "IT");
        Employee e2 = new Employee("Jones", 30000);
        Manager m2 = new Manager("Green", 50000, "Sales");
        ArrayList<Employee> emps = new ArrayList<Employee>();
        emps.add(e1);
        emps.add(e2);
        emps.add(m1);
        emps.add(m2);
        for (Employee employee : emps) System.out.println(employee.displayEmpInfo());
    }
}
