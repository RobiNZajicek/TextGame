/**
 * Represents a TextBossPartTwo that displays text related to a boss battle.
 */
public class TextBossPartTwo {
    private String playerName;

    /**
     * Constructs a TextBossPartTwo object with the given player name.
     *
     * @param playerName the name of the player
     */
    public TextBossPartTwo(String playerName) {
        this.playerName = playerName;
    }

    /**
     * Displays the boss battle text.
     */
    public void displayText() {
        int delayBetweenWords = 3000;
        int delay = 25;
        String textHeredur = (TerminalColor.formatBlue("Dokázal si zkolit draka. Teď už zbývá jen on sám. Zaútoč na Heredura"));
        for (int i = 0; i < textHeredur.length(); i++) {
            System.out.print(textHeredur.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(delayBetweenWords);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}