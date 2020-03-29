package Chap8;

import java.util.Scanner;

public class Chap8Part5 {
    private static String letterGrade;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your grade: ");
        int grade = input.nextInt();
        if (grade >= 90) {
            letterGrade = "A";
        } else if (grade >= 80) {
            letterGrade = "B";
        } else if (grade >= 70) {
            letterGrade = "C";
        } else if (grade >= 60) {
            letterGrade = "D";
        } else if (grade >= 0) {
            letterGrade = "F";
        } else {
            System.out.println("Not a valid grade");
        }
        System.out.println("A grade of " + grade + " is a " + letterGrade);
    }
}
