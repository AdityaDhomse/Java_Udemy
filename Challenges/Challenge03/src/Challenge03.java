
public class Challenge03 {

    public static void main(String[] args) throws Exception {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Aditya", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Rahul", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Oorjeet", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Omkar", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Piyush", highScorePosition);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into " + position
                + " on the high score list."
        );
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        }
        return 4;

    }

}
