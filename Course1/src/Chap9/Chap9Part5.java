package Chap9;

public class Chap9Part5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(sum += i);
        }
    }
}
