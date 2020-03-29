package Chap9;

import java.util.Scanner;

public class Chap9Part9 {
    public static void main(String[] args) {
        var printer = System.out;
        var input = System.in;
        Scanner inputNum1 = new Scanner(input);
        Scanner inputNum2 = new Scanner(input);
        Scanner inputOp = new Scanner(input);
        double num1, num2;
        String op;
        while (true) {
            printer.print("First #: ");
            num1 = inputNum1.nextDouble();
            printer.print("Second #: ");
            num2 = inputNum2.nextDouble();
            printer.print("Operator: ");
            op = inputOp.next();
            if (op.equals("+")) {
                System.out.println(num1 + num2);
            } else if (op.equals("-")) {
                System.out.println(num1 - num2);
            } else if (op.equals("*")) {
                System.out.println(num1 * num2);
            } else if (op.equals("/")) {
                System.out.println(num1 / num2);
            }
        }
    }
}
