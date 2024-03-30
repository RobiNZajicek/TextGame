import java.util.ArrayList;
import java.util.Random;

public class Item {

    private String name;
    private Rarity rarity;
    private int healthBonus;
    private int damageBonus;
    private int intelligenceBonus;
    private int strengthBonus;

    private int luckBonus;

    public int getLuckBonus() {
        return luckBonus;
    }

    public void setLuckBonus(int luckBonus) {
        this.luckBonus = luckBonus;
    }

    public Item(String name, Rarity rarity, int healthBonus, int damageBonus, int intelligenceBonus, int strengthBonus, int luckBonus) {
        this.name = name;
        this.rarity = rarity;
        this.healthBonus = healthBonus;
        this.damageBonus = damageBonus;
        this.intelligenceBonus = intelligenceBonus;
        this.strengthBonus = strengthBonus;
        this.luckBonus = luckBonus;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public void setHealthBonus(int healthBonus) {
        this.healthBonus = healthBonus;
    }

    public void setDamageBonus(int damageBonus) {
        this.damageBonus = damageBonus;
    }

    public void setIntelligenceBonus(int intelligenceBonus) {
        this.intelligenceBonus = intelligenceBonus;
    }

    public void setStrengthBonus(int strengthBonus) {
        this.strengthBonus = strengthBonus;
    }



    public String getName() {
        return name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public int getHealthBonus() {
        return healthBonus;
    }

    public int getDamageBonus() {
        return damageBonus;
    }

    public int getIntelligenceBonus() {
        return intelligenceBonus;
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }

    @Override
    public String toString() {
        return rarity + " " + name;
    }

    public int getModifiedStat() {
        // Check if the item can be taken

        // Calculate modified stat based on rarity
        switch (rarity) {
            case COMMON:
                return damageBonus;
            case RARE:
                return (int) (damageBonus * 1.5);
            case EPIC:
                return damageBonus * 2;
            case LEGENDARY:
                return (int) (damageBonus * 2.5);
            default:
                throw new IllegalArgumentException("Ne");

        }
    }

        }




enum Rarity {
    COMMON,
    RARE,
    EPIC,
    LEGENDARY
}

