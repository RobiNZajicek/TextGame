/**
 * Represents a Text3sm that displays the next part of the story and provides instructions to find the demon king.
 */
public class Text3sm {
    private String playerName;

    /**
     * Constructs a Text3sm object with the given player name.
     *
     * @param playerName the name of the player
     */
    public Text3sm(String playerName) {
        this.playerName = playerName;
    }

    /**
     * Displays the next part of the story and provides instructions to find the demon king.
     */
    public void displayText() {
        int delayBetweenWords = 3000;
        int delay = 25;

        String text3sm = (TerminalColor.formatBlue("našel si detailní mapu Novaterry, která tě zavede k Heredurovi. Konečně můžeš pomstít svou vyvolenou, Agnes. Z mapy si vyvodil,že máš pokračovat na sever.\n" +
                "===>Vydej se na sever. Pokračuj tímto směrem, dokud nenarazíš na studnu<=!"));
        for (int i = 0; i < text3sm.length(); i++) {
            System.out.print(text3sm.charAt(i));
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
