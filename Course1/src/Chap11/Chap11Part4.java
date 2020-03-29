package Chap11;

import java.util.ArrayList;

public class Chap11Part4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i < 11; i++) {
            numbers.add(i);
        }
        int total = 0;
        for (Integer number : numbers) total += number;
        System.out.println("The sum of 1 to 10 is: " + total);
        System.out.println("First element: " + numbers.get(0));
        System.out.println("Last element: " + numbers.get(numbers.size() - 1));
    }
}
