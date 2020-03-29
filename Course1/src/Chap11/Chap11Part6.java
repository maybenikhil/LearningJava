package Chap11;

import java.util.ArrayList;
import java.util.Random;

public class Chap11Part6 {
    public static void main(String[] args) {
        Random rand = new Random(System.currentTimeMillis());
        int number;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            number = rand.nextInt(101);
            numbers.add(number);
        }
        display(numbers);
    }

    static void display(ArrayList arr) {
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
