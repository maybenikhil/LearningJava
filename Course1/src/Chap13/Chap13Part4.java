package Chap13;

public class Chap13Part4 {
    public static void main(String[] args) {
        Object object = new Employee("Smith", 30000);
        System.out.println("Type of anObject: " + object.getClass().getName());
        Employee e1 = (Employee) object; // casting
        System.out.println(e1.displayEmpInfo());
    }
}
