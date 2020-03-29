package Chap13;

public class Manager extends Employee {
    private String department;

    public Manager(String n, int s, String d) {
        super(n, s);
        this.department = d;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String displayEmpInfo() {
        return super.displayEmpInfo() +
                "Department: " + department + "\n";
    }

    public void changeSalary(Employee e, double amount) {
        e.salary = amount;
    }
}
