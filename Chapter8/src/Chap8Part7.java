import java.util.Scanner;

public class Chap8Part7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "Watson";
        String response = "";
        System.out.println("Let's play a guessing game. You get three tries");
        System.out.print("What was the name of the computer that played on Jeopardy? ");
        response = input.nextLine();
        if (response.equals(answer)) {
            println("That's right!");
        } else {
            print("Sorry, guess again: ");
            response = input.nextLine();
            if (response.equals(answer)) {
                println("That's right!");
            } else {
                print("Still not right, next guess: ");
                response = input.nextLine();
                if (response.equals(answer)) {
                    println("That's right!");
                } else {
                    println("Wrong again. The answer is Watson");
                }
            }
        }
    }

    public static void print(String string) {
        System.out.print(string);
    }

    public static void println(String string) {
        System.out.println(string);
    }
}
