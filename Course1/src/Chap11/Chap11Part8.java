package Chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Chap11Part8 {
    public static void main(String[] args) {
        Random rand = new Random(System.currentTimeMillis());
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++)
            numbers.add(rand.nextInt(101));
        display(numbers);
        Collections.sort(numbers);
        display(numbers);
    }

    static void display(ArrayList arr) {
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
