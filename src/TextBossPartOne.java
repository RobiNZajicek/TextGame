/**
 * Represents a TextBossPartOne that displays introductory text related to a boss battle.
 */
public class TextBossPartOne {
    private String playerName;

    /**
     * Constructs a TextBossPartOne object with the given player name.
     *
     * @param playerName the name of the player
     */
    public TextBossPartOne(String playerName) {
        this.playerName = playerName;
    }

    /**
     * Displays the introductory boss battle text.
     */
    public void displayText() {
        int delayBetweenWords = 3000;
        int delay = 25;

        String bossText = (TerminalColor.formatBlue("Dokázal ses probojovat ke Králi démonů a nyní máš příležitost pomstít Agnes a zachránit celé království Novaterra.\n" +
                "První ale musíš porazit jeho draka."));
        for (int i = 0; i < bossText.length(); i++) {
            System.out.print(bossText.charAt(i));
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