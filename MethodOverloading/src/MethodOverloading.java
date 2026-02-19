public class MethodOverloading {
    public static void main(String[] args) throws Exception {
        
        int newScore = calculateScore("Aditya", 500);
        System.out.println("New score is " + newScore);

        calculateScore(77);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Player unnamed scored " + score + " points.");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("No player, No score");
    }
}
