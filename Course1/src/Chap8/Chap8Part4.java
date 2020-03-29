package Chap8;

import java.util.Scanner;

public class Chap8Part4 {
    public static void main(String[] args) {
        int grade;
        String letterGrade = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a grade: ");
        grade = input.nextInt();
        if (grade >= 90) {
            if (grade >= 95) {
                letterGrade = "A+";
            }
            if (grade >= 93 && grade < 95) {
                letterGrade = "A";
            } else {
                letterGrade = "A-";
            }
            System.out.println("Your grade was " + letterGrade);
        } else {
            System.out.println("Sorry, you didn't make an A.");
        }
    }
}
