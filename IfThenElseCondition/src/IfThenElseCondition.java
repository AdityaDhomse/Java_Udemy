public class IfThenElseCondition {
    public static void main(String[] args) throws Exception {
        
        int score = 5000;

        if (score < 5000) {
            System.out.println("You scored less than 5000.");
        } else {
            System.out.println("You scored highest points.\nCongratulations.");
        }
        
        if (score < 5000 && score > 3000) {
            System.out.println("Your scored more than 60%.");
        } else if (score <= 3000 && score > 1500) {
            System.out.println("You barely passed.");
        } else if (score == 5000) {
            System.out.println("You passed with full marks.");
        } else {
            System.out.println("You Failed");
        }
    }
}
