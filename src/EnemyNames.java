import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnemyNames {

    public static final String[] ENEMY_NAMES = {
            "Goblin", "Demon", "Vodní drak", "Elf", "Ork", "Trpaslík", "Murlok", "Zeman",
            "ohnivý drak", "Kentaur", "zlobr", "Zlodej", "najemny zoldner", "Harpie", "Ankheg",
            "Cambion", "Chimera", "Death Knight", "Temny demon", "Ledovy demon", "imp",
            "Allosaurus", "Triceraptos", "Triceraptos", "Dracolich", "Prastary Cerny drak",
            "Prastary Modry drak", "Prastary zeleny drak", "Prastary Cervney Drak", "Prastary bily drak",
            "Prastary zlaty Drak", "Bronzovy drak", "Kameny obr", "MIMIC", "Sahugain", "Ohnivi had",
            "Salamandr", "upir", "VLkodlak", "Zombie", "Kostlivec"
    };

    public static List<Enemy> createEnemiesList() {
        List<Enemy> enemiesList = new ArrayList<>(1);

        for (String enemyName : ENEMY_NAMES) {
            Enemy enemy = createEnemyByName(enemyName);
            enemiesList.add(enemy);
        }

        return enemiesList;
    }
    public static Enemy generateRandomEnemy() {
        Random random = new Random();
        String[] itemNames = ENEMY_NAMES;
        int randomIndex = random.nextInt(itemNames.length);
        String enemyName = itemNames[randomIndex];
        return createEnemyByName(enemyName);
    }
    private static Enemy createEnemyByName(String name) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        switch (name.trim()) {
            case "Goblin":
                return new Enemy(name, 30, 10, 5, 5, 5);
            case "Demon":
                return new Enemy(name, 50, 20, 10, 10, 10);
            case "Vodní drak":
                return new Enemy(name, 80, 30, 15, 15, 15);
            case "Elf":
                return new Enemy(name, 40, 15, 10, 10, 10);
            case "Ork":
                return new Enemy(name, 60, 25, 10, 15, 5);
            case "Trpaslík":
                return new Enemy(name, 35, 12, 8, 8, 8);
            case "Murlok":
                return new Enemy(name, 45, 18, 12, 5, 10);
            case "Zeman":
                return new Enemy(name, 55, 22, 15, 8, 12);
            case "ohnivý drak":
                if (randomNumber < 10) { // 10% chance
                    return new Enemy(name, 200, 50, 20, 20, 20);
                } else {
                    return new Enemy(name, 100, 20, 10, 10, 10); // Default enemy stats
                }
            case "Kentaur":
                if (randomNumber < 15) { // 15% chance
                    return new Enemy(name, 150, 40, 15, 15, 15);
                } else {
                    return new Enemy(name, 100, 20, 10, 10, 10); // Default enemy stats
                }
            case "zlobr":
                return new Enemy(name, 70, 30, 18, 10, 10);
            case "Zlodej":
                return new Enemy(name, 45, 15, 25, 5, 15);
            case "najemny zoldner":
                return new Enemy(name, 65, 35, 8, 20, 7);
            case "Harpie":
                return new Enemy(name, 55, 25, 12, 15, 10);
            case "Ankheg":
                return new Enemy(name, 75, 40, 10, 18, 7);
            case "Cambion":
                return new Enemy(name, 90, 45, 20, 25, 10);
            case "Chimera":
                return new Enemy(name, 120, 60, 25, 30, 15);
            case "Death Knight":
                return new Enemy(name, 150, 70, 30, 35, 20);
            case "Temny demon":
                return new Enemy(name, 180, 80, 35, 40, 25);
            case "Ledovy demon":
                return new Enemy(name, 160, 75, 40, 30, 30);
            case "imp":
                return new Enemy(name, 20, 5, 5, 5, 5);
            case "Allosaurus":
                return new Enemy(name, 100, 40, 15, 20, 10);
            case "Triceraptos":
                return new Enemy(name, 120, 50, 20, 25, 15);
            case "Dracolich":
                if (randomNumber < 5) { // 5% chance
                    return new Enemy(name, 250, 60, 30, 30, 30);
                } else {
                    return new Enemy(name, 100, 20, 10, 10, 10); // Default enemy stats
                }
            case "Prastary Cerny drak":
                return new Enemy(name, 180, 70, 35, 35, 20);
            case "Prastary Modry drak":
                return new Enemy(name, 200, 75, 40, 40, 25);
            case "Prastary zeleny drak":
                return new Enemy(name, 220, 80, 45, 45, 30);
            case "Prastary Cervney Drak":
                return new Enemy(name, 240, 85, 50, 50, 35);
            case "Prastary bily drak":
                return new Enemy(name, 260, 90, 55, 55, 40);
            case "Prastary zlaty Drak":
                return new Enemy(name, 280, 95, 60, 60, 45);
            case "Bronzovy drak":
                return new Enemy(name, 150, 60, 25, 30, 20);
            case "Kameny obr":
                return new Enemy(name, 140, 55, 20, 25, 25);
            case "MIMIC":
                return new Enemy(name, 80, 30, 10, 15, 15);
            case "Sahugain":
                return new Enemy(name, 60, 20, 15, 5, 10);
            case "Ohnivi had":
                return new Enemy(name, 40, 15, 20, 5, 20);
            case "Salamandr":
                return new Enemy(name, 70, 25, 25, 10, 25);
            case "upir":
                return new Enemy(name, 90, 35, 30, 15, 30);
            case "VLkodlak":
                return new Enemy(name, 110, 40, 35, 20, 35);
            case "Zombie":
                return new Enemy(name, 50, 10, 5, 10, 5);
            case "Kostlivec":
                return new Enemy(name, 60, 15, 10, 15, 10);
            default:
                return new Enemy(name, 100, 20, 10, 10, 10); // Default enemy stats
        }
    }
}
