import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemsNames {
    public static final String[] ITEMS_NAMES = {
            "Jednoruční meč", "Luk", "Prsten", "Potion", "Kniha znalosti 1",
            "Hůl", "Kopí", "Kniha znalosti 2", "Kniha znalosti 3", "Magická koule", "Obouruční meč",
            "Dýka", "Helma", "Kouzelnický prach", "Zbroj", "Amulet", "Magický artefakt", "Krunýř", "Kladivo",
            "Štít", "Magický prsten", "Magický amulet", "Kouzelná hůl"
    };

    public static List<Item> createItemsList() {
        List<Item> itemsList = new ArrayList<>();

        for (String itemName : ITEMS_NAMES) {
            Rarity rarity = getRandomRarity();
            Item item = createItemByName(itemName, rarity);
            itemsList.add(item);
        }

        return itemsList;
    }

    public static Item generateRandomItem() {
        Random random = new Random();
        String[] itemNames = ITEMS_NAMES;
        int randomIndex = random.nextInt(itemNames.length);
        String itemName = itemNames[randomIndex];
        Rarity rarity = getRandomRarity();
        return createItemByName(itemName, rarity);
    }

    private static Rarity getRandomRarity() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        if (randomNumber < 50) {
            return Rarity.COMMON;
        } else if (randomNumber < 75) {
            return Rarity.RARE;
        } else if (randomNumber < 90) {
            return Rarity.EPIC;
        } else {
            return Rarity.LEGENDARY;
        }
    }

    public static boolean shouldItemBeTaken() {
        Random random = new Random();
        int chance = random.nextInt(100);
        return chance >= 90; // 10% chance the item cannot be taken
    }

    public static Item createItemByName(String name, Rarity rarity) {

        switch (name.trim()) {
            case "Jednoruční meč":
                return new Item(name, rarity, 0, 20, 0, 0, 0);
            case "Luk":
                return new Item(name, rarity, 0, 15, 0, 0, 5);
            case "Prsten":
                return new Item(name, rarity, 0, 0, 10, 0, 5);
            case "Potion":
                return new Item(name, rarity, 20, 0, 0, 0, 0);
            case "Kniha znalosti 1":
                return new Item(name, rarity, 0, 0, 15, 0, 0);
            case "Hůl":
                return new Item(name, rarity, 0, 0, 10, 0, 5);
            case "Kopí":
                return new Item(name, rarity, 0, 25, 0, 5, 0);
            case "Kniha znalosti 2":
                return new Item(name, rarity, 0, 0, 20, 0, 0);
            case "Kniha znalosti 3":
                return new Item(name, rarity, 0, 0, 25, 0, 0);
            case "Magická koule":
                return new Item(name, rarity, 0, 10, 15, 0, 0);
            case "Obouruční meč":
                return new Item(name, rarity, 0, 40, 0, 10, 0);
            case "Dýka":
                return new Item(name, rarity, 0, 10, 0, 0, 10);
            case "Helma":
                return new Item(name, rarity, 10, 0, 0, 5, 0);
            case "Kouzelnický prach":
                return new Item(name, rarity, 0, 0, 20, 0, 0);
            case "Zbroj":
                return new Item(name, rarity, 30, 0, 0, 10, 0);
            case "Amulet":
                return new Item(name, rarity, 0, 0, 10, 5, 5);
            case "Magický artefakt":
                return new Item(name, rarity, 0, 30, 30, 0, 0);
            case "Krunýř":
                return new Item(name, rarity, 40, 0, 0, 20, 0);
            case "Kladivo":
                return new Item(name, rarity, 0, 35, 0, 0, 5);
            case "Štít":
                return new Item(name, rarity, 20, 0, 0, 15, 0);
            case "Magický prsten":
                return new Item(name, rarity, 0, 0, 20, 0, 10);
            case "Magický amulet":
                return new Item(name, rarity, 0, 0, 15, 10, 5);
            case "Kouzelná hůl":
                return new Item(name, rarity, 0, 20, 30, 0, 0);
            default:
                throw new IllegalArgumentException("Unknown item: " + name);

        }
    }
}
/**
 * Represents the rarity levels of an enemy.
 */
