/**
 * Represents a RaseChoice menu in a game.
 */
public class RaseChoice {
    /**
     * Displays the RaseChoice menu options.
     */
    public void PickRase() {
        System.out.println(TerminalColor.formatGreen("\n   Vyber si rasu    "));
        System.out.println(TerminalColor.formatGreen("___________________"));
        System.out.println(TerminalColor.formatYellow("|1. |  Clovek      |"));
        System.out.println(TerminalColor.formatYellow("|___|______________|"));
        System.out.println(TerminalColor.formatRed("|2. |  Elf         |"));
        System.out.println(TerminalColor.formatRed("|___|______________|"));
        System.out.println(TerminalColor.formatBlue("|3. |  Trpaslik    |"));
        System.out.println(TerminalColor.formatBlue("|___|______________|"));
        System.out.println(TerminalColor.formatOrange("|4. |  Ork         |"));
        System.out.println(TerminalColor.formatOrange("|___|______________|"));
        System.out.println(TerminalColor.formatYellow("|5. |  Temný elf   |"));
        System.out.println(TerminalColor.formatYellow("|___|______________|"));
        System.out.println(TerminalColor.formatRed("|6. |  Mutant      |"));
        System.out.println(TerminalColor.formatRed("|___|______________|"));
        System.out.println(TerminalColor.formatBlue("|7. |  Hobit       |"));
        System.out.println(TerminalColor.formatBlue("___________________|"));
    }
}