package Chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chap11Part9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palindrome;
        ArrayList<String> pal = new ArrayList<String>();
        System.out.print("Enter a word: ");
        palindrome = input.nextLine();
        buildAL(pal, palindrome);
        if (isPalindrome(pal)) {
            System.out.println(palindrome + " is a palindrome");
        } else {
            System.out.println(palindrome + " is not a palindrome");
        }
    }

    static void display(ArrayList arr) {
        for (Object o : arr)
            System.out.print(o + " ");
        System.out.println();
    }

    static void buildAL(ArrayList<String> pword, String word) {
        for (int i = 0; i < word.length(); i++)
            pword.add(word.charAt(i) + "");
    }

    static boolean isPalindrome(ArrayList<String> word) {
        ArrayList<String> rword = new ArrayList<String>();
        rword.addAll(word);
        Collections.reverse(word);
        for (int i = 0; i < word.size(); i++)
            if (!rword.get(i).equals(word.get(i)))
                return false;
        return true;
    }
}
