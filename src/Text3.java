/**
 * Represents a Text3 that displays the next part of the story and sets the stage for the hero's journey to find the demon king.
 */
public class Text3 {
    private String playerName;

    /**
     * Constructs a Text3 object with the given player name.
     *
     * @param playerName the name of the player
     */
    public Text3(String playerName) {
        this.playerName = playerName;
    }

    /**
     * Displays the next part of the story and sets the stage for the hero's journey to find the demon king.
     */
    public void displayText() {

        int delayBetweenWords = 3000;
        int delay = 25;

        String text3 = (TerminalColor.formatBlue(playerName + " , statečný hrdina, se vydal na svou osamocenou cestu v pochmurném království Novaterra. Srdce mu vzplálo plamenem pomsty poté, co Heredurovi poskoci zavraždili lásku jeho života, sličnou švadlenu Agnes.  \n" +
                ", která byla jeho vyvolenou. Přísahal, že se pomstí Heredurovi i všem jeho démonským poskokům. \n" +
                "S nabroušeným mečem a srdcem plným odhodlání započíná svou cestu v temném hvozdu. Pěšina je lemovaná rozrostlými stromy a příslib právě započatého dobrodružství je ve vzduchu.\n"
                + playerName + " prošel mezi jejich větvemi s opatrností, vědom si přítomnosti nebezpečí a pastí, které démoni mohli nalíčit. Vydal se cestou, která byla jen málo viditelná, a doufal, že najde stopy \n" + "" +
                ", které ho přivedou ke Králi Démonů."));
        for (int i = 0; i < text3.length(); i++) {
            System.out.print(text3.charAt(i));
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
