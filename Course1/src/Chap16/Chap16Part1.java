package Chap16;

/* switch (integral exp) {
    case (exp) :
        statements;
        break;
    default :
        statements;
 */

import java.util.Scanner;

public class Chap16Part1 {
    public static void main(String[] args) {
        char letter;
        String letterGrade;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        letterGrade = input.nextLine();
        letter = letterGrade.charAt(0);
        switch (letter) {
            case 'A':
                System.out.println("90-100");
                break;
            case 'B':
                System.out.println("80-89");
                break;
            case 'C':
                System.out.println("70-79");
                break;
            case 'D':
                System.out.println("60-69");
                break;
            default:
                System.out.println("Below 60");
        }
    }
}
