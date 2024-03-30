/**
 * Represents a menu for choosing directions and actions in the game.
 */
public class ChoiceDir {

        /**
         * Displays the menu with available choices.
         */
        public void showMenu() {
                System.out.println(TerminalColor.formatGreen("\n" + "     Zvolte směr:"));
                System.out.println(TerminalColor.formatGreen("____________________"));
                System.out.println(TerminalColor.formatYellow("|1. | Sever        |"));
                System.out.println(TerminalColor.formatYellow("|___|______________|"));
                System.out.println(TerminalColor.formatRed("|2. | Jih          |"));
                System.out.println(TerminalColor.formatRed("|___|______________|"));
                System.out.println(TerminalColor.formatBlue("|3. | Východ       |"));
                System.out.println(TerminalColor.formatBlue("|___|______________|"));
                System.out.println(TerminalColor.formatOrange("|4. | Západ        |"));
                System.out.println(TerminalColor.formatOrange("|___|______________|"));
                System.out.println(TerminalColor.formatYellow("|5. | Statistiky   |"));
                System.out.println(TerminalColor.formatYellow("|___|______________|"));
                System.out.println(TerminalColor.formatRed("|6. | Inventar     |"));
                System.out.println(TerminalColor.formatRed("|___|______________|"));
                System.out.println(TerminalColor.formatBlue("|7. | Vypit potion |"));
                System.out.println(TerminalColor.formatBlue("|___|______________|"));
                System.out.println(TerminalColor.formatOrange("|8. | Konec Hry    |"));
                System.out.println(TerminalColor.formatOrange("____________________"));
        }
}