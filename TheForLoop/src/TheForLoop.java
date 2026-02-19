
public class TheForLoop {

    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for (int rate = 2; rate <= 5; rate++) {
            System.out.println(calculateInterest(10000, rate));
        }

        for (double rate = 7.5; rate <= 10; rate = rate + 0.25) {
            System.out.println(calculateInterest(100, rate));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
