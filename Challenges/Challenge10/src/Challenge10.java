
public class Challenge10 {

    public static void main(String[] args) {
        int start = 5;
        int countEven = 0;
        int countOdd = 0;
        int end = 100;
        while (start <= end) {
            if (isEvenNumber(start)) {
                System.out.println(start);
                countEven++;
            } else {
                countOdd++;
            }
            if(countEven == 5) {
                break;
            }
            start++;
        }
        
        System.out.printf("Even Count: %d", countEven);
        System.out.printf("\nOdd Count: %d", countOdd);
    }

    public static boolean isEvenNumber(int a) {
        return (a % 2) == 0;
    }
}
