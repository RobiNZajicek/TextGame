import java.util.*;



/**
 *Start building project
 */
class TextAdventureGame {
    /**
     * Varibles 1.Direction 2.tutorial 3.player 4.lib import scanner
     * 5.lib import random 6.class inventory 7.playerName ..........
     */
    private  ChoiceDir choiceDir = new ChoiceDir();




    private  Tutorial tutorial = new Tutorial();
    private Player player;
    private Scanner scanner;
    private boolean isGameRunning;
    private Random random;
    private List<Item> inventory;
    private String playerName;
    boolean validChoice = false;
    private World world;
    private Room currentRoom;




    private int countEndGame;


    Player p1 = new Player("Sunge",1,1,1,1,1);
    int delay = 25;

    int delayBetweenWords = 3000;

    private Text4 text4 = new Text4(playerName);

    public TextAdventureGame() {
        this.player = player;
        scanner = new Scanner(System.in);
        random = new Random();
        inventory = new ArrayList<>();
        this.playerName = playerName;
        isGameRunning = true;
    }

    /**
     * starting tutorial (you can skip him or read him
     * Function that creating player with race class what they want to play
     * player name
     */
    private void createPlayer() {
        Text1 text1 = new Text1(playerName);
        text1.displayText();
        System.out.println(" ");
        System.out.println(TerminalColor.formatGreen(("Muzete si precist tutorial staci napsat 1 jestli ne napis 2 (Doporucuji)")));
        int Tutorial;
        String skip;
        while (!validChoice) {
            try {
                Tutorial = scanner.nextInt();
                switch (Tutorial) {
                    case 1:
                        tutorial.startTutorial();
                        validChoice=true;
                        break;
                    case 2:
                        validChoice=true;
                        break;

                    default:
                        skip = ("Unexpected value: " + Tutorial);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Neplatná volba. Zvolte znovu.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }
        Text2 text2 = new Text2(playerName);
        text2.displayText();
        RaseChoice raseChoices = new RaseChoice();
        raseChoices.PickRase();
        String raseName = null;
        int raseChoice;
        int raseplusStats;
        validChoice = false;
        /**
         * picking race its doesn't better It's just for entertainment
         */
        while (!validChoice) {
            try {
                raseChoice = scanner.nextInt();

                switch (raseChoice) {
                    case 1:
                        raseName = "Clovek";
                        validChoice = true;
                        break;
                    case 2:
                        raseName = "Elf";
                        validChoice = true;
                        break;
                    case 3:
                        raseName = "Trpalik";
                        validChoice = true;
                        break;
                    case 4:
                        raseName = "Ork";
                        validChoice = true;
                        break;
                    case 5:
                        raseName = "Temny elf";
                        validChoice = true;
                        break;
                    case 6:
                        raseName = "Mutant";
                        validChoice = true;
                        break;
                    case 7:
                        raseName = "Hobit";
                        validChoice = true;
                        break;
                    default:
                        System.out.println("Neplatná volba. Zvolte znovu.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Neplatná volba. Zvolte znovu.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }

        ClassChoice classChoice = new ClassChoice();
        classChoice.PickClass();
        String characterName = null;
        validChoice = false;
        int characterChoice;
        int health = 100;
        int damage = 10;
        int intelligence = 10;
        int strength = 10;
        int luck = 10;
        /**
         * picking bettwen classes this is very important the game depends on with class do you want
         * every class is different
         */
        while (!validChoice) {
            try {
                characterChoice = scanner.nextInt();
                switch (characterChoice) {

                    case 1:
                        characterName = "Bojovník";
                        health = 625;
                        damage = 42;
                        intelligence = 5;
                        strength = 10;
                        luck = 10;
                        validChoice = true;
                        break;
                    case 2:
                        characterName = "Mág";
                        health = 380;
                        damage = 75;
                        intelligence = 25;
                        strength = 5;
                        luck = 30;
                        validChoice = true;
                        break;
                    case 3:
                        characterName = "Lučištník";
                        health = 520;
                        damage = 52;
                        intelligence = 10;
                        strength = 8;
                        luck = 12;
                        validChoice = true;
                        break;
                    case 4:
                        characterName = "Druid";
                        health = 475;
                        damage = 48;
                        intelligence = 12;
                        strength = 8;
                        luck = 12;
                        validChoice = true;
                        break;
                    case 5:
                        characterName = "Bard";
                        health = 495;
                        damage = 48;
                        intelligence = 10;
                        strength = 8;
                        luck = 15;
                        validChoice = true;
                        break;
                    case 6:
                        characterName = "Temný mág";
                        health = 480;
                        damage = 2005;
                        intelligence = 28;
                        strength = 12;
                        luck = 10;
                        validChoice = true;
                        break;
                    case 7:
                        characterName = "Zaklínač";
                        health = 560;
                        damage = 85;
                        intelligence = 28;
                        strength = 22;
                        luck = 2;
                        validChoice = true;
                        break;
                    case 8:
                        characterName = "Mechanikus";
                        health = 500;
                        damage = 14;
                        intelligence = 58;
                        strength = 12;
                        luck = 12;
                        validChoice = true;
                        break;
                    default:
                        characterName = "Neznámá postava";
                        break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Neplatná volba. Zvolte znovu.");
                scanner.nextLine();
            }
        }
        /**
         * here you write name of you avatar you charakter
         */
        System.out.println(TerminalColor.formatGreen("Zadejte jméno postavy:"));
        playerName = scanner.next();
        Text3 text3 = new Text3(playerName);
        text3.displayText();
        /**
         * this is big block of  player stats like his name his choose his class and  rase
         * also here is your character stats depends on you class
         * your stats are going to upgrade evry time you came from dungeon or something like this
         */
        player = new Player(playerName, health, damage, intelligence, strength, luck);
        System.out.println(TerminalColor.formatGreen("\n  Vítejte, " + "" + raseName + " " + characterName + " " + playerName + "!"));
        System.out.println(TerminalColor.formatGreen("_______________________|"));

        System.out.println(TerminalColor.formatYellow("|Vaše statistiky:      |"));
        System.out.println(TerminalColor.formatYellow("|______________________|"));
        System.out.println(TerminalColor.formatRed("|Zdraví: " + player.getHealth() + "            |"));
        System.out.println(TerminalColor.formatRed("|______________________|"));
        System.out.println(TerminalColor.formatBlue("|Poškození: " + player.getDamage() + "         |"));
        System.out.println(TerminalColor.formatBlue("|______________________|"));
        System.out.println(TerminalColor.formatOrange("|Inteligence: " + player.getIntelligence() + "       |"));
        System.out.println(TerminalColor.formatOrange("|______________________|"));
        System.out.println(TerminalColor.formatYellow("|Síla: " + player.getStrength() + "               |"));
        System.out.println(TerminalColor.formatYellow("|______________________|"));
        System.out.println(TerminalColor.formatRed("|Štěstí: " + player.getLuck() + "            |"));
        System.out.println(TerminalColor.formatRed("|______________________|"));

    }



    /**
     * in this matod you are creating an enemy
     * every monster has random stats I can also make them as objects but the code is allready very long its like this
     * @return
     */


    /**
     *fight funtion- in this fuction you can choose bettwen attcks you want to use
     * every attack has different and you attck depents on your stats
     * @param enemy
     */
    public void battle(Enemy enemy) {
        System.out.println(TerminalColor.formatYellow("Narazili jste na nepřítele: " + enemy.getName()));
        System.out.println(TerminalColor.formatRed(""));
        System.out.println(TerminalColor.formatOrange("Bojujete!"));
        while (!player.isDefeated() && !enemy.isDefeated()) {
            Attack attack = new Attack();
            attack.Attack();
            int actionChoice;
            Action playerAction;
            playerAction = null;
            Action enemyAction = null;

            boolean validChoice = false;

            while (!validChoice) {
                try {
                    actionChoice = scanner.nextInt();
                    /**
                     * here you can choose attack
                     */
                    switch (actionChoice) {
                        case 1:
                            int lightAttackDamage = player.getDamage() / 2;
                            playerAction = new Action("Lehký útok", lightAttackDamage, 0, 0);
                            enemyAction = new Action("Útok", enemy.getDamage(), 0, 0);
                            validChoice = true;
                            break;
                        case 2:
                            playerAction = new Action("Obrana", 0, player.getStrength(), 0);
                            enemyAction = new Action("Útok", enemy.getDamage(), 0, 0);
                            validChoice = true;
                            break;
                        case 3:
                            System.out.println(random.nextDouble() + player.getLuck() / 100);
                            if (random.nextDouble() + player.getLuck() / 100 <= 0.85) {
                                playerAction = new Action("Ultimaní schopnost", 0, 0, 0); // Trefa se nezdařila, žádné poškození
                                System.out.println(TerminalColor.formatGreen(player.getName() + " se netrefil!"));
                            } else {
                                int heavyAttackDamage = player.getDamage() * 5;
                                playerAction = new Action("Ultimaní schopnost", heavyAttackDamage, 0, 0);
                            }
                            enemyAction = new Action("Útok", enemy.getDamage(), 0, 0);
                            validChoice = true;
                            break;
                        case 4:
                            if (random.nextDouble() + player.getLuck() / 100 <= 0.5) {
                                playerAction = new Action("Těžký útok", 0, 0, 0); // Trefa se nezdařila, žádné poškození
                                System.out.println(TerminalColor.formatGreen(player.getName() + " se netrefil!"));
                            } else {
                                int heavyAttackDamage = player.getDamage() * 2;
                                playerAction = new Action("Těžký útok", heavyAttackDamage, 0, 0);
                            }
                            enemyAction = new Action("Útok", enemy.getDamage(), 0, 0);
                            validChoice = true;
                            break;
                        case 5:
                            int healAmount = (player.getIntelligence() / 2);
                            System.out.println(healAmount);
                            playerAction = new Action("Léčení", 0, 0, healAmount);
                            enemyAction = new Action("Útok", enemy.getDamage(), 0, 0);
                            player.setHealth(player.getHealth() + healAmount);
                            validChoice = true;
                            break;
                        case 6:
                            if (player.getHealth() >= 10) {
                                player.setHealth(player.getHealth() - 10);
                                int modifiedDamage = player.getDamage() + 15;
                                playerAction = new Action("Exchange", modifiedDamage, 0, 0);
                            } else {
                                System.out.println(TerminalColor.formatGreen("Nemáte dostatek životů pro tuto akci!"));
                                playerAction = new Action("Neplatná akce", 0, 0, 0);
                            }
                            enemyAction = new Action("Útok", enemy.getDamage(), 0, 0);
                            validChoice = true;
                            break;
                        default:
                            System.out.println("Neplatná volba. Zvolte znovu.");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Neplatná volba. Zvolte znovu.");
                    scanner.nextLine(); // Clear the invalid input from the scanner
                }
            }
            assert !(playerAction == null);
            int playerDamage = playerAction.getDamageModifier() - enemyAction.getDefenseModifier();
            int enemyDamage = enemyAction.getDamageModifier() - playerAction.getDefenseModifier();

            if (playerDamage < 0) {
                playerDamage = 0;
            }
            if (enemyDamage < 0) {
                enemyDamage = 0;
            }
            int dodgeRoll = random.nextInt(100);
            if (dodgeRoll <= playerAction.getDodgeChance()) {
                enemyDamage = 0;
            }
            player.takeDamage(enemyDamage);
            enemy.takeDamage(playerDamage);
            System.out.println(TerminalColor.formatGreen("_____________________________"));
            System.out.println(TerminalColor.formatGreen(" " + player.getName() + " provedl akci: " + playerAction.getName()));
            System.out.println(TerminalColor.formatYellow("_____________________________"));
            System.out.println(TerminalColor.formatYellow(" Způsobil poškození: " + playerDamage));
            System.out.println(TerminalColor.formatRed("_____________________________"));
            System.out.println(TerminalColor.formatRed(" " + enemy.getName() + " provedl akci: " + enemyAction.getName()));
            System.out.println(TerminalColor.formatBlue("_____________________________"));
            System.out.println(TerminalColor.formatBlue(" Nepřítel zaútočil a ubral vám: " + enemyDamage));
            System.out.println(TerminalColor.formatOrange("_____________________________"));
        }
        if (player.isDefeated() ) {
            System.out.println(TerminalColor.formatGreen(player.getName() + " Byl poražen. Umíráš.......... "));
            isGameRunning = false;// nastavení příznaku běhu hry na false
            countEndGame=countEndGame-20;
            endGame();
        } else {
            System.out.println(TerminalColor.formatGreen("Dokázal jste porazit nepřítele " + enemy.getName()));

            Item item = ItemsNames.generateRandomItem();
//            if (shouldPrintStatistics()) {}
            addItemToInventory(item);
            player.incrementStats();
            player.applyItemBonuses(item);
        }
    }


    /**
     * that you stats with you can watch all the time
     * you call this to manu
     */


    private void showPlayerStats() {
        System.out.println(TerminalColor.formatGreen("=== STATISTIKY-hrace " + playerName + " ==="));
        System.out.println(TerminalColor.formatGreen("Zdraví: " + player.getHealth()));
        System.out.println(TerminalColor.formatGreen("Poškození: " + player.getDamage()));
        System.out.println(TerminalColor.formatGreen("Inteligence: " + player.getIntelligence()));
        System.out.println(TerminalColor.formatGreen("Síla: " + player.getStrength()));
        System.out.println(TerminalColor.formatGreen("Štěstí: " + player.getLuck()));
        System.out.println(TerminalColor.formatGreen("==================="));
    }

    private int numPotions = 3;

    /**
     * this you inventory all the items are in there
     */
    private void showInventory() {
        System.out.println(TerminalColor.formatGreen("Inventář:"));
        if (inventory.isEmpty()) {
            System.out.println(TerminalColor.formatGreen("Inventář je prázdný."));
        } else {
            for (Item item : inventory) {
                System.out.println(item.getName() + " " + item.getRarity());
            }
        }
        System.out.println();
    }

    /**
     * function drink potion - this function when its caled it is going to heal you 15 hp
     * you have 3 potion whole game
     */
    private void drinkPotion() {
        if (numPotions > 0) {
            // Remove one potion from the inventory
            numPotions--;
            // Increase the player's health by 15
            player.setHealth(player.getHealth() + 15);
            System.out.println("Vypili jste potion! Vaše bonusové zdraví bylo zvýšeno o 15.");
            System.out.println("Aktuální zdraví: " + player.getHealth());
        } else {
            System.out.println("V inventáři nemáte žádný potion.");
        }
    }

    /**
     * generete and item witch give you bonus stats
     * @return
     */



    /**
     * every item has its own rarity with gives you some bonuses
     * @return
     */
    private Rarity getRandomRarity() {
        Rarity[] rarities = Rarity.values();
        int randomIndex = random.nextInt(rarities.length);
        return rarities[randomIndex];
    }

    /**
     * avety item you get goes to invemtory
     * @param item
     */
    private void addItemToInventory(Item item) {
        inventory.add(item);
        System.out.println();
        System.out.println();
        System.out.println(TerminalColor.formatGreen("|Získali jste předmět: " + item.getName() + " |"));
        System.out.println(TerminalColor.formatGreen("|_____________________________|"));
        System.out.println(TerminalColor.formatYellow("|Item mam raritu:" + item.getRarity() + "       |"));
        System.out.println(TerminalColor.formatYellow("|_____________________________|"));
        System.out.println(TerminalColor.formatRed("|Bonusové statistiky předmětu:|"));
        System.out.println(TerminalColor.formatRed("|_____________________________|"));
        System.out.println(TerminalColor.formatBlue("|Zdraví: +" + item.getHealthBonus() + "                   |"));
        System.out.println(TerminalColor.formatBlue("|_____________________________|"));
        System.out.println(TerminalColor.formatOrange("|Poškození: +" + item.getModifiedStat() + "                |"));
        System.out.println(TerminalColor.formatOrange("|_____________________________|"));
        System.out.println(TerminalColor.formatYellow("|Inteligence: +" + item.getIntelligenceBonus() + "              | "));
        System.out.println(TerminalColor.formatYellow("|_____________________________|"));
        System.out.println(TerminalColor.formatRed("|Síla: +" + item.getStrengthBonus() + "                     |"));
        System.out.println(TerminalColor.formatRed("|_____________________________|"));
        System.out.println(TerminalColor.formatBlue("|Štěstí: +" + item.getLuckBonus() + "                   |"));
        System.out.println(TerminalColor.formatBlue("_______________________________"));
        System.out.println();
    }

    /**
     * this is boss fight its little diffrent then to other fights
     */
    private void bossFight() {
        TextBossPartOne textBossPartOne = new TextBossPartOne(playerName);
        textBossPartOne.displayText();
        // Create a Boss enemy
        Enemy Drake = new Enemy("Temnřý drak", 200, 20, 15, 120, 15);
        Enemy Boss = new Enemy("Král démonů-Heredur", 250, 35, 55, 100, 10);
        // Start the battle with the boss
        battle(Drake);
        TextBossPartTwo textBossPartTwo = new TextBossPartTwo(playerName);
        textBossPartTwo.displayText();
        battle(Drake);
        battle(Boss);
    }

    public void endGame() {
        isGameRunning = false;
        scanner.close();
    }

    /**
     * play button with is valling in main this is starting whole game
     *
     */
    public Room move(Room currentRoom, String direction) {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom != null) {
            System.out.println("Jdes na sever " + direction);
            return nextRoom;
        } else {
            System.out.println("Sem nemuzes kvuli zdrzeni si nasel nepritele.");
            return currentRoom;
        }
    }
    public void setWorld(World world) {
        this.world = world;
        // Initialize currentRoom to the starting room, assuming room 0 is the starting room
        this.currentRoom = world.getRoom(0);
    }
    public void play() {

        createPlayer();
        boolean gameOver = false; currentRoom = world.getRoom(0); // Start in room 0

        while (!gameOver && isGameRunning) {
            choiceDir.showMenu();
            int directionChoice = 0;

            boolean validChoice = false;
            while (!validChoice) {
                try {
                    directionChoice = scanner.nextInt();
                    /**
                     * here you are choosing direction witch you wnat to go
                     * and other thinsg you wnat to do
                     */
                        switch (directionChoice) {
                            case 1:
                            currentRoom = move(currentRoom, "north");
                            countEndGame = countEndGame + 1;
                            validChoice = true;

                            break;
                            case 2:
                                currentRoom = move(currentRoom, "south");
                                countEndGame = countEndGame + 1;
                                validChoice = true;

                                break;
                            case 3:
                                currentRoom = move(currentRoom, "east");
                                countEndGame = countEndGame + 1;
                                validChoice = true;

                                break;
                            case 4:
                                currentRoom = move(currentRoom, "west");
                                countEndGame = countEndGame + 1;
                                validChoice = true;
                        case 5:
                            showPlayerStats();
                            break;
                        case 6:
                            showInventory();
                            break;
                        case 7:
                            drinkPotion();
                            break;
                        case 8:
                            gameOver=true;
                            endGame();
                            validChoice = true;
                            break;
                        default:
                            System.out.println(TerminalColor.formatGreen("Neznámý směr. Zvolte znovu."));
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Neplatná volba. Zvolte znovu.");
                    scanner.nextLine(); // Clear the invalid input from the scanner
                }
            }

            if (gameOver) {
                break;
            }

            Enemy enemy = EnemyNames.generateRandomEnemy();
            battle(enemy);
            /**
             * story with code
             */
            if (player.isDefeated()) {
                System.out.println(TerminalColor.formatGreen("Byli jste poraženi. Konec hry."));
                isGameRunning=false;
            }else if (countEndGame == 3 && countEndGame <= 11 && enemy.isDefeated() && player.getHealth()>0) {
                Scanner scanner = new Scanner(System.in);

                // Create a Player instance
                Player player = new Player("Adventurer", 100, 10, 5, 5, 5);

                // Create a GameCharacter instance
                GameCharacter character = new GameCharacter("Merlin", "Enchanted Forest", true);

                // Call the meetCharacter method and pass the Player object
                character.meetCharacter(player);
                continue;
            } else if (countEndGame == 6 && countEndGame <= 11 && directionChoice == 3 && enemy.isDefeated() && player.getHealth()>0) {
                Text3sm text3sm = new Text3sm(playerName);
                text3sm.displayText();
            } else if (countEndGame >= 8 && countEndGame <= 13 && directionChoice == 1 && enemy.isDefeated()&&player.getHealth()>0) {
                Text4 text4 = new Text4(playerName);
                text4.displayText();
                // boss fight
            } else if (countEndGame >= 10 && directionChoice == 4 && enemy.isDefeated()) {
                bossFight();
                Text5 text5 = new Text5(playerName);

                gameOver = true;
            }
        }
    }
}
