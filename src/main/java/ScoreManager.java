// Logic inside ScoreManager.java (Modified)

public class ScoreManager {

    private static ScoreManager instance;
    private int currentScore = 0;
    private static int highScore = 0; // NEW FIELD for high score

    private ScoreManager() {
        // ...
    }

    public static ScoreManager getInstance() {
        // ... (existing logic)
        if (instance == null) {
            instance = new ScoreManager();
        }
        return instance;
    }

    // NEW METHOD
    public void addScore(int points) {
        this.currentScore += points;
    }

    public int getCurrentScore() {
        return this.currentScore;
    }

    // NEW METHOD: Update the high score when the game ends
    public void updateHighScore() {
        if (this.currentScore > highScore) {
            highScore = this.currentScore;
        }
        this.currentScore = 0; // Reset for next game
    }
}