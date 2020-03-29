package Chap5;

public class DateTest {
    public static void main(String[] args) {
        Date today = new Date(3, 14, 2020);
        Date tomorrow = new Date(3, 2020);
        System.out.println("Today Is: " + today.toString());
        System.out.println("Tomorrow Is: " + tomorrow.toString());
        tomorrow.setDay(15);
        System.out.println("Tomorrow Is: " + tomorrow.toString());
    }
}
