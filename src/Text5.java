public class Text5 {
    private String playerName;

    public Text5(String playerName) {
        this.playerName = playerName;
    }

    public void displayText() {
        int delayBetweenWords = 3000;
        int delay = 25;

        String text5 = (TerminalColor.formatBlue(("Boj byl zuřivý, ale " + playerName + " neuhnul ani na krok.\n" +
                "A nakonec, mečem zabořeným hluboko do srdce temného Krále Démonů, dosáhl " + playerName + " svého cíle.\n" +
                "Vysílený, ale plný pocitu zadostiučinění, se vrátil zpět do království Novaterra, kde ho lidé vítali jako hrdinu, který přinesl zemi svobodu a mír.\n" +
                "\n" +
                "Tak skončila epická cesta " + playerName + " a, statečného bojovníka, který se vydal pomstít smrt své vyvolené, Agnes.\n" +
                "Porazil všechny poskoky Krále Démonů i jeho samotného. \n" +
                "Jeho příběh se stal legendou, která bude vyprávěna po generace a dodá naději v srdcích všech, kteří touží po svobodě a spravedlnosti.")));
        for (int i = 0; i < text5.length(); i++) {
            System.out.print(text5.charAt(i));
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
        System.out.println(" ");
        System.out.println("Gratuluji hraci" + playerName + "! Dosáhli jste cíle a získali jste vítězství!");
    }
}
