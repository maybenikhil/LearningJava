package Chap13;

public class Employee {
    private String name;
    protected double salary;

    public Employee(String n, int s){
        this.name = n;
        this.salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String displayEmpInfo() {
        return "Name: " + name + "\n" +
                "Salary: " + salary + "\n";
    }
}
