import java.util.Scanner;

public class Chapter7Part4 {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.println("Your name is " + name);
    }
}
