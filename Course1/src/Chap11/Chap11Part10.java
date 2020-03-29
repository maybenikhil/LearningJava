package Chap11;

import java.util.ArrayList;
import java.util.Random;

public class Chap11Part10 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = buildAL(10);
        int max = maximum(numbers);
        display(numbers);
        System.out.println("The maximum value is " + numbers.get(max));
    }

    static void display(ArrayList arr) {
        for (Object o : arr)
            System.out.print(o + " ");
        System.out.println();
    }

    static ArrayList<Integer> buildAL(int num) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < num; i++) {
            arr.add(rand.nextInt(101));
        }
        return arr;
    }

    static int maximum(ArrayList<Integer> arr) {
        int maxPos = 0;
        for (int i = 0; i < arr.size(); i++)
            if (arr.get(i) > arr.get(maxPos))
                maxPos = i;
        return maxPos;
    }
}
