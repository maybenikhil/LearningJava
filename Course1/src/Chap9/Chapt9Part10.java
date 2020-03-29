package Chap9;

import java.util.Scanner;

public class Chapt9Part10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        int numVowels = 0;
        for(int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == 'a') numVowels++;
            else if (sentence.charAt(i) == 'e') numVowels++;
            else if (sentence.charAt(i) == 'i') numVowels++;
            else if (sentence.charAt(i) == 'o') numVowels++;
            else if (sentence.charAt(i) == 'u') numVowels++;
        }
        System.out.println("There was " + numVowels + " vowels in that");
    }
}
