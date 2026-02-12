package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

import java.sql.SQLOutput;

/**
 * Example concrete implementation of a Character.
 *
 * This is provided as a reference to help you get started.
 * Study this implementation, then create similar classes for Mage, Archer, etc.
 *
 * Notice:
 * - How attributes are initialized
 * - How methods are implemented
 * - The structure you should follow for other character types
 *
 * TODO: Create similar implementations for:
 * - Mage (high mana/intelligence, low health/strength)
 * - Archer (balanced stats, ranged combat)
 * - (Optional) Additional classes: Rogue, Paladin, etc.
 */
public class Warrior implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;
    private Weapon weapon = null;
    private Armor armor = null;

    // TODO: Add fields for equipped weapon and armor
    // Think: Should Warrior know about its equipment?


    public Warrior(String name) {
        this.name = name;
        // Warrior stats: high HP and STR, low mana and INT
        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;
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
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses [BERSERKER RAGE] -> Strength temporarily increased!");
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
