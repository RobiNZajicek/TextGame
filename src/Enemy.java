import java.util.ArrayList;
import java.util.List;

/**
 * Represents an enemy in the game.
 */
class Enemy {
    private String name;
    private int health;
    private int damage;
    private int intelligence;
    private int strength;
    private int luck;

    /**
     * Constructs an enemy with the specified attributes.
     *
     * @param name         the name of the enemy
     * @param health       the health points of the enemy
     * @param damage       the damage points of the enemy
     * @param intelligence the intelligence points of the enemy
     * @param strength     the strength points of the enemy
     * @param luck         the luck points of the enemy
     */
    public Enemy(String name, int health, int damage, int intelligence, int strength, int luck) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.intelligence = intelligence;
        this.strength = strength;
        this.luck = luck;
    }

    /**
     * Returns the name of the enemy.
     *
     * @return the name of the enemy
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the health points of the enemy.
     *
     * @return the health points of the enemy
     */
    public int getHealth() {
        return health;
    }

    /**
     * Returns the damage points of the enemy.
     *
     * @return the damage points of the enemy
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Inflicts damage to the enemy.
     *
     * @param amount the amount of damage to be inflicted
     */
    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    /**
     * Checks if the enemy has been defeated (health is zero or below).
     *
     * @return true if the enemy is defeated, false otherwise
     */
    public boolean isDefeated() {
        return health <= 0;
    }
}