package Chap12;

public class Chap12Part6 {
    public static void main(String[] args) {
        Calc calculator = new Calc(2);
        System.out.println(calculator.show());
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {

        }
        calculator.add(10);
        System.out.println(calculator.show());
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {

        }
        calculator.subtract(2.25);
        System.out.println(calculator.show());
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {

        }
        calculator.mult(10);
        System.out.println(calculator.show());
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {

        }
        calculator.div(2);
        System.out.println(calculator.show());
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {

        }
    }
}
