
public class Method {

    public static void main(String[] args) throws Exception {
        calculateScore(true, 1000, 5, 50);
        calculateScore(true, 10000, 8, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Final Score: " + finalScore);
        }
    }
}
