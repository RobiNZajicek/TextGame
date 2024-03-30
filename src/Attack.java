/**
 * Represents an Attack menu in a game.
 */
public class Attack {
    /**
     * Displays the Attack menu options.
     */
    public void Attack() {
        System.out.println();
        /**
         * Choose Action
         */
        System.out.println(TerminalColor.formatGreen("   Zvolte akci:"));
        /**
        *Light attack
         */
        System.out.println(TerminalColor.formatGreen("___________________"));
        System.out.println(TerminalColor.formatYellow("|1. |Lehký útok   |"));
        /**
         *Deffend
         */
        System.out.println(TerminalColor.formatYellow("|___|_____________|"));
        System.out.println(TerminalColor.formatRed("|2. |Obrana       |"));
        /**
         *Ultina
         */
        System.out.println(TerminalColor.formatRed("|___|_____________|"));
        System.out.println(TerminalColor.formatBlue("|3. |Ultina       |"));
        /**
         *Hard attack
         */
        System.out.println(TerminalColor.formatBlue("|___|_____________|"));
        System.out.println(TerminalColor.formatOrange("|4. |Těžký útok   |"));
        /**
         *heal by inteligence
         */
        System.out.println(TerminalColor.formatOrange("|___|_____________|"));

        System.out.println(TerminalColor.formatYellow("|5. |Léčení       |"));
        /**
         *livestall
         */
        System.out.println(TerminalColor.formatYellow("|___|_____________|"));
        System.out.println(TerminalColor.formatRed("|6. |Exchange     |"));
        System.out.println(TerminalColor.formatRed("|___|_____________|"));
    }
}