public class GameSettings {
    private static GameSettings instance;

    private int volume;
    private String difficulty;

    // Private constructor
    private GameSettings() {
        // default settings
        this.volume = 5;
        this.difficulty = "Normal";
        System.out.println("GameSettings initialized\n");
    }

    // Public method to get the only instance
    public static GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }

    // Setters and Getters
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void displaySettings() {
        System.out.println("Volume: " + volume);
        System.out.println("Difficulty: " + difficulty + "\n");
    }
}
