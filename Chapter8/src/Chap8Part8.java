import java.util.Scanner;

public class Chap8Part8 {
    public static void main(String[] args) throws Exception {
        String op;
        double number1, number2;
        Scanner input = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
        Chap8Part7.print("Enter the first number: ");
        number1 = inputNumber.nextDouble();
        Chap8Part7.print("Enter the second number: ");
        number2 = inputNumber.nextDouble();
        Chap8Part7.print("Enter the operator: ");
        op = input.nextLine();
        if (op.equals("+")) {
            System.out.println(number1 + number2);
        } else if (op.equals("-")) {
            System.out.println(number1 - number2);
        } else if (op.equals("*")) {
            System.out.println(number1 * number2);
        } else if (op.equals("/")) {
            System.out.println(number1 / number2);
        } else {
            System.out.println("Wrong operator!");
        }
    }
}
