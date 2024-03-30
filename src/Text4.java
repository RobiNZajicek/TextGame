/**
 * Represents a Text4 that displays the next part of the story and instructions to find and defeat the demon king.
 */
public class Text4 {
    private String playerName;

    /**
     * Constructs a Text4 object with the given player name.
     *
     * @param playerName the name of the player
     */
    public Text4(String playerName) {
        this.playerName = playerName;
    }

    /**
     * Displays the next part of the story and instructions.
     */
    public void displayText() {
        int delayBetweenWords = 3000;
        int delay = 25;
        String text4 = (TerminalColor.formatBlue("Mapa tě zavedla ke studně. Zde se zjevil temný přízrak, který ti sdělil, že pevnost démonů se ukrývá v útrobách temného temné jeskyně v moři.\n "
                + playerName + " se vydal po nebezpečné cestě až k pobřeží, kde se setkal s majestátními vlnami a pichlavým větrem.\n" +
                "Dohořela pochodeň, která ti osvětlovala cestu přes skalnaté břehy a propastné zákoutí.\n" +
                "Jediným způsobem, jak pokračovat dál, je proniknout hluboko pod hladinu moře, do světa, kde démoni kují své temné plány.\n" +
                "S odhodláním v očích se " + playerName + " ponořil do studené vody. Stálo ho to mnoho síly a boje s podivnými bytostmi,\n" +
                "ale nakonec se dostal na druhou stranu a vyplaval na povrch do světa demonů.\n" +
                "Před ním se roztahovala rozlehlá pláž a za ní se tyčil strašidelný hrad - sídlo jednoho z démonů.\n" +
                "S mečem pevně sevřeným v ruce a srdcem bouřícím vztekem se " + playerName + " připravil na konečný souboj.\n" +
                "Prošel zdmi hradu a porážel všechny démony, kteří mu stáli v cestě.\n" +
                "Každý krok, který učinil, ho přiblížil k místu, kde se nacházel Král Démonů, který prováděl své nekalé plány.\n" +
                "Nakonec, ve chvíli, kdy zlý král démonů odhalil svou pravou podobu, se " + playerName + " postavil tváří v tvář temnému nepříteli.\n" +
                "Se srdcem plném síly a odhodlanosti se pokusil použít veškeré své schopnosti a dovednosti k porážce Krále Démonů.\n" +
                "Král Demonů ale začal zbaběle utíka. Utekl a schoval se do katokomb hradu. \n" + " " +
                "!--> Tvým úkolem je ho v katakombách najit a okamžitě ho zabít, ale pozor - v katakombách mohou být monstra <--!"));

        for (int i = 0; i < text4.length(); i++) {
            System.out.print(text4.charAt(i));
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
