package Chap16;

import Chap13.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Chap16Part6 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Brown", 20000);
        Employee emp2 = new Employee("Smith", 21000);
        Employee emp3 = new Employee("Jones", 22000);
        Employee emp4 = new Employee("Green", 23000);
        ArrayList<Employee> emps = new ArrayList<Employee>(Arrays.asList(emp1, emp2, emp3, emp4));
        for (Employee emp : emps)
            System.out.println(emp.displayEmpInfo());
    }
}
