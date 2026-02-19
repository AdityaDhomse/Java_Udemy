
public class Challenge05 {

    public static void main(String[] args) {

        char variable = 'A';

        switch (variable) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.err.println("Easy");
                break;
            default:
                System.out.println("Not Found");
                break;
        }

    }
}
