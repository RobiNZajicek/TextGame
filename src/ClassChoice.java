/**
 * Represents a ClassChoice menu in a game.
 */
public class ClassChoice {
    /**
     * Displays the ClassChoice menu options.
     */
    public void PickClass() {
        System.out.println(TerminalColor.formatGreen("   Vyber si clasu    "));
        System.out.println(TerminalColor.formatGreen("______________________"));
        System.out.println(TerminalColor.formatYellow("|1. |  Bojovník      |"));
        System.out.println(TerminalColor.formatYellow("|___|________________|"));
        System.out.println(TerminalColor.formatRed("|2. |  Mág           |"));
        System.out.println(TerminalColor.formatRed("|___|________________|"));
        System.out.println(TerminalColor.formatBlue("|3. |  Lučištník     |"));
        System.out.println(TerminalColor.formatBlue("|___|________________|"));
        System.out.println(TerminalColor.formatOrange("|4. |  Druid         |"));
        System.out.println(TerminalColor.formatOrange("|___|________________|"));
        System.out.println(TerminalColor.formatYellow("|6. |  Temný mág     |"));
        System.out.println(TerminalColor.formatYellow("|___|________________|"));
        System.out.println(TerminalColor.formatRed("|7. |  Zaklinac      |"));
        System.out.println(TerminalColor.formatRed("|___|________________|"));
        System.out.println(TerminalColor.formatBlue("|8. |  Mechanikus    |"));
        System.out.println(TerminalColor.formatBlue("|___|________________|"));
        System.out.println(TerminalColor.formatOrange("|9.|  Goblin         |"));
        System.out.println(TerminalColor.formatOrange("----------------------"));
    }
}