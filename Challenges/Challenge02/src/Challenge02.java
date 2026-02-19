public class Challenge02 {
    public static void main(String[] args) throws Exception {
        
        boolean gameOver = true;
        int score, levelCompleted, bonus;

        
        score = 10000; 
        levelCompleted = 8;
        bonus = 200;
        
        int finalScore = score;
        
        if (gameOver == true) {
             finalScore += (levelCompleted * bonus);
            System.out.println("Final Score: " + finalScore);
        }
    }
}
