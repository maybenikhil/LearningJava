package Chap16;

/* do {
    set of statements;
    } while (rel exp);
 */

public class Chap16Part3 {
    public static void main(String[] args) {
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number < 11);
    }
}
