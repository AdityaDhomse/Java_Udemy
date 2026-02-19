public class Challenge07 {
    public static void main(String[] args) throws Exception {
        
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(5));
        System.out.println(isPrime(8));

    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for(int i = 2; i < wholeNumber; i++) {
            if(wholeNumber % i == 0) {
                return false;
            }
        }

        return true;
    }
}
