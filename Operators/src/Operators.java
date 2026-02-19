public class Operators {
    public static void main(String[] args) throws Exception {
        int firstScore = 100;
        int secondScore = 200;
        
        // Logical AND
        if ((firstScore > 50) && (secondScore < 300))
            System.out.println("True");
        
        // Logical OR
        if ((firstScore > 150) || (secondScore < 150))
            System.out.println("True");
        
        // Ternary Operator
        String isPass = firstScore == 100 ? "Passed" : "Failed";

        System.out.println(isPass);
    }
}
