public class Main {
    public static void main(String[] args) {
        GameSettings settings1 = GameSettings.getInstance();
        settings1.displaySettings();

        // Change settings using settings1
        settings1.setVolume(8);
        settings1.setDifficulty("Hard");

        // Access settings from another reference
        GameSettings settings2 = GameSettings.getInstance();
        settings2.displaySettings(); // should reflect changes made above

        if (settings1 == settings2) {
            System.out.println(" Both refer to the same GameSettings instance\n");
        }
    }
}
