package Chap15;

import java.util.Random;

public class Chap15Part4 {
    public static void main(String[] args) {
        final int rows = 5;
        final int columns = 5;
        Random rand = new Random(System.currentTimeMillis());
        int[] [] numbers = new int[rows][columns];
        for(int r = 0; r < rows; r ++)
            for(int c = 0; c < columns; c ++) {
                numbers[r][c] = rand.nextInt(101);
            }
        int[][] nums = {{10, 20, 30, 40}, {20, 30, 40, 50}, {30, 40, 50, 60}};
    }
}
