package Chap8;

import java.util.Scanner;

public class Chap8Part3 {
    public static void main(String[] args) {
        int hoursWorked;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours worked: ");
        hoursWorked = input.nextInt();
        double rate = 25.00;
        double pay;
        if (hoursWorked > 40) {
            pay = (40 * rate) + ((hoursWorked - 40) * (rate * 1.5));
        } else {
            pay = hoursWorked * rate;
        }
        System.out.println("The pay is: " + pay);
    }
}
