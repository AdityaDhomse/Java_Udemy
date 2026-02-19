
public class Challenge08 {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 10; i <= 50; i++) {
            if(isPrime(i)) {
                System.out.println("Number " + i + " is a prime number.");
                count++;
                if (count == 3) {
                    break;
                }
            } 
        }

        System.out.println("Total prime numbers: " + count); 

    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int i = 2; i < wholeNumber; i++) {
            if (wholeNumber % i == 0) {
                return false;
            }
        }

        return true;
    }
}
