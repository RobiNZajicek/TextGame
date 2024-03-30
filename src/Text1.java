/**
 * Represents a Text1 that displays the introductory text and sets the premise for the game.
 */
public class Text1 {
    private String playerName;

    /**
     * Constructs a Text1 object with the given player name.
     *
     * @param playerName the name of the player
     */
    public Text1(String playerName) {
        this.playerName = playerName;
    }

    /**
     * Displays the introductory text and sets the premise for the game.
     */
    public void displayText() {
        int delayBetweenWords = 3000;
        int delay = 25;
        String text1 = TerminalColor.formatBlue("Vítejte ve světě starobylého království Novaterra, kde se odehrává naše dobrodružná textová hra! \n" +
                     "Novaterra trpí hrůzovládou Krále Démonů Heredura - mocné bytosti, která létá na hřbetě obrovského draka a rozsévá strach a zkázu po celém království.\n" +
                      "Je na Vás, statečný dobrodruhu, aby jste se vydali na nebezpečnou cestu a porazili Heredura a jeho temného draka a tím obnovili mír and klid v království Novaterra.\n"+
                "Vaše cesta začíná v malé vesničce, kde se shromažďují poslední odvážlivci, ochotní najít Heredura a vyzvat ho na souboj.\n");

        for (int i = 0; i < text1.length(); i++) {
            System.out.print(text1.charAt(i));
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