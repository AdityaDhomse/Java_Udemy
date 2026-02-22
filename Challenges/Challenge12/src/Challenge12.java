
import java.util.Scanner;


public class Challenge12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while(counter <= 5) {
            System.out.print("Enter number #" + counter + ": ");
            String Number = sc.nextLine();
            try {
                int number = Integer.parseInt(Number);
                counter++;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Data");
            }
        }

        System.out.println("Sum: " + sum);

    }
}
