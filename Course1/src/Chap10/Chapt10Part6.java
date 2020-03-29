package Chap10;

public class Chapt10Part6 {
    public static void main(String[] args) {
        int number = 12;
        System.out.println("Number squared " + square(number));
        System.out.println("Original number " + number);
    }

    static int square(int num) {
        num *= num;
        System.out.println("num in square method: " + num);
        return num;
    }
}
