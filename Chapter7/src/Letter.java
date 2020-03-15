import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        String name, present, yourName;
        int age;
        boolean boomer;
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("What is the name of the gift giver? ");
        name = inputString.nextLine();
        System.out.print("What is the present they gave you? ");
        present = inputString.nextLine();
        System.out.print("How old were you on your birthday? ");
        age = inputNumber.nextInt();
        boomer = (age >= 50);
        if(boomer){
            System.out.print("Okay Boomer, what's your name? ");
            yourName = inputString.nextLine();
        }
        else{
            System.out.print("What is your name? ");
            yourName = inputString.nextLine();
        }
        System.out.println();
        System.out.println();
        System.out.println("Dear " + name + ", ");
        System.out.println();
        System.out.print("Thank you for the " + present + ". ");
        System.out.println("I really like it. I can't believe ");
        if(boomer) System.out.print("I'm already " + age + " years young, but ");
        else System.out.print("I'm already " + age + " years young, but ");
        System.out.println("it doesn't feel that much different than ");
        System.out.println("being " + (age - 1) + ". ");
        System.out.println();
        System.out.println("Sincerely, ");
        System.out.println();
        System.out.println(yourName);

    }
}
