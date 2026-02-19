public class Challenge01 {
    public static void main(String[] args) {
        double firstValue = 20.00;
        double secondValue = 80.00;
        double thirdValue = (firstValue + secondValue) * 100.00;

        double remainder = thirdValue % 50.00;

        boolean isZero = remainder == 0;

        System.out.println(isZero);

        if(!isZero)
            System.out.println("Got some remainder");
    }
}
