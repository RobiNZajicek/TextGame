import java.util.Scanner;

public class GameCharacter {
    private String name;
    private String location;
    private boolean isFriendly;

    public GameCharacter(String name, String location, boolean isFriendly) {
        this.name = name;
        this.location = location;
        this.isFriendly = isFriendly;
    }

    public void meetCharacter(Player player) {
        System.out.println("Potkáváš " + name + " v " + location + ".");

        if (isFriendly) {
            System.out.println(name + ": Ahoj! Jsem " + name + ". Rád tě poznávám!");

            Scanner scanner = new Scanner(System.in);
            System.out.println(name + ": Mám pro tebe úkol. Chceš si ho poslechnout?");
            System.out.println("1. Ano, jsem zvědavý.");
            System.out.println("2. Ne, mám plno práce.");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    taskDialogue(scanner, player);
                    break;
                case 2:
                    System.out.println(name + ": Rozumím. Možná příště!");
                    break;
                default:
                    System.out.println("Neplatná volba. " + name + " vypadá zmateně a odejde.");
            }
        } else {
            System.out.println(name + ": Nemám čas na cizince. Nech mě být!");
        }
    }

    private void taskDialogue(Scanner scanner, Player player) {
        System.out.println(name + ": Potřebuji tvou pomoc s problémem v tomto lese.");
        System.out.println(name + ": Nedaleko odtud na jih je mocná věž čaroděje, ale je hlídána divokými bytostmi.");
        System.out.println(name + ": Chceš mi pomoci dostat se k věži?");
        System.out.println("1. Ano, pomůžu.");
        System.out.println("2. Ne, zní to nebezpečně.");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                System.out.println(name + ": Skvělé! Vyrazme směrem k věži.");
                System.out.println(name + ": Ale buď opatrný, můžeme narazit na nebezpečné bytosti na cestě.");
                System.out.println(name + ": Tady, vezmi si tuhle mapu, abychom měli navigaci.");

                System.out.println("Dostáváš mapu od " + name + ".");
                journeyToTower(scanner, player);
                break;
            case 2:
                System.out.println(name + ": Chápu. Není to pro každého.");
                System.out.println(name + ": Možná se naše cesty zkříží znovu.");
                break;
            default:
                System.out.println("Neplatná volba. " + name + " vypadá zklamaně.");
        }
    }

    private void journeyToTower(Scanner scanner, Player player) {
        System.out.println("Když společně se " + name + " vydáváš do lesa, narazíte na rozcestí.");
        System.out.println("Kterou cestou se vydáš?");
        System.out.println("1. Jdi po klikaté cestě mezi starými stromy.");
        System.out.println("2. Odváž se do úzké, temné stezky skrz hustý houští.");
        System.out.println("3. Vystoupíš po strmé, skalnaté cestě nahoru na kopec.");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                System.out.println("Rozhodl ses jít po klikaté cestě.");
                System.out.println("Jak kráčíš, slyšíš šustění v keřích.");
                System.out.println("Pokračuj");

                // Simulace obětování životů
                player.takeDamage(5);
                System.out.println("Obětoval jsi 5 životů.");



                // Získání předmětu po úspěšném boji

                System.out.println("Ziskal si Item pro"+name);
                // Bonus k poškození
                player.setDamage(player.getDamage() + 50);
                System.out.println("Tvé poškození bylo zvýšeno o 50!");

                break;
            case 2:
                System.out.println("Rozhodl ses odvážit do úzké, temné stezky.");
                System.out.println("Houští ti škrábe kůži, když se prokličkuješ.");
                System.out.println("V temnotě slyšíš vrčení.");

                System.out.println(name + ": Buď opatrný!");
                System.out.println("Ziskal si Item pro"+name);
                player.takeDamage(15);
                System.out.println("Obětoval jsi 15 životů.");


                player.setDamage(player.getDamage() + 50);
                System.out.println("Tvé poškození bylo zvýšeno o 50!");

                break;
            case 3:
                System.out.println("Rozhodl ses vystoupat po strmé, skalnaté cestě.");
                System.out.println("Skály jsou kluzké a cesta je nebezpečná.");
                System.out.println("Narazil si na past ");
                TextAdventureGame textAdventureGame =new TextAdventureGame();
                textAdventureGame.endGame();
                player.setHealth(-10);
                break;
            default:
                System.out.println("Neplatná volba. " + name + " vypadá zmateně.");

        }
    }

}
