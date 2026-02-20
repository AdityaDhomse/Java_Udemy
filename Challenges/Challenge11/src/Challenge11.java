
public class Challenge11 {

    public static void main(String[] args) {
        System.out.println(sumDigits(99998));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;

        return sum;
    }
}
