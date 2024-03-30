/**
 * Represents a Text2 that displays the instructions for selecting a character class and describes the challenges the player will face in the game.
 */
public class Text2 {
    private String playerName;

    /**
     * Constructs a Text2 object with the given player name.
     *
     * @param playerName the name of the player
     */
    public Text2(String playerName) {
        this.playerName = playerName;
    }

    /**
     * Displays the instructions for selecting a character class and describes the challenges the player will face in the game.
     */
    public void displayText() {
        int delayBetweenWords = 3000;
        int delay = 25;
        String text2 = TerminalColor.formatBlue("Vyberete si svoji specializaci: zda budete statečný rytíř, mocný kouzelník atd.\n" +
        "Každý hrdina má své jedinečné schopnosti a dovednosti, které Vám pomohou v překonávání překážek a boji proti Králi Démonů.\n" +
                "Při svém putování se budete setkávat s různými tvory - od ohavných netvorů až po mocné kreatůry.\n" +
                "Budete muset využít své dovednosti a schopnosti v boji s nimi a získání důležitých informací, které Vás přiblíží k nalezení Heredura.");

        for (int i = 0; i < text2.length(); i++) {
            System.out.print(text2.charAt(i));
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