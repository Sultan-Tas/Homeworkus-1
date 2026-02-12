package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Mage implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;
    private Weapon weapon = null;
    private Armor armor = null;

    // TODO: Add fields for equipped weapon and armor

    public Mage(String name) {
        this.name = name;
        // Mage stats: low HP and STR, high mana and INT
        this.health = 90;
        this.mana = 200;
        this.strength = 25;
        this.intelligence = 80;
    }

    // TODO: Implement methods from Character interface
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getIntelligence() {
        return intelligence;
    }

    public void displayStats() {
        System.out.println("=== " + name + " (Mage) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses [MOMENT OF CLARITY] -> INT Greatly increased for next move!");
    }



    // TODO: Add equipment-related methods
    @Override
    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    @Override
    public void equipArmor(Armor armor){
        this.armor = armor;
    }

    @Override
    public void checkEquipment(){
        System.out.println("\tCurrent Equipment\n" +
                "Weapon:[" + ((weapon == null)?"Empty" :weapon.getWeaponInfo()) + "]\n" +
                "Armor:[" + ((armor == null)?"Empty":armor.getArmorInfo()) + "]\n");
    }

    @Override
    public void unequipWeapon() {
        this.weapon = null;
    }

    @Override
    public void unequipArmor() {
        this.armor = null;
    }
}
