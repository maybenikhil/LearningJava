package Chap17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Chap17Part7 {
    static String fileName = "todo.txt";

    public static void main(String[] args) throws IOException {
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = menu();
            switch (menuItem) {
                case 1:
                    showList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Don't recognize input.");
            }
        }
    }

    static int menu() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("\nMain Menu\n");
        System.out.println("0. Exit the program");
        System.out.println("1. Display the to-do List");
        System.out.println("2. Add item to to-do list");
        System.out.println("3. Remove item from to-do list");
        System.out.println();
        System.out.print("Enter a choice: ");
        choice = input.nextInt();
        return choice;
    }

    static void showList() {
        System.out.println("\nTo-do List\n");
        try {
            Scanner inFile = new Scanner(new FileReader(fileName));
            String line;
            int number = 1;
            while (inFile.hasNextLine()) {
                line = inFile.nextLine();
                System.out.print(number + ". ");
                System.out.println(line);
                number++;
            }
            System.out.println();
            inFile.close();
        } catch (IOException ioe) {
            System.out.println("Can't access file.");
        }
    }

    static void addItem() {
        System.out.println("\nAddItem\n");
        try {
            Scanner input = new Scanner(System.in);
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
            System.out.print("Enter an item: ");
            String item = input.nextLine();
            outFile.println(item);
            outFile.close();
        } catch (IOException ioe) {
            System.out.println("Can't access file.");
        }
    }

    static void removeItem() {
        int choice;
        showList();
        Scanner input = new Scanner(System.in);
        System.out.print("Which item do you want to remove? ");
        choice = input.nextInt();
        ArrayList<String> items = new ArrayList<String>();
        int number = 1;
        try {
            Scanner inFile = new Scanner(new FileReader(fileName));
            String item;
            while (inFile.hasNextLine()) {
                item = inFile.nextLine();
                if (number != choice)
                    items.add(item);
                number++;
            }
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
            for (String i : items) {
                outFile.println(i);
            }
            outFile.close();
        } catch (IOException ioe) {
            System.out.println("Can't access file.");
        }
    }
}
