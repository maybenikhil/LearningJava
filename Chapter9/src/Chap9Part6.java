import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Chap9Part6 {
    public static void main(String[] args) {
//        String space = "there are spaces in this string";
//        int numSpaces = 0;
//        for (int i = 0; i < space.length(); i++) {
//            if (space.charAt(i) != ' ')
//                continue;
//            numSpaces++;
//        }
//        System.out.println("There are " + numSpaces + " spaces.");
        Scanner input = new Scanner(System.in);
        int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        int guess;
        while (true) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            if (guess == randomNum) {
                System.out.println("Nice!");
                break;
            } else if (guess >= randomNum)
                System.out.println("Too High!");
            else if (guess <= randomNum)
                System.out.println("Too Low!");
        }

    }
}
