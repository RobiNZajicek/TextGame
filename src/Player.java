import java.util.ArrayList;

public class Player {
    private String name;
    private int health;
    private int damage;
    private int intelligence;
    private int strength;
    private int luck;
    private int maxHealth;
    private boolean wc = false;

    ArrayList<Item> avitems = new ArrayList<>();
    ArrayList<Item> pickable = new ArrayList<>();
    ArrayList<Item> inv = new ArrayList<>();

    public Player(String name, int health, int damage, int intelligence, int strength, int luck) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.intelligence = intelligence;
        this.strength = strength;
        this.luck = luck;
        this.maxHealth = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public int getLuck() {
        return luck;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isDefeated() {
        return health <= 0;
    }

    public void incrementStats() {
        health += 10;
        damage += 5;
        intelligence += 2;
        strength += 3;
        luck += 2;
    }

    public void heal(int amount) {
        health += amount;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    public void applyItemBonuses(Item item) {
        // Implement the logic to apply the item bonuses to the player
    }
}
