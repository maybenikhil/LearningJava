public class Chap9Part4 {
    public static void main(String[] args) {
        double bal = 5000;
        double rate = 1.02;
        int years = 0;
        while (bal < 100000){
            bal *= rate;
            years++;
        }
        System.out.println("It will take " + years + " years to reach 100,000");
    }
}
